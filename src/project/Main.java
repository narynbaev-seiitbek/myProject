package project;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Person sadyr = new Person("Sadyr", "Japarov", LocalDate.of(1950,02,15));
        Person roza = new Person("Roza", "Otunbaeva", LocalDate.of(1955,05,25));
        Person adahan = new Person("Adahan", "Madumarov", LocalDate.of(1958,04,1));

        Student student = new Student("Bill","Gates",LocalDate.of(1958,05,15));
        Student student2 = new Student("Seitbek","Narynbaev",LocalDate.of(1990,03,12));
        Student student3 = new Student("Azat","Ibraev",LocalDate.of(1989,8,25));

        Mentor mentor = new Mentor("Chyngyz","Kamarov",LocalDate.of(1989,12,25));
        Mentor mentor2 = new Mentor("Beksultan","Mamatkadyr uulu",LocalDate.of(2001,01,15));

        Instructor instructor = new Instructor("Muhammad","Allanov",LocalDate.of(1998,05,12));
        Instructor instructor2 = new Instructor("Nargiza","Rysbek kyzy",LocalDate.of(1996,04,18));

        Group group1 = new Group(new Student[]{student,student2,student3},
                new Mentor[]{mentor,mentor2},new Instructor[]{instructor,instructor2});

        System.out.println(group1);





    }
}
