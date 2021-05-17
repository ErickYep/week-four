package day1;

import java.util.Scanner;

public class Arithmetic {
    int[] array;
    Scanner scanner = new Scanner(System.in);

    Arithmetic(int[] array) {
        this.array = array;
    }

    void options() {
        System.out.println("WHat you want to do`");
        System.out.println("1)Bubble Sort");
        System.out.println("3)Binary Search");
        System.out.println("4)Min Value");
        System.out.println("5)Max Value;");
        System.out.println("6)Average of array");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                bubbleSort(array,array.length);
                break;
            case 3:
                bubbleSort(array,array.length);
                System.out.println("What you want to search :");
                int number = scanner.nextInt();
                System.out.println("Your number index is " + binarySearch(array,number));
                break;
            case 4:
                bubbleSort(array,array.length);
                System.out.println(array[0]);
                break;
            case 5:
                bubbleSort(array,array.length);
                System.out.println(array[array.length-1]);
                break;
            case 6:
                System.out.println(average(array));
                break;
        }
    }

    void bubbleSort(int[] arr, int n) {
        if (n == 1)
            return;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        bubbleSort(arr, n - 1);
    }

    static int binarySearch(int[] array, int num, int start, int end) {
        int mid = start + (end - start) / 2;
        if (array[mid] == num)
            return mid;
        if (array[mid] < num)
            return binarySearch(array, num, mid, end);
        return binarySearch(array, num, start, mid);
    }

    static int binarySearch(int[] array, int num) {
        return binarySearch(array, num, 0, array.length - 1);
    }

    static int average(int[] array){
       int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }

    static boolean isArithmeticProgression(int[] array){
        int count =0;
        int temp = array[1]-array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]-array[i-1] == temp)
                count++;
        }
        return count == array.length-1;
    }
}
