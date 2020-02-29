package com.example.springBootRest.service.impl;

import com.example.springBootRest.dto.PersonDto;
import com.example.springBootRest.entity.Person;
import com.example.springBootRest.repository.PersonRepository;
import com.example.springBootRest.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;


    // modelMapper'i kullanmamin sebebi Person.Class ı PersonDto.Class map icin kullaniyorum.
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PersonDto> getAllPerson() {
       List<Person> p =  personRepository.findAll();
       return (List<PersonDto>) modelMapper.map(p,PersonDto.class);

    }

    @Override
    public PersonDto save(PersonDto person) {

       Person personDb = modelMapper.map(person,Person.class);
        personDb = personRepository.save(personDb);
        return modelMapper.map(personDb,PersonDto.class);

    }

    @Override
    public PersonDto getById(Long id) {
        Person p = personRepository.getOne(id);
        return modelMapper.map(p,PersonDto.class);
    }

    @Override
    public PersonDto update(Long id, int salary) {

        // maas'a zam yaparak guncelleme metodu
        Person p = personRepository.getOne(id);
        p.setSalary(p.getSalary()+salary);
        personRepository.save(p);
        return modelMapper.map(p,PersonDto.class);



    }

    @Override
    public Boolean delete(Long id) {

        personRepository.deleteById(id);
        return true;
    }






}
