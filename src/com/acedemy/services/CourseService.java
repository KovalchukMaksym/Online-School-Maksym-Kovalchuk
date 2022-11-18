package com.acedemy.services;

import com.acedemy.cources.Course;
import com.acedemy.repository.CourseRepository;

import java.util.Arrays;

public class CourseService {

    public void printAllCourseArray(CourseRepository courseRepository) {
        System.out.println(Arrays.toString(courseRepository.getCourseArray()));
    }
}
