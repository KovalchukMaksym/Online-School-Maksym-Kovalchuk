package com.acedemy.repository;

import com.acedemy.cources.Teacher;

public class TeacherRepository {
    private int arrayLength = 2;
    private Teacher[] teacherArray = new Teacher[arrayLength];

    public void addTeacher (Teacher teacher){
        for (int i = 0; i < teacherArray.length; i++) {
            if(teacherArray[i] == null){
                teacherArray[i] = teacher;
                if(i == teacherArray.length - 1){
                    expandArray();
                }
                break;
            }
        }
    }
    public void expandArray(){
        int tmpArrayLength = (teacherArray.length * 3) / 2 + 1;
        Teacher[] tmpTeacherArray = new Teacher[tmpArrayLength];
        System.arraycopy(teacherArray,0,tmpTeacherArray,0,teacherArray.length);
        teacherArray = tmpTeacherArray;
    }

    public Teacher[] getTeacherArray() {
        return teacherArray;
    }

    public void printFirstArray(){
        System.out.println(teacherArray[0]);
    }
}
