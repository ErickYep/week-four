package day1;

public class Sort {
   static void sort(Student[] array, int age) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].age > array[j + 1].age) {
                    temp = array[j].age;
                    array[j].age = array[j + 1].age;
                    array[j + 1].age = temp;
                }
            }
        }
    }

   static void sort(Student[] array, String name) {
        String min = array[0].name;

        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].name.compareTo(min) < 0) {
                    min = array[j].name;
                    index = j;
                    count++;
                }
            }
            if (count == 0) {
                min = array[i + 1].name;
                continue;
            }
            array[index].name = array[i].name;
            array[i].name = min;
            min = array[i + 1].name;
            count = 0;
        }
    }

   static void sort(Student[] array, double weight) {
        double temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].weight > array[j + 1].weight) {
                    temp = array[j].weight;
                    array[j].weight = array[j + 1].weight;
                    array[j + 1].weight = temp;
                }
            }
        }
    }
}
