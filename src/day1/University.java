package day1;

import java.util.Scanner;


public class University {
    Scanner scanner = new Scanner(System.in);
    String name;
    int countOfStudents;
    int maxCountOfStudents;
    int maxAgeOfStudent;
    int minAgeOfStudent;

    University(String name, int countOfStudents, int maxCountOfStudents,
               int maxAgeOfStudent, int minAgeOfStudent) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudent = maxAgeOfStudent;
        this.minAgeOfStudent = minAgeOfStudent;
    }

    void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Count of Students : " + countOfStudents);
        System.out.println("Max Count of students : " + maxCountOfStudents);
        System.out.println("Max age of student : " + maxAgeOfStudent);
        System.out.println("Min age of student : " + minAgeOfStudent);
    }

    boolean checkAge(int age) {
        return age > minAgeOfStudent && age < maxAgeOfStudent;
    }

    void admission() {
        System.out.println("Please choose which course do you want");
        System.out.println("1)Languages ");
        System.out.println("2)Mathematics ");
        System.out.println("3)Marketing ");
        System.out.println("4)Economics ");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Enter your age ");
                int age = scanner.nextInt();
                register(age);
                break;
            default:
                System.out.println("Wrong choose");
                break;
        }

    }

    void register(int age) {
        if (age > minAgeOfStudent && age <= maxAgeOfStudent) {
            if (maxCountOfStudents > countOfStudents) {
                this.name = scanner.nextLine();
                countOfStudents++;
            } else {
                System.out.println("There are not free places to take you, sorry");
            }
        } else {
            System.out.println("Your age is not allowed");
        }
    }
    void display(){
        printInfo();
    }
}
