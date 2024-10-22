import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static java.lang.String String;

    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSing();
        //printColor();
        //compareNumbers();
        //checkSum();
        //checkPositiveNumber();
        //checkPositiveNumberTrue();
        //printString(String);
        //checkLeapYearTrue();
        //changeArray();
        //insertArray();
        changeMultiArray();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing() {
        int a = 1;
        int b = a + 1;
        if ((a+b) >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;
              if (value <= 0) {
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSum() {
        System.out.println("Введите целое число a и нажмите <Enter>: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите целое число b и нажмите <Enter>: ");
        int b = new Scanner(System.in).nextInt();
        return (a + b) <= 20 && (a + b) >= 10;
    }

    public static void checkPositiveNumber() {
        System.out.println("Введите целое число и нажмите <Enter>: ");
        int a = new Scanner(System.in).nextInt();
              if (a >= 0)  {
                  System.out.println("Число положительное");
        }
        else {
                  System.out.println("Число отрицательное");
        }
    }

    public static boolean checkPositiveNumberTrue() {
        System.out.println("Введите целое число и нажмите <Enter>: ");
        int a = new Scanner(System.in).nextInt();
        return a >= 0;
    }

    public static void printString(String txtToPrint) {
        txtToPrint = "привет";
        int j = 2;
        for (int i = 0; i < j;  i = i + 1) {
            System.out.println(txtToPrint);
            }

        }


    public static boolean checkLeapYearTrue() {
        System.out.println("Введите целое число - год для проверки и нажмите <Enter>: ");
        int a = new Scanner(System.in).nextInt();
        return a % 4 == 0;
    }

    static void changeArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));

        // change Array
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println(Arrays.toString(array));
    }

    static int[] insertArray() {
        int[] array = new int[100];
        System.out.println(Arrays.toString(array));

        //  insert Array
        for (int i = 0, j = 0; i < array.length; i++, j += 1)
            array[i] = j;
        System.out.println(Arrays.toString(array));
        return array;
    }

    static void changeMultiArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 2;
        System.out.println(Arrays.toString(array));
    }



}