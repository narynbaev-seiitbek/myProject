package project;

import java.util.Arrays;

public class Group {

    private Student[] student;
    private Mentor[] mentor;
    private Instructor[] instructor;

    public Group(Student[] student, Mentor[] mentor, Instructor[] instructor) {
        this.student = student;
        this.mentor = mentor;
        this.instructor = instructor;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Mentor[] getMentor() {
        return mentor;
    }

    public void setMentor(Mentor[] mentor) {
        this.mentor = mentor;
    }

    public Instructor[] getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor[] instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Group information: " +'\n'+
                "students: " + student.length +'\n'+
                "mentors: " + mentor.length +'\n'+
                "instructors: " + instructor.length ;
    }
}
