package it.develhope.constructor;

/**
 * This class represents a Teacher
 */

public class Teacher {

    String teacherName;

    //the constructor simply informs about the Object creation

    public Teacher(){

        System.out.println("A new Teacher Object has been created");
    }

    /**
     * This method assigns a grade to a student
     * @param alum the Student to whom to assign a grade
     * @param finalGrade the grade to assign at alum
     */

    public void assignGrade(Student alum, int finalGrade){

        alum.grade=finalGrade;
    }

}
