package com.acedemy;

import com.acedemy.cources.Course;
import com.acedemy.cources.Lection;
import com.acedemy.cources.Student;
import com.acedemy.cources.Teacher;
import com.acedemy.repository.CourseRepository;
import com.acedemy.repository.LectionRepository;
import com.acedemy.repository.StudentRepository;
import com.acedemy.repository.TeacherRepository;
import com.acedemy.services.CourseService;
import com.acedemy.services.LectionService;
import com.acedemy.utility.ExitUtility;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        LectionRepository lectionRepository = new LectionRepository();
        LectionService lectionService = new LectionService();
        Scanner scanner = new Scanner(System.in);
        ExitUtility exitUtility = new ExitUtility();
        Lection lection = new Lection();

        boolean lectionCreationBoolean = true;
        if (exitUtility.getExitBoolean() == false) {
            do {
                System.out.println("\nХочеш створити лекцію? " +
                        "\n 1 Створення лекції" +
                        "\n 0 Вихід з програми");
                int scannerQuestion = scanner.nextInt();

                if (scannerQuestion == 1) {
                    System.out.println("Окей, як тоді назвемо лекцію?");
                    String lectionName = scanner.next();

                    System.out.println("А домашнє завдання буде?");
                    String homeWork = scanner.next();

                    System.out.println("Як щодо додаткових матеріалів?");
                    String additionalMaterials = scanner.next();


                    lectionRepository.addLection(new Lection(lectionName,course.ID,homeWork,additionalMaterials));
                    System.out.println("Лекція створенна!" +
                            "\n" +
                            ". Це " + lection.getCounter() + " лекція!");

                } else if (scannerQuestion == 0) {
                    lectionCreationBoolean = false;
                    System.out.println("\nВихід з програми. Загальна кількість створених лекцій: " + lection.getCounter());

                } else {
                    System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                }

                if (lection.getCounter() == 8) {
                    System.out.println("\nВи створили максимальну кількість лекцій. Вихід з програми.");
                    lectionCreationBoolean = false;
                }
            }
            while (lectionCreationBoolean == true);
        }

        System.out.println(Arrays.toString(lectionRepository.getLectionArray()));
        lectionService.allLectionsArray();
    }


    public static void сategoryCreation(){
        Scanner scanner = new Scanner(System.in);
        ExitUtility exitUtility = new ExitUtility();
        Course course = new Course();

        boolean categoryCreationBoolean = true;

        do{
            System.out.println("Вибір категорії:");
            System.out.println(" 1 курси");
            System.out.println(" 2 лекції");
            System.out.println(" 3 студенти");
            System.out.println(" 4 вчителі");
            System.out.println(" 0 вихід з програми");

            int category = scanner.nextInt();

            if (category == 1){
                CourseRepository courseRepository = new CourseRepository();
                Course courseCategory = new Course("Course", course.ID, "teacher",
                        "Student", "Lection");
                System.out.println(courseCategory);
                categoryCreationBoolean = false;
            }
            else if (category == 2){
                Lection lectionCategory = new Lection("Lection", course.ID, "Home work",
                        "Additional materials");
                System.out.println(lectionCategory);
                categoryCreationBoolean = false;
            }
            else if (category == 3) {
                Student studentCategory = new Student("Student", 1, "Home work",
                        "Additional materials");
                System.out.println(studentCategory);
                categoryCreationBoolean = false;
            }
            else if (category == 4){
                Teacher teacherCategory = new Teacher("Teacher", 1, "Home Work",
                        "Additional materials");
                System.out.println(teacherCategory);
                categoryCreationBoolean = false;
            }
            else if (category == 0 ){
                exitUtility.setExitBoolean(true);
                categoryCreationBoolean = false;
                System.out.println(" Вихід з програми");
            }
            else {
                System.out.println("Неправильно обраний номер, спробуйте ще раз! \n");
            }


        } while (categoryCreationBoolean == true);
    }


    private static void lectureCreation() {
        Scanner scanner = new Scanner(System.in);
        ExitUtility exitUtility = new ExitUtility();
        Lection lection = new Lection();
        Course course = new Course();
        LectionRepository lectionRepository = new LectionRepository();


        boolean lectionCreationBoolean = true;

        if (exitUtility.getExitBoolean() == false) {
            do {
                System.out.println("\nХочеш створити лекцію? " +
                        "\n 1 Створення лекції" +
                        "\n 0 Вихід з програми");
                int scannerQuestion = scanner.nextInt();

                if (scannerQuestion == 1) {
                    System.out.println("Окей, як тоді назвемо лекцію?");
                    String lectionName = scanner.next();

                    System.out.println("А домашнє завдання буде?");
                    String homeWork = scanner.next();

                    System.out.println("Як щодо додаткових матеріалів?");
                    String additionalMaterials = scanner.next();


                    lectionRepository.addLection(new Lection(lectionName,course.ID,homeWork,additionalMaterials));
                    System.out.println("Лекція створенна!" +
                            "\n" +
                            ". Це " + lection.getCounter() + " лекція!");
                    System.out.println(Arrays.toString(lectionRepository.getLectionArray()));

                } else if (scannerQuestion == 0) {
                    lectionCreationBoolean = false;
                    System.out.println("\nВихід з програми. Загальна кількість створених лекцій: " + lection.getCounter());

                } else {
                    System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                }

                if (lection.getCounter() == 8) {
                    System.out.println("\nВи створили максимальну кількість лекцій. Вихід з програми.");
                    lectionCreationBoolean = false;
                }
            }
            while (lectionCreationBoolean == true);
        }

    }
}
