package com.atm.service.controller;

import com.atm.service.dto.AtmDetailsRequest;
import com.atm.service.dto.AtmDetailsResponse;
import com.atm.service.service.AtmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AtmsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AtmsController.class);

    @Autowired
    private AtmsService atmsService;

    @GetMapping(value = "/atm-details", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AtmDetailsResponse> getATMs(@RequestBody @Validated final AtmDetailsRequest atmDetailsRequest) throws Exception{
        LOGGER.info(String.format("AtmsController:getATMs Received request to get ATM details: %s", atmDetailsRequest.getIdentification()));
       final AtmDetailsResponse response =  atmsService.fetchAtmsDetails(atmDetailsRequest);
        LOGGER.info(String.format("AtmsController:getATMs sending ATM details for the requested identification: %s",
                atmDetailsRequest.getIdentification()));
       return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
