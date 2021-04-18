package service;

import controller.PersonDto;
import dao.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class ServiceTest {

    @TestConfiguration
    static class ServiceTestContextConfiguration {

        @Bean
        public FirstService firstService() {
            return new FirstService();
        }
    }

    private List<Person> personList;
    private PersonDto personDTOList;

    @Autowired
    FirstService firstService;



    @Before
    public void init() {
        personList = new ArrayList<>(Arrays.asList(new Person("P1", "P2", 10),
                new Person("P2", "P3", 25),
                new Person("P3", "P4", 50),
                new Person("P4", "P5", 42),
                new Person("P5", "P6", 80)));
        personDTOList = new PersonDto(personList, 3);
    }


    @Test
    public void ShouldSplitList() {
        List<List<Person>> lists = firstService.split(personDTOList);


        List<List<Person>> result = new ArrayList<List<Person>>();
        List<Person> subList1 = new ArrayList<Person>(Arrays.asList(personList.get(0), personList.get(1), personList.get(2)));
        List<Person> subList2 = new ArrayList<Person>(Arrays.asList(personList.get(3), personList.get(4)));

        result.add(subList1);
        result.add(subList2);
        Assert.assertEquals(lists, result);
    }
}