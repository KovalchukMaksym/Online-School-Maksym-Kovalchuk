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

        int categoryCreationQuestion = 1;

        do{
            System.out.println("Яка категорія Вас цікавить?");
            System.out.println(" 1 Курси");
            System.out.println(" 2 Лекції");
            System.out.println(" 3 Студенти");
            System.out.println(" 4 Вчителі");

            int category = scanner.nextInt();

            if (category == 1){
                Course courseCategory = new Course("Course", 1, "teacher",
                        "Student", "Lection");
                System.out.println(courseCategory);
                categoryCreationQuestion = 2;
            }
            else if (category == 2){
                Lection lectionCategory = new Lection("Lection", 1, "Home work",
                        "Additional materials");
                System.out.println(lectionCategory);
                categoryCreationQuestion = 2;
            }
            else if (category == 3) {
                Student studentCategory = new Student("Student", 1, "Home work",
                        "Additional materials");
                System.out.println(studentCategory);
                categoryCreationQuestion = 2;
            }
            else if (category == 4){
                Teacher teacherCategory = new Teacher("Teacher", 1, "Home Work",
                        "Additional materials");
                System.out.println(teacherCategory);
                categoryCreationQuestion = 2;
            }
            else {
                System.out.println("Спробуйте ще раз");
            }


        } while ( categoryCreationQuestion == 1);


        int lectionCreationQuestion = 1;
        int lectionAmount = 0;
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

                lectionAmount += 1;

                Lection lectionCreation = new Lection(lectionName,Course.id
                        ,homeWork,additionalMaterials);
                System.out.println("Лекція створенна!" +
                        "\n" + lectionCreation +
                    "це " + lectionAmount + " лекція!");
            }
            else if (scannerQuestion == 2){
                lectionCreationQuestion = 2;
                System.out.println("Ну добре, загальна кількість створених лекцій:" + lectionAmount);

            }
            else {
                System.out.println("Ви щось не те обрали, спробуйте ще раз");
            }

            if(lectionAmount == 8){
                System.out.println("Ви створили максимальну кількість лекцій");
                lectionCreationQuestion = 2;
            }
        }
        while (lectionCreationQuestion == 1);
    }
}
