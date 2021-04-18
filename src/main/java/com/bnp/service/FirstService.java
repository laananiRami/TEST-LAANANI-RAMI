package com.bnp.service;

import com.bnp.controller.PersonDto;
import com.bnp.dao.Person;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstService {

    private Logger log = LoggerFactory.getLogger(FirstService.class);

    public FirstService() {
    }

    public List<List<Person>> split(PersonDto personDto) {

        Integer targetSublistSize = personDto.getSublistSize();
        personDto.getPersonList().forEach(person -> log.debug("Person: {}",person.toString()));
        return ListUtils.partition(personDto.getPersonList(), targetSublistSize);
    }
}

