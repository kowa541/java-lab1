import java.util.Scanner;
import java.util.Random;

public class MainThree {

    public static void main(String[] args) {
        System.out.println("Лабораторная 1. Циклы");
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
                    System.out.println("Все знаки числа одинаковые");
                    System.out.print("Введите число: ");

                        try {
                            int a = Integer.parseInt(me.nextLine());
                            System.out.println(equalNum(a));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целое число.");
                        }
                    break;
                case "7":
                    System.out.println("Квадрат n*n");
                    System.out.print("Введите n: ");
                        try {
                            int a = Integer.parseInt(me.nextLine().trim());
                            square(a);
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целое число.");
                        }
                    break;
                case "8":
                    System.out.println("Левый треугольник");
                    System.out.print("Введите длину основания ");
                    try {
                        int z = Integer.parseInt(me.nextLine().trim());
                        leftTriangle(z);
                    } catch (NumberFormatException e) {
                        System.out.println("Это не целое число.");
                    }

                    break;
                case "9":
                    System.out.println("Правый треугольник");
                    System.out.print("Введите длину основания ");
                    try {
                        int f = Integer.parseInt(me.nextLine().trim());
                        rightTriangle(f);
                    } catch (NumberFormatException e) {
                        System.out.println("Это не целое число.");
                    }
                    break;
                case "10":
                    System.out.println("Угадай число от 0 до 9");
                    guessGame(me);
                    break;
                default:
                    System.out.println("Нет такого номера");
                    break;

            }

        }
    }


    public static boolean equalNum(int x) {
        String str = Integer.toString(Math.abs(x));
        char flag = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != flag) {
                return false;
            }
        }
        return true;
    }


    public static void square(int x) {
        if (x<0){
            System.out.println("Некорректное n");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void leftTriangle(int x) {
        if (x<0){
            System.out.println("Некорректное n");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void rightTriangle(int x) {
        if (x<0){
            System.out.println("Некорректное n");
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x-i; j++) {
                System.out.print(" ");
            }
            for (int j = x-i; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }

    public static void guessGame(Scanner me){
        Random randme = new Random();
        int randomNum = randme.nextInt(10);
        int counter = 0;
        while (true){
           counter++;
            try {
                System.out.print("Введите число ");
                int user = Integer.parseInt(me.nextLine().trim());
                if (user == randomNum){
                    System.out.println("Угадано. Потребовалось попыток "+counter);
                    break;
                }
                else{
                    System.out.println("Неверно");
                }
            } catch (NumberFormatException e) {
                System.out.println("Это не целое число.");
            }

        }
    }
}


