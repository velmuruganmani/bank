package com.atm.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Location {

    @JsonProperty("PostalAddress")
    private PostalAddress postalAddress;

}
