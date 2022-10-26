package com.acedemy.services;

import com.acedemy.cources.Course;

public class CourseService {
    public Course courseCreation (String courseName,int ID, String homeWork,
                                  String additionalMaterials){
        return new Course (courseName, ID, homeWork, additionalMaterials);
    }
}
