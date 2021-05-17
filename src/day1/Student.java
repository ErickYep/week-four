package day1;

public class Student {
    String name;
    int age;
    double weight;

    Student(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Weight : " + weight);
    }



}

