package com.faqihdev.oa_util_core.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends RuntimeException{

    private String message;
    private Integer code;
}
