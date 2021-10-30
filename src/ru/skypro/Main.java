package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
//   task4();
        task5();
        task6();
    }


    private static void task1() {
        int[] monthExpense = {155_002, 100_670, 141_000, 163_000, 105_707, 140_000, 150_000, 125_000, 100_087, 100_450, 168_777, 100_000, 100_052, 108_000, 100_065, 100_047, 104_000, 100_007, 100_050, 136_057, 100_000, 100_000, 100_000, 100_000, 100_350, 100_520, 108_000, 189_000, 200_000, 107_000};
        int sum = 0;
        for (int i = 0; i < monthExpense.length; i++) {
            sum = sum + monthExpense[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    private static void task2() {
        int[] monthExpense = {155_002, 100_670, 141_000, 163_000, 105_707, 140_000, 150_000, 125_000, 100_087, 100_450, 168_777, 100_000, 100_052, 108_000, 100_065, 100_047, 104_000, 100_007, 100_050, 136_057, 100_000, 100_000, 100_000, 100_000, 100_350, 100_520, 108_000, 189_000, 200_000, 107_000};
        int smallest = monthExpense[0];
        int largest = monthExpense[0];
        for (int i = 0; i <= 29; i++) {
            if (monthExpense[i] < smallest) {
                smallest = monthExpense[i];
            }
            if (monthExpense[i] > largest) {
                largest = monthExpense[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + smallest + " рублей. Максимальная сумма трат за день составила " + largest + " рублей.");
    }


    private static void task3() {
        int[] monthExpense = {155_002, 100_670, 141_000, 163_000, 105_707, 140_000, 150_000, 125_000, 100_087, 100_450, 168_777, 100_000, 100_052, 108_000, 100_065, 100_047, 104_000, 100_007, 100_050, 136_057, 100_000, 100_000, 100_000, 100_000, 100_350, 100_520, 108_000, 189_000, 200_000, 107_000};
        int sum = 0;
        int average = 0;
        for (int i = 0; i < monthExpense.length; i++) {
            sum = sum + monthExpense[i];
            average = sum / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char i = 0;
        for(final char correctFullName : reverseFullName) {
            if(reverseFullName[i] < 1 )
                System.out.print(correctFullName);

            /// I cannot catch how to generate a loop to get the correct answer
        }
    }


    private static void task5() {
        int[][] arr = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[0][2] = 1;
        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[2][0] = 1;
        arr[2][1] = 0;
        arr[2][2] = 1;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }
    }

    private static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int [] arr2 = {5, 4, 3, 2, 1};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
