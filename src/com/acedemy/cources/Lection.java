package com.acedemy.cources;

public class Lection {
    private String lectionName;
    public int id;
    private String homeWork;
    private String additionalMaterials;
    public static int counter;

    public Lection (String lectionName, int id, String homeWork, String additionalMaterials ){
        this.lectionName = lectionName;
        this.id = id;
        this.homeWork = homeWork;
        this.additionalMaterials = additionalMaterials;
        counter++;
    }



}
