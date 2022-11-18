package com.acedemy.services;

import com.acedemy.cources.Teacher;
import com.acedemy.repository.TeacherRepository;

import java.util.Arrays;

public class TeacherService {

    public void printAllTeacherArray(TeacherRepository teacherRepository) {
        System.out.println(Arrays.toString(teacherRepository.getTeacherArray()));
    }
}
