package com.crossasyst.jpademo.service;

import com.crossasyst.jpademo.mapper.PersonMapper;
import com.crossasyst.jpademo.model.Person;
import com.crossasyst.jpademo.model.PersonResponse;
import org.hibernate.action.internal.EntityAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {

    @Autowired
    private final PersonMapper personMapper;

    public PersonService() {
        personMapper = null;
    }

    public PersonResponse createPerson(Person person){


        Long id = new Random().nextLong();
        PersonResponse personResponse = new PersonResponse();
        personResponse.setId(id);
        //log.info(employee1.getFirstName(),employee1.getLastName());
        //log.info("Person Name is {} {}", person.getFirstName(), person.getLastName());
        return personResponse;
    }

}
