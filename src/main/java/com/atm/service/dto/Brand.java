package com.atm.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Brand {

    @JsonProperty("ATM")
    List<ATM> atm;

    @JsonProperty("BrandName")
    String brandName;
}
