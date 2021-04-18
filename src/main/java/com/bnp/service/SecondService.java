package com.bnp.service;

import com.bnp.dao.PersoDao;
import com.bnp.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondService {

    private PersoDao persoDao;

    public String path = "";
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

    public void saveOnFile(List<Person> personList) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("${file.path}"+ "ListOfPerson.txt"));

        Collections.sort(personList, Comparator.comparing(Person::getAge)
                .thenComparing(Person::getLastName)
                .thenComparing(Person::getFirstName));
        int size = personList.size();
        for (int i = 0; i < size; i++) {
            try {
                writer.write(personList.get(i).toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i < size - 1) {
                try {
                    writer.write("\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        writer.close();
    }
}
