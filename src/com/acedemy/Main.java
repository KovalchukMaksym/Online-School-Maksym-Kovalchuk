package com.acedemy;

import com.acedemy.cources.Course;
import com.acedemy.cources.Lection;
import com.acedemy.cources.Student;
import com.acedemy.cources.Teacher;
import com.acedemy.repository.CourseRepository;
import com.acedemy.repository.LectionRepository;
import com.acedemy.repository.StudentRepository;
import com.acedemy.repository.TeacherRepository;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();


        LectionRepository lectionRepository = new LectionRepository();
        CourseRepository courseRepository = new CourseRepository();
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();

        courseRepository.addCourse(new Course("asdas",1,"asda","asdsad","asd"));
        lectionRepository.addLection(new Lection("asd",1,"asda","asda"));
        studentRepository.addStudent(new Student("",1,"",""));
        teacherRepository.addTeacher(new Teacher("",1,"",""));



        System.out.println(Arrays.toString(teacherRepository.getTeacherArray()));

        /* int categoryCreationQuestion = 1;
        int exitCondition = 0;

        do{
            System.out.println("Вибір категорії:");
            System.out.println(" 1 курси");
            System.out.println(" 2 лекції");
            System.out.println(" 3 студенти");
            System.out.println(" 4 вчителі");
            System.out.println(" 0 вихід з програми");

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
            else if (category == 0 ){
                exitCondition = 1;
                categoryCreationQuestion = 2;
                System.out.println(" Вихід з програми");
            }
            else {
                System.out.println("Неправильно обраний номер, спробуйте ще раз! \n");
            }


        } while ( categoryCreationQuestion == 1);

        int lectionCreationQuestion = 1;
        int lectionAmount = 0;

        if (exitCondition != 1){
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

                    lectionAmount += 1;

                    Lection lectionCreation = new Lection(lectionName, Course.id,
                            homeWork, additionalMaterials);
                    System.out.println("Лекція створенна!" +
                            "\n" + lectionCreation +
                            ". Це " + lectionAmount + " лекція!");
                } else if (scannerQuestion == 0) {
                    lectionCreationQuestion = 2;
                    System.out.println("\nВихід з програми. Загальна кількість створених лекцій: " + lectionAmount);

                } else {
                    System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                }

                if (lectionAmount == 8) {
                    System.out.println("\nВи створили максимальну кількість лекцій. Вихід з програми.");
                    lectionCreationQuestion = 2;
                }
            }
            while (lectionCreationQuestion == 1);
        }*/
    }
}
