package project;

import java.time.LocalDate;

public class Student extends Person {

    private Person person;

    public Student() {
    }

    public Student(Person person){
    this.person = person;
    }
}
