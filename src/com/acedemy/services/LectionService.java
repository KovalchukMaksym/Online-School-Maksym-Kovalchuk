package com.acedemy.services;

import com.acedemy.cources.Lection;
import com.acedemy.repository.LectionRepository;

import java.util.Arrays;

public class LectionService {

    public void allLectionsArray() {
        LectionRepository lectionRepository = new LectionRepository();
        System.out.println(Arrays.toString(lectionRepository.getLectionArray()));
    }
}