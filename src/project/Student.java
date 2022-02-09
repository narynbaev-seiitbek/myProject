package project;

import java.time.LocalDate;

public class Student extends Person {


    public Student() {
    }

    public Student(String name, String lastName, LocalDate dateOfBirth) {
        super(name, lastName, dateOfBirth);

    }


    @Override
    public void talk() {
        super.talk();
    }

    @Override
    public void run() {
        super.run();
    }

}
