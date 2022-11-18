package com.acedemy.services;

import com.acedemy.cources.Student;
import com.acedemy.repository.StudentRepository;

import java.util.Arrays;

public class StudentService {

    public void printAllStudentArray(StudentRepository studentRepository) {
        System.out.println(Arrays.toString(studentRepository.getStudentArray()));
    }
}
