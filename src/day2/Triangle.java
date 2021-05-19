package day2;

import java.util.Scanner;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle() {
    }

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA > 0 && sideA < 20)
            this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB > 0 && sideB < 20)
            this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        if (sideC > 0 && sideC < 20)
            this.sideC = sideC;
    }

    private static boolean isTriangleValid(Triangle triangle) {
        if (triangle.sideA >= triangle.sideC + triangle.sideB)
            return false;
        if (triangle.sideB >= triangle.sideA + triangle.sideC)
            return false;
        return triangle.sideC < triangle.sideB + triangle.sideA;
    }

    public static boolean check(Triangle triangle) {
        return isTriangleValid(triangle);
    }

    static boolean checkRightTriangle(Triangle triangle) {
        if (check(triangle)) {
            if (triangle.sideA == Math.sqrt(Math.pow(triangle.sideC, 2) +
                    Math.pow(triangle.sideB, 2)))
                return true;
            if (triangle.sideB == Math.sqrt(Math.pow(triangle.sideC, 2) +
                    Math.pow(triangle.sideA, 2)))
                return true;
            return triangle.sideC == Math.sqrt(Math.pow(triangle.sideA, 2) +
                    Math.pow(triangle.sideB, 2));
        }
        return false;
    }

    void countSquarePerimeter(Triangle triangle) {
        Scanner scanner = new Scanner(System.in);
        int Perimeter = triangle.sideA + triangle.sideB + triangle.sideC;
        if (Triangle.check(triangle)) {
            System.out.println("For square press 1 or press 2 for perimeter");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(Math.sqrt(Perimeter * (Perimeter - sideA) * (Perimeter - sideB) * (Perimeter - sideC)));
                case 2:
                    System.out.println(Perimeter);
            }
        } else
            System.out.println("Invalid triangle");
    }
}

