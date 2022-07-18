package com.streamslience.simples.generator.mpslgenerator.mapstruct;

import com.streamslience.simples.generator.mpslgenerator.entity.Employee2Entity;
import com.streamslience.simples.generator.mpslgenerator.entity.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);


    @Mappings({
            @Mapping(target="country", source="country")

    })
    Employee2Entity sourceToDestination(EmployeeEntity entity, String country);



}
