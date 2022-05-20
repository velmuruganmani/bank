package com.atm.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PostalAddress {

    @JsonProperty("AddressLine")
    private List<String> addressLine;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("CountrySubDivision")
    private List<String> countrySubDivision;

    @JsonProperty("PostCode")
    private String postCode;

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("TownName")
    private String townName;

}
