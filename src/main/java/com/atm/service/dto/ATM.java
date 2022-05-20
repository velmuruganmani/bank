package com.atm.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ATM {

    @JsonProperty("Identification")
    private String identification;

    @JsonProperty("Location")
    private Location location;

    @JsonProperty("SupportedCurrencies")
    private List<String> supportedCurrencies;
}
