package com.acedemy.cources;

public class Course {
    private String courseName;
    public int id;
    private String teacher;
    private String student;
    private String lection;
    public static int ID;
    public static int counter;



    public Course() {
    }


    public Course (String courseName, int id, String teacher, String student, String lection){
        this.courseName = courseName;
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.lection = lection;
        ID++;
        counter++;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", id=" + ID +
                ", teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", lection='" + lection + '\'' +
                '}';
    }

    public int getCounter() {
        return counter;
    }
}
