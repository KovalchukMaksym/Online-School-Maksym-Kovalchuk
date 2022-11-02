package com.acedemy;

import com.acedemy.cources.Course;
import com.acedemy.cources.Lection;
import com.acedemy.cources.Student;
import com.acedemy.cources.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course Course = new Course();

        System.out.println("Доброго дня, яка категорія Вас цікавить?");
        System.out.println("\nКурси");
        System.out.println("Лекції");
        System.out.println("Студенти");
        System.out.println("Вчителі");

        String category = scanner.next();
        switch (category)
        {
            case "Курси":
                Course courseCategory = new Course("Course", 1, "teacher",
                        "Student", "Lection");
                System.out.println(courseCategory);
                break;

            case "Лекції":
                Lection lectionCategory = new Lection("Lection", 1, "Home work",
                        "Additional materials");
                System.out.println(lectionCategory);
                break;

            case "Студенти":
                Student studentCategory = new Student("Student", 1, "Home work",
                        "Additional materials");
                System.out.println(studentCategory);
                break;

            case "Вчителі":
                Teacher teacherCategory = new Teacher("Teacher", 1, "Home Work",
                        "Additional materials");
                System.out.println(teacherCategory);
                break;

            default:
                System.out.println("Категорії " + category + " не існує");
                break;
        }

        int lectionCreationQuestion = 1;
        do {
            System.out.println("Хочеш створити лекцію? " +
                    "\n 1 Так" +
                    "\n 2 Ні");
            int scannerQuestion = scanner.nextInt();
            if (scannerQuestion == 1){
                System.out.println("Окей, як тоді назвемо лекцію?");
                String lectionName = scanner.next();

                System.out.println("А домашнє завдання буде?");
                String homeWork = scanner.next();

                System.out.println("Як щодо додаткових матеріалів?");
                String additionalMaterials = scanner.next();

                Lection lectionCreation = new Lection(lectionName,Course.id
                        ,homeWork,additionalMaterials);
                System.out.println("Лекція створенна!" +
                        "\n" + lectionCreation +
                    "це " + Lection.counter + " лекція!");
            } else if (scannerQuestion == 2){
                lectionCreationQuestion = 2;
                System.out.println("Ну добре, загальна кількість створених лекцій:" + Lection.counter);
            } else {
                System.out.println("Ви щось не те обрали, спробуйте ще раз");
            }

        }
        while (lectionCreationQuestion == 1);
    }
}
