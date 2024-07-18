package com.faqihdev.oa_util_core.Common;

import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

@Setter
public class BaseResultDTO<T,U extends AResponseDataDTO> implements Serializable, IResultDTO {

    @Serial
    private static final long serialVersionUID = 1L;

    private T result;

    private U responseData;

    private Map<String, String> metadata;

    @Override
    public Object getResult() {
        return null;
    }

    @Override
    public AResponseDataDTO getResponseData() {
        return null;
    }

    @Override
    public Map<String, String> getMetadata() {
        return Map.of();
    }
}
