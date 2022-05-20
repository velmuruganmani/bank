package com.atm.service.service;

import com.atm.service.dto.AtmDetailsRequest;
import com.atm.service.dto.AtmDetailsResponse;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AtmsService {

    AtmDetailsResponse fetchAtmsDetails(final AtmDetailsRequest atmDetailsRequest) throws JsonProcessingException;
}
