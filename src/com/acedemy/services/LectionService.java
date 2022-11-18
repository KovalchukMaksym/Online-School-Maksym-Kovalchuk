package com.acedemy.services;

import com.acedemy.repository.LectionRepository;

import java.util.Arrays;

public class LectionService {

    public void printAllLectionsArray(LectionRepository lectionRepository) {
        System.out.println(Arrays.toString(lectionRepository.getLectionArray()));
    }
}