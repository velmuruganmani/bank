package com.atm.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class ErrorResponse {

        private Date timestamp;
        private String errorMessage;
        private List<String> requestDescription;

}
