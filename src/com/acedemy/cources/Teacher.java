package com.acedemy.cources;

public class Teacher {
    private String teacher;
    private Integer id;
    private String homeWork;
    private String additionalMaterials;

    public Teacher(String teacher, Integer id, String homeWork, String additionalMaterials) {
        this.teacher = teacher;
        this.id = id;
        this.homeWork = homeWork;
        this.additionalMaterials = additionalMaterials;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher='" + teacher + '\'' +
                ", id=" + id +
                ", homeWork='" + homeWork + '\'' +
                ", additionalMaterials='" + additionalMaterials + '\'' +
                '}';
    }
}
