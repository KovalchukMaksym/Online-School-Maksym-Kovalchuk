package com.acedemy.services;

import com.acedemy.cources.Lection;

public class LectionService {
    public Lection lectionCreation (String lectionName,int id, String homeWork,
                                  String additionalMaterials){
        return new Lection (lectionName, id, homeWork, additionalMaterials);

    }
}