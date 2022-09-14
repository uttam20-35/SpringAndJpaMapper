package com.crossasyst.jpademo.mapper;

import com.crossasyst.jpademo.entity.PersonEntity;
import com.crossasyst.jpademo.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonEntity personToEntity (Person person);
    Person entityToPerson(PersonEntity personEntity);

}
