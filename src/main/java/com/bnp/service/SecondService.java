package com.bnp.service;

import com.bnp.dao.PersoDao;
import com.bnp.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class SecondService {

    private PersoDao persoDao;

    @Autowired
    public SecondService(PersoDao persoDao) {
        this.persoDao = persoDao;
    }

    public SecondService() {
    }

    public List<Person> filterPersonListWithAge(List<Person> personList) {
       return personList
               .stream()
               .filter(el -> el.getAge() > 40)
               .collect(Collectors.toList());

    }

    public void saveList(List<Person> personList) {
        persoDao.saveAll(personList);
    }
}
