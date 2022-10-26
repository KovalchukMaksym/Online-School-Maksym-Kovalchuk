package com.acedemy;

import com.acedemy.cources.Course;
import com.acedemy.cources.Lection;
import com.acedemy.services.CourseService;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Course name", 1,
                "HomeWork", "Additional Materials");

        Lection firstLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");
        Lection secondLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");
        Lection thirdLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");
        Lection fourthLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");
        Lection fifthLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");
        Lection sixthLection = new Lection("Lection name", course.id,
                "Home Work", "Additional materials");

        System.out.println("The total amount of the lections is " + Lection.counter +
                " and the id of the sixth lection is " + sixthLection.id);
    }
}
