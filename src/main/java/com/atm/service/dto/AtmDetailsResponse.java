package com.atm.service.dto;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;


@Builder
@Jacksonized
@Value
@RequiredArgsConstructor
public class AtmDetailsResponse {
    String identification;
    ATM atm;
}
