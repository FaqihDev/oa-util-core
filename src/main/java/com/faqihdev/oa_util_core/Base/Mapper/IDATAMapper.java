package com.faqihdev.oa_util_core.Base.Mapper;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;

import java.util.List;

public interface IDATAMapper<SOURCE,TARGET> extends Converter<SOURCE,TARGET> {

    List<TARGET> entitiesIntoDTOs(Iterable<SOURCE> source);

    List<TARGET> entitiesIntoDTOsPage(Iterable<SOURCE> entities);

    Slice<TARGET> entitiesIntoDTOSlices(Slice<SOURCE> sources);

    ConvertResponseEntity<?> convertWithResponseEntity(SOURCE source);

    Page<TARGET> entitiesPageIntoDTOPage(Page<SOURCE> data);

}
