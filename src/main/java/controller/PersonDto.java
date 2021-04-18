package controller;

import dao.Person;

import java.util.List;

public class PersonDto {

    List<Person> personList;

    Integer sublistSize;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Integer getSublistSize() {
        return sublistSize;
    }

    public void setSublistSize(Integer sublistSize) {
        this.sublistSize = sublistSize;
    }
}
