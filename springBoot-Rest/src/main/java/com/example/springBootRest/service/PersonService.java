package com.example.springBootRest.service;

import com.example.springBootRest.dto.PersonDto;
import com.example.springBootRest.entity.Person;

import java.util.List;

public interface PersonService {


    public List<PersonDto> getAllPerson();

    PersonDto save(PersonDto person);

    PersonDto getById(Long id);

    PersonDto update(Long id, int salary);

    Boolean delete(Long id);

}
