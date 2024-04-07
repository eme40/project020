package com.SQD20.SQD20.LIVEPROJECT.domain.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDetails {

    private String message;
    private String debugMessage;
    private HttpStatus status;
    private String dateTime;
}
