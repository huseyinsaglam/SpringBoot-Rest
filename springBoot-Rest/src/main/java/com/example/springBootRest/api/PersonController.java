package com.example.springBootRest.api;


import com.example.springBootRest.dto.PersonDto;
import com.example.springBootRest.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServiceImpl personServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<PersonDto> getById(@PathVariable("id") Long id)
    {
        PersonDto personDto = personServiceImpl.getById(id);
        return ResponseEntity.ok(personDto);
    }

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDto>> getByAllPerson()
    {
        List<PersonDto> personDto = personServiceImpl.getAllPerson();
        return ResponseEntity.ok(personDto);
    }

    @PostMapping
    public ResponseEntity<PersonDto> createPerson(@Valid @RequestBody PersonDto person)
    {

        return ResponseEntity.ok(personServiceImpl.save(person));

    }



    @PutMapping("/{id}")
    public ResponseEntity<PersonDto> updateProject(@PathVariable("id") Long id, @Valid @RequestBody int salary)
    {
        return ResponseEntity.ok(personServiceImpl.update(id,salary));

    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(personServiceImpl.delete(id));

    }
}
