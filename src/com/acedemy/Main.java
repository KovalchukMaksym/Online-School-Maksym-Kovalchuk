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
import com.acedemy.services.StudentService;
import com.acedemy.services.TeacherService;
import com.acedemy.utility.ExitUtility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        LectionRepository lectionRepository = new LectionRepository();
        CourseRepository courseRepository = new CourseRepository();
        StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();

        courseRepository.addCourse(new Course("Course Name", course.ID, "Teacher",
                "Student", "Lection"));
        lectionRepository.addLection(new Lection("Lection1", course.ID, "",
                ""));
        lectionRepository.addLection(new Lection("Lection2", course.ID, "",
                ""));
        lectionRepository.addLection(new Lection("Lection3", course.ID, "",
                ""));

        categoryCreation(lectionRepository, courseRepository, studentRepository, teacherRepository);
        lectionCreation(lectionRepository);
        arraysPrinting(lectionRepository, courseRepository, studentRepository, teacherRepository);
    }


    public static void categoryCreation(LectionRepository lectionRepository, CourseRepository courseRepository,
                                        StudentRepository studentRepository, TeacherRepository teacherRepository) {
        Scanner scanner = new Scanner(System.in);
        ExitUtility exitUtility = new ExitUtility();
        Course course = new Course();

        boolean categoryCreationBoolean = true;

        do {
            System.out.println("Вибір категорії:");
            System.out.println(" 1 курси");
            System.out.println(" 2 лекції");
            System.out.println(" 3 студенти");
            System.out.println(" 4 вчителі");
            System.out.println(" 0 вихід з програми");

            int category = scanner.nextInt();

            if (category == 1) {
                courseRepository.addCourse(new Course("Category", course.ID, "Category",
                        "Category", "Category"));
                System.out.println(courseRepository.getArray(course.getCounter() - 1));
                categoryCreationBoolean = false;
            } else if (category == 2) {
                lectionRepository.addLection(new Lection("Category", course.ID,
                        "Category", "Category"));
                lectionRepository.printFirstArray();
                categoryCreationBoolean = false;
            } else if (category == 3) {
                studentRepository.addStudent(new Student("Category", 1,
                        "Category", "Category"));
                lectionRepository.printFirstArray();
                categoryCreationBoolean = false;
            } else if (category == 4) {
                teacherRepository.addTeacher(new Teacher("Category", 1,
                        "Category", "Category"));
                teacherRepository.printFirstArray();
                categoryCreationBoolean = false;
            } else if (category == 0) {
                exitUtility.setExitBoolean(true);
                categoryCreationBoolean = false;
                System.out.println(" Вихід з програми");
            } else {
                System.out.println("Неправильно обраний номер, спробуйте ще раз! \n");
            }


        } while (categoryCreationBoolean == true);
    }


    private static void lectionCreation(LectionRepository lectionRepository) {

        Scanner scanner = new Scanner(System.in);
        ExitUtility exitUtility = new ExitUtility();
        Lection lection = new Lection();
        Course course = new Course();

        if (exitUtility.getExitBoolean() == false) {
            System.out.println("Дякую, категорія обрана. Оберіть наступну дію:" +
                    "\n 1 Створення лекції" +
                    "\n 2 Виведення інформації з масивів" +
                    "\n 0 Вихід з програми");

            int scannerQuestion = scanner.nextInt();

            boolean lectionCreationBoolean = true;
            do {
                if (scannerQuestion == 1) {
                    System.out.println("Назва лекції");
                    String lectionName = scanner.next();

                    System.out.println("Домашнє завдання:");
                    String homeWork = scanner.next();

                    System.out.println("Додаткові матеріали:");
                    String additionalMaterials = scanner.next();

                    lectionRepository.addLection(new Lection(lectionName, course.ID, homeWork, additionalMaterials));
                    System.out.println("Лекція створенна!" +
                            "\n" + lectionRepository.getArray(lection.getCounter() - 1) +
                            ". Це " + lection.getCounter() + " лекція!");
                    if (lection.getCounter() != 8) {
                        System.out.println("Бажаєте створити ще одну лекцію?"
                                + "\n 1 так "
                                + "\n 2 перехід в меню виведення масивів"
                                + "\n 0 вихід з програми");
                        int newLectionScanner = scanner.nextInt();

                        if (newLectionScanner == 1) {
                            System.out.println("Створення ще однієї лекції");
                        } else if (newLectionScanner == 2) {
                            lectionCreationBoolean = false;
                        } else if (newLectionScanner == 0) {
                            System.out.println("Вихід з програми");
                            exitUtility.setExitBoolean(true);
                            lectionCreationBoolean = false;
                        }
                    }
                }


                else if (scannerQuestion == 2){
                    lectionCreationBoolean = false;
                }
                else if (scannerQuestion == 0) {
                    lectionCreationBoolean = false;
                    System.out.println("\nВихід з програми. Загальна кількість створених лекцій: " + lection.getCounter());
                    exitUtility.setExitBoolean(true);

                }
                else {
                    System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                }

                if (lection.getCounter() == 8) {
                    lectionCreationBoolean = false;
                    boolean exitBooleanQuestion = true;
                    do {
                        System.out.println("\nВи створили максимальну кількість лекцій."
                                + "\nБажаєте вивести інформацію з масивів?"
                                + "\n 1 Так "
                                + "\n 2 Ні, вийти з програми ");
                        int exitQuestion = scanner.nextInt();

                        if (exitQuestion == 2) {
                            System.out.println("Вихід з програми");
                            exitUtility.setExitBoolean(true);
                            exitBooleanQuestion = false;
                        } else if (exitQuestion == 1) {
                            System.out.println("Окей. Переходим в меню виведення інформації з масивів!");
                            exitBooleanQuestion = false;
                        } else {
                            System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                        }

                    } while (exitBooleanQuestion == true);
                }
            }
            while (lectionCreationBoolean == true);
        }
    }

    private static void arraysPrinting(LectionRepository lectionRepository, CourseRepository courseRepository,
                                       StudentRepository studentRepository, TeacherRepository teacherRepository){
        ExitUtility exitUtility = new ExitUtility();
        LectionService lectionService = new LectionService();
        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();
        Scanner scanner = new Scanner(System.in);

        if(exitUtility.getExitBoolean() == false){
            System.out.println("З якого саме масиву бажаєте вивести інформацію?");
            System.out.println(" 1 масив лекцій");
            System.out.println(" 2 масив курсів");
            System.out.println(" 3 масив учнів");
            System.out.println(" 4 масив вчителів");
            System.out.println(" 0 вихід з програми");

            boolean printingArraysBoolean = true;
            do {
                int printArrayScanner = scanner.nextInt();
                if(printArrayScanner == 1){
                    lectionService.printAllLectionsArray(lectionRepository);
                    printingArraysBoolean = false;
                } else if( printArrayScanner == 2){
                    courseService.printAllCourseArray(courseRepository);
                    printingArraysBoolean = false;
                } else if (printArrayScanner == 3) {
                    studentService.printAllStudentArray(studentRepository);
                    printingArraysBoolean = false;
                } else if (printArrayScanner == 4) {
                    teacherService.printAllTeacherArray(teacherRepository);
                    printingArraysBoolean = false;
                }else if (printArrayScanner == 0){
                    System.out.println("Вихыд з програми");
                    printingArraysBoolean = false;
                }
                else{
                    System.out.println("Ви щось не те обрали, спробуйте ще раз.\n");
                }
            } while( printingArraysBoolean == true);
        }
    }
}

