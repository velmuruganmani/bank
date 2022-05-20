package com.atm.service.service;

import com.atm.service.dto.ATM;
import com.atm.service.dto.AtmDetails;
import com.atm.service.dto.AtmDetailsRequest;
import com.atm.service.dto.AtmDetailsResponse;
import com.atm.service.exception.ATMDetailsNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class AtmsServiceImpl implements AtmsService{
    private static final Logger LOGGER = LoggerFactory.getLogger(AtmsServiceImpl.class);

    @Override
    public AtmDetailsResponse fetchAtmsDetails(final AtmDetailsRequest atmDetailsRequest) {
        final String identification = atmDetailsRequest.getIdentification();
        final AtmDetails atmDetails = fetchAtmDetails(atmDetailsRequest.getUrl());
        LOGGER.info("AtmsServiceImpl:fetchAtmDetails Fetched ATM details from get-atms-2.2 api");
        LOGGER.info(String.format("AtmsServiceImpl:fetchAtmDetails Filtering ATM details for the requested identification : %s", identification));
        final Optional<ATM> atmOptional =
                atmDetails.getData().stream().flatMap(data -> data.getBrand().stream())
                                             .flatMap(brand -> brand.getAtm().stream())
                                                     .filter(atm -> atm.getIdentification()
                                                             .equalsIgnoreCase(identification))
                        .findFirst();
        final ATM atm;
        if(!atmOptional.isPresent()) {
            LOGGER.error(String.format("AtmsServiceImpl:fetchAtmDetails ATM details not found for the requested identification : %s",
                    identification));
            throw new ATMDetailsNotFoundException("Atm details not found");
        }
        else {
            LOGGER.info(String.format("AtmsServiceImpl:fetchAtmDetails ATM details found for the requested identification : %s",
                    identification));
            atm = atmOptional.get();
        }
        return AtmDetailsResponse.builder().atm(atm).identification(identification).build();
    }

    private AtmDetails fetchAtmDetails(final String url){
        LOGGER.info("AtmsServiceImpl:fetchAtmDetails Fetching ATM details from get-atms-2.2 api");
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, AtmDetails.class);
    }
}
