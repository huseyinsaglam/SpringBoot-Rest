package com.example.springBootRest.repository;

import com.example.springBootRest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person,Long> {


}
