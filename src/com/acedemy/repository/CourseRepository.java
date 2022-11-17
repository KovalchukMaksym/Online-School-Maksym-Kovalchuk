package com.acedemy.repository;

import com.acedemy.cources.Course;

public class CourseRepository {
    private int arrayLength = 2;
    private Course[] courseArray = new Course[arrayLength];

    public Course[] getCourseArray() {
        return courseArray;
    }

    public void addCourse (Course course){
        for (int i = 0; i < courseArray.length; i++) {
            if(courseArray[i] == null){
                courseArray[i] = course;
                if(i == courseArray.length - 1){
                    expandArray();
                }
                break;
            }
        }
    }

    public void expandArray(){
        int tmpArrayLength = (courseArray.length * 3) / 2 + 1;
        Course[] tmpCourseArray = new Course[tmpArrayLength];
        System.arraycopy(courseArray,0,tmpCourseArray,0,courseArray.length);
        courseArray = tmpCourseArray;
    }
}
