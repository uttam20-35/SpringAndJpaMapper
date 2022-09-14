package com.crossasyst.jpademo.repository;

import com.crossasyst.jpademo.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public  interface PersonRepository extends JpaRepository<PersonEntity, Integer> {

}
