package day1;

import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
//        Employer employer = new Employer("David",29,"ACA",250000);
//        Employer employer1 = new Employer("Ara",35,"ACA",270000);
//        employer.printInfo();
//        employer1.printInfo();
        /*-------------------------*/
//        Shop product = new Shop("Knife","a4567891001",
//                20,35,0);
//        product.checkOrder(15);
        /*-------------------------*/
//        University university = new University("Artash",15,
//                20,25,18);
//        university.admission();
        /*-------------------------*/
//        int[] array = {648, 64, 3, 6874, 354, 68, 687, 687, 684, 5, 7};
//        Arithmetic arithmetic = new Arithmetic(array);
//        System.out.println(Arrays.toString(array));
//        arithmetic.options();
//        System.out.println(Arrays.toString(array));
        /*-------------------------*/
        Student[] student = new Student[5];
        student[0] = new Student("Aram", 15, 65);
        student[1] = new Student("Karen", 13, 58);
        student[2] = new Student("Alla", 16, 55);
        student[3] = new Student("Maria", 17, 49);
        student[4] = new Student("Lilia", 25, 57);
        for (Student value : student) {
            value.printInfo();
        }
        Sort.sort(student,1);
        for (Student value : student) {
            value.printInfo();
        }
    }
}
