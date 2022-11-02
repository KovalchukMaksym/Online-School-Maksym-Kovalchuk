package com.acedemy.cources;

public class Course {
    private String courseName;
    public int id;
    private String teacher;
    private String student;
    private String lection;

    public Course() {
    }
    public Course (String courseName,int id, String teacher, String student, String lection){
        this.courseName = courseName;
        this.id = id;
        this.teacher = teacher;
        this.student = student;
        this.lection = lection;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", id=" + id +
                ", teacher='" + teacher + '\'' +
                ", student='" + student + '\'' +
                ", lection='" + lection + '\'' +
                '}';
    }
}
