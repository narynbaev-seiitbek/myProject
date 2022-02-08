package project;

import java.time.LocalDate;

public class Instructor extends Person{

    public Instructor() {
    }

    public Instructor(String name, String lastName, LocalDate dateOfBirth) {
        super(name, lastName, dateOfBirth);
    }
}
