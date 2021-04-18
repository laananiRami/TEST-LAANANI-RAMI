package com.bnp.controller;

import com.bnp.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.bnp.service.FirstService;
import com.bnp.service.SecondService;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

public class TechniqueTestController implements TechniqueTest {

    private FirstService firstService;
    private SecondService secondService;

    @Autowired
    public TechniqueTestController(FirstService firstService) {
        this.firstService = firstService;
    }

    @Override
    public ResponseEntity splitLisOfPerson(@Valid PersonDto personDto) {

        firstService.split(personDto);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Done");
    }

    @Override
    public ResponseEntity savePersonsList(@Valid PersonDto personList) throws IOException {

        List<Person> filtredList = secondService.filterPersonListWithAge(personList.getPersonList());

        secondService.saveList(personList.getPersonList());

        secondService.saveOnFile(filtredList);
        return null;
    }

}
