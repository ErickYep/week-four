package day1;

public class Employer {
    String name;
    int age;
    String workPlace;
    double salary;
    Employer(){

    }
    Employer(String name,int age,String workPlace,double salary){
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }
    void printInfo(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Work Plasce : " + workPlace);
        System.out.println("Salary : " + salary);
        System.out.println("--------------------");
    }
}

