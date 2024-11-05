package by.tatevik.arrays_task;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{5, -3, 2, 1, 7, 11, 12, -4, 1, 10};

        printOddNumbers(arr);
        printEvenNumbers(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);
        printArrElemSum(arr);

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
        System.out.print("Нечетные элементы массива arr: \n");
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 != 0)
                System.out.println(arr[x]);
    }
    public  static void printPrimeNumbers(int[] arr){

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



