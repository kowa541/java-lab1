import java.util.Arrays;
import java.util.Scanner;

public class MainFour {

    public static void main(String[] args) {
        System.out.println("Лабораторная 1. Массивы");
        Scanner me = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите задание из списка 6,7,8,9,10 или 0 для завершения");
            System.out.print("Введите Ваш выбор: ");
            String input = me.nextLine();
            if (input.equals("0")) {
                System.out.println("Завершение работы");
                break;
            }
            switch (input) {
                case "6":
                    System.out.println("Реверс массива");
                    int[] arr6 = getArray(me);
                    if (arr6 != null) {
                        reverse(arr6);
                        System.out.println(Arrays.toString(arr6));
                    }
                    break;
                case "7":
                    System.out.println("Реверс нового массива");
                    int[] arr7 = getArray(me);
                    if (arr7 != null) {
                        System.out.println(Arrays.toString(reverseBack(arr7)));
                    }
                    break;
                case "8":
                    System.out.println("Объединение массивов");
                    int[] arr8 = getArray(me);
                    int[] arr81 = getArray(me);
                    if (arr8 != null && arr81 != null) {
                        System.out.println(Arrays.toString(concat(arr8, arr81)));
                    }
                    break;
                case "9":
                    System.out.println("Индексы вхождения x в массиве");
                    System.out.print("Введите x ");
                    try {
                        int x = Integer.parseInt(me.nextLine().trim());
                        int[] arr9 = getArray(me);
                        if (arr9 != null) {
                            System.out.println(Arrays.toString(findAll(arr9, x)));
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Это не целое число.");
                    }
                    break;
                case "10":
                    System.out.println("Только положительные элементы");
                    int[] arr10 = getArray(me);
                    if (arr10 != null) {
                        System.out.println(Arrays.toString(deleteNegative(arr10)));
                    }
                    break;
                default:
                    System.out.println("Нет такого номера");
                    break;

            }

        }
    }

    public static int[] getArray(Scanner me) {
        System.out.print("Введите массив: ");
        String input = me.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Ввод пустой.");
            return null;
        }

        String[] array = input.split("\\s+");
        int[] numbers = new int[array.length];
        boolean valid = true;

        for (int i = 0; i < array.length; i++) {
            try {
                numbers[i] = Integer.parseInt(array[i]);
            } catch (NumberFormatException e) {
                System.out.println("'" + array[i] + "' — не целое число.");
                valid = false;
            }
        }

        if (!valid) {
            return null;
        }
        return numbers;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int p = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = p;
        }
    }


    public static int[] reverseBack(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            arr1[arr.length-i-1] = arr[i];
        }
        return arr1;
    }

    public static int[] concat(int [] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arr3[i+ arr1.length] = arr2[i];
        }
        return arr3;
    }


    public static int[] findAll(int[] arr, int x){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                counter++;
            }
        }
        int[] arr1 = new int[counter];
        counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                arr1[counter] = i;
                counter++;
            }
        }
        return arr1;

    }

    public static int[] deleteNegative(int[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                counter++;
            }
        }
        int[] arr1 = new int[counter];
        counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                arr1[counter] = arr[i];
                counter++;
            }
        }
        return arr1;

    }
}
