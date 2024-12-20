package by.tatevik.arrays_task;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 13, 2, 1, 7, 11, 12, 4, 5, 10};
        printOddNumbers(arr);
        printEvenNumbers(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);
        countPrimeNumbers(arr);
        printArrElemSum(arr);
        oddIndexNumSum(arr);
        evenIndexNumSum(arr);
        printEvenIndexNumbers(arr);
        printOddIndexNumbers(arr);
        oddEvenNumIndxSubstract(arr);
        zeroNumCount(arr);
        sortArrAscending(arr);
        sortArrDesscending(arr);
    }

    public static void countEvenNumbers(int[] arr) {
        int evenNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum++;
            }
        }
        System.out.print("\n Количество четных элементов массива arr: " + evenNum);
    }

    public static void countOddNumbers(int[] arr) {
        int oddNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNum++;
            }
        }
        System.out.print("\n Количество нечетных элементов массива arr: " + oddNum);
    }

    public static void printEvenNumbers(int[] arr) {
        System.out.print("Четные элементы массива arr: \n");
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 == 0)
                System.out.println(arr[x]);
    }

    public static void printOddNumbers(int[] arr) {
        System.out.print("\n Нечетные элементы массива arr: \n");
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 != 0)
                System.out.println(arr[x]);
    }

    public static void printArrElemSum(int[] arr) {
        int sum = 0;
        // Прибавляем к переменной sum каждый элемент массива.
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // Вывод результата на экран.
        System.out.println("\n Сумма элементов массива arr: " + sum);
    }

    public static boolean isNumberPrime(int i) {
        if (i <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimeNumbers(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isNumberPrime(arr[i])) {
                counter++;
            }
        }
        System.out.println("\n Количество простых чисел массива arr: " + counter);
        return counter;
    }

    public static void oddIndexNumSum(int[] arr) {
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sumOdd += arr[i];
            }
        }
        System.out.println("\n Сумма элементов с нечётным индексом массива arr: " + sumOdd);

    }

    public static void evenIndexNumSum(int[] arr) {
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            }
        }
        System.out.println("\n Сумма элементов с чётным индексом массива arr: " + evenSum);

    }

    public static void printEvenIndexNumbers(int[] arr) {
        System.out.print("\nЭлементы массива arr с чётным индексом: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print("\nиндекс " + i + " = " + arr[i] + ", ");
            }
        }
    }

    public static void printOddIndexNumbers(int[] arr) {
        System.out.print("\nЭлементы массива arr с нечётным индексом: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print("\nиндекс " + i + " = " + arr[i] + ", ");
            }
        }
    }

    public static void oddEvenNumIndxSubstract(int[] arr) {
        int evenSum = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                sumOdd += arr[i];
            }
        }
        System.out.println("\n Разность суммы чисел с четными и нечетными индексами" + (evenSum - sumOdd));
    }

    public static void zeroNumCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

        }
        System.out.println("\n Количество чисел 0 в массиве arr " + count);
    }

    //сортировка массива по возрастанию
    public static void sortArrDesscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.println(arr[i]);
        }
    }

    //сортировка массива по убыванию
    public static void sortArrAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

//Дополнительное задание Работа с массивами 1:

//у нас есть массив из 10 случайных целых чисел, которые разбросаны в нем в случайном порядке.
// например int [] arr = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
//Необходимо вывести в консоль:

//1. количество четных чисел в массиве
//2. количество нечетных чисел в массиве
//3. количество простых чисел в массиве
//4. сумму всех чисел в массиве
//5. разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве
//6. количество 0 (сколько раз встречается число "0") в массиве



