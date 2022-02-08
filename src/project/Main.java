package project;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Person sadyr = new Person("Sadyr", "Japarov", LocalDate.of(1950,02,15));
        Person roza = new Person("Roza", "Otunbaeva", LocalDate.of(1955,05,25));
        Person adahan = new Person("Adahan", "Madumarov", LocalDate.of(1958,04,1));
        Student students = new Student(sadyr);





    }
}
