package com.acedemy.repository;

import com.acedemy.cources.Student;

public class StudentRepository {
    private int arrayLength = 2;
    private Student[] studentArray = new Student[arrayLength];

    public void addStudent (Student student){
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i] == null){
                studentArray[i] = student;
                if(i == studentArray.length - 1){
                    expandArray();
                }
                break;
            }
        }
    }

    public void expandArray(){
        int tmpArrayLength = (studentArray.length * 3) / 2 + 1;
        Student[] tmpCourseArray = new Student[tmpArrayLength];
        System.arraycopy(studentArray,0,tmpCourseArray,0,studentArray.length);
        studentArray = tmpCourseArray;
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

}
