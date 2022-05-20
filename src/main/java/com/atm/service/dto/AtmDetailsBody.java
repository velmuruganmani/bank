package com.atm.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AtmDetailsBody {

    @JsonProperty("Brand")
    List<Brand> brand;
}
