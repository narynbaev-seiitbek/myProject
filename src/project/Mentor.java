package project;

import java.time.LocalDate;

public class Mentor extends Person{

    public Mentor() {
    }

    public Mentor(String name, String lastName, LocalDate dateOfBirth) {
        super(name, lastName, dateOfBirth);
    }
}
