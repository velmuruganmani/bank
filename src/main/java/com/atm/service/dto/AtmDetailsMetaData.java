package com.atm.service.dto;

import lombok.Value;

@Value
public class AtmDetailsMetaData {


    String Agreement;

    String LastUpdated;

    String License;

    String TermsOfUse;

    Long TotalResults;

}
