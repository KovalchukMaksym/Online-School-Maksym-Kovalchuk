package com.acedemy.cources;

public class Student {
    private String students;
    private Integer id;
    private String homeWork;
    private String additionalMaterials;
    public static int counter;


    public Student(String students, Integer id, String homeWork, String additionalMaterials) {
        this.students = students;
        this.id = id;
        this.homeWork = homeWork;
        this.additionalMaterials = additionalMaterials;
        counter++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "students='" + students + '\'' +
                ", id=" + id +
                ", homeWork='" + homeWork + '\'' +
                ", additionalMaterials='" + additionalMaterials + '\'' +
                '}';
    }
}
