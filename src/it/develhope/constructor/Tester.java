package it.develhope.constructor;

/**
 * This class represents the Tester
 */

public class Tester {

    public static void main(String[] args) {
        //creation of two new Students
        Student student1= new Student("Marco Rossi");
        Student student2= new Student("Gloria Verdi");

        //Creation of a Teacher Object
        Teacher teacher = new Teacher();

        //Assignation the Teacher name
        teacher.teacherName="Sonia Bianchi";

        //Teacher assigns the grades to the two students
        teacher.assignGrade(student1, 26);
        teacher.assignGrade(student2, 28);

        //Information about the two students
        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
