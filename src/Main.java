import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задачи 1 и 2");
        {
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            for (int a = 0; a < 3; a++) {
            System.out.print(numbers[a] + ",");
            }
            System.out.println();

            //
            double[] numbers1 = {1.57, 7.654, 9.986};
            for (int b = 0; b < numbers1.length; b++) {
                System.out.print(numbers1[b] + ",");
            }
            System.out.println();
            //
            int[] lenght = new int[5];
            lenght[0] = 111;
            lenght[1] = 112;
            lenght[2] = 113;
            lenght[3] = 114;
            lenght[4] = 115;
            for (int c = 0; c < 5; c++) {
                System.out.print(lenght[c] + ",");
            }
            System.out.println();

        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int a = 2; a >= 0; a--) {
            System.out.print(numbers[a] + ",");
        }
        System.out.println();

        double[] numbers1 = {1.57, 7.654, 9.986};
        for (int b = numbers1.length - 1; b >= 0; b--) {
            System.out.print(numbers1[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int[] lenght = new int[5];
        lenght[0] = 111;
        lenght[1] = 112;
        lenght[2] = 113;
        lenght[3] = 114;
        lenght[4] = 115;
        for (int c = 4; c >= 0; c--) {
            System.out.print(lenght[c] + ",");
        }
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[10];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] % 2 == 1) {
                arr[a] = arr[a] + 1;
            }
        }
        System.out.println("Итоговый массив: " + Arrays.toString(arr));

    }
    }
