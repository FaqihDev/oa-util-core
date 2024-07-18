package com.faqihdev.oa_util_core.exception;


import com.faqihdev.oa_util_core.Common.APIResponseBuilder;
import com.faqihdev.oa_util_core.Common.IResultDTO;
import jakarta.servlet.http.HttpServletRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdviceHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    public IResultDTO<?> handleValidationException(ValidationException e, HttpServletRequest request) {
        return APIResponseBuilder.badRequest(null,e,e.getMessage(),request);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ServiceException.class)
    public IResultDTO<?> handleServiceException(ServiceException e, HttpServletRequest request) {
        return APIResponseBuilder.badRequest(null,e,e.getMessage(),request);
    }


}
