package com.acedemy.cources;

public class Course {
    private String courseName;
    public int id;
    private String homeWork;
    private String additionalMaterials;

    public Course (String courseName,int id, String homeWork, String additionalMaterials ){
        this.courseName = courseName;
        this.id = id;
        this.homeWork = homeWork;
        this.additionalMaterials = additionalMaterials;
    }
}
