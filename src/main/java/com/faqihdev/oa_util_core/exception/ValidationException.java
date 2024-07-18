package com.faqihdev.oa_util_core.exception;


import lombok.*;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationException extends RuntimeException {

    private String message;
    private Integer code;

}
