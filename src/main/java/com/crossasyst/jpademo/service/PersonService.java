package com.crossasyst.jpademo.service;

import com.crossasyst.jpademo.entity.PersonEntity;
import com.crossasyst.jpademo.mapper.PersonMapper;
import com.crossasyst.jpademo.model.Person;
import com.crossasyst.jpademo.model.PersonResponse;
import com.crossasyst.jpademo.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;
import org.hibernate.action.internal.EntityAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.Random;

@Log4j2
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    /*@Autowired
    private final PersonMapper personMapper;

    public PersonService() {
        personMapper = null;
    }
    */
    public PersonResponse createPerson(Person person){
        PersonEntity personEntity=new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setCity(person.getCity());
        personEntity.setZipcode(person.getZipcode());

        PersonResponse personResponse=new PersonResponse();
        Long id= (long) (Math.random()*20);
        personEntity.setId(id);

        personResponse.setId(personEntity.getId());
        personRepository.save(personEntity);
        return personResponse;
    }

    public Person getPerson(Long personId){
        /*PersonEntity personEntity=new PersonEntity();*/
        Person person= new Person();
        Optional<PersonEntity> optionalPersonEntity=personRepository.findById(personId);
         if (optionalPersonEntity.isPresent())
         {
             person.setFirstName(optionalPersonEntity.get().getFirstName());
             person.setLastName(optionalPersonEntity.get().getLastName());
             person.setCity(optionalPersonEntity.get().getCity());
             person.setZipcode(optionalPersonEntity.get().getZipcode());
         }
         else
         {
            log.info("Exception");
         }

        return person;
    }

}
