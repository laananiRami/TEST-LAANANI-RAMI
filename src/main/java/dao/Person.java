package dao;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @NotBlank(message = "First Name is mondatory")
    @Column(name = "firstName")
    private String firstName;

    @NotBlank(message =  "Last name is mandatory")
    @Column(name = "lastName")
    private String lastName;

    @Column(name= "age")
    private Integer age;

    public Person(@NotBlank(message = "First Name is mondatory") String firstName, @NotBlank(message = "Last name is mandatory") String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
