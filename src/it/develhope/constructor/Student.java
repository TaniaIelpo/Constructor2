package it.develhope.constructor;

/**
 * This class represents a Student
 *
 * @author Tania Ielpo
 */

public class Student {

    String name;
    int grade;

    //the constructor assigns the name at the student and prints the information
    //about the construction
    public Student (String name){
        this.name=name;
        System.out.println("A new Student object has been created");
    }

    /**
     * this method prints the information about the Student
     */
    public void getStudentDetails(){
        System.out.println("The student "+name+" got "+grade);
    }

}
