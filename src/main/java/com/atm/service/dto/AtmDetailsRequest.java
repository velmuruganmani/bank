package com.atm.service.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AtmDetailsRequest {

    @NotNull(message = "Please provide URL")
    @NotEmpty(message = "URL should not be empty")
    private final String url;

    @NotNull(message = "Please provide Identification")
    @NotBlank(message = "Identification should not be empty")
    private final String identification;
}
