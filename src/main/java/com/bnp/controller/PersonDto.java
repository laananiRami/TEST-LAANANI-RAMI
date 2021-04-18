package com.bnp.controller;

import com.bnp.dao.Person;

import java.util.List;

public class PersonDto {

    List<Person> personList;

    Integer subListSize;

    public PersonDto(List<Person> personList, Integer subListSize) {

        this.personList = personList;
        this.subListSize = subListSize;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Integer getSublistSize() {
        return subListSize;
    }

    public void setSublistSize(Integer subListSize) {
        this.subListSize = subListSize;
    }
}
