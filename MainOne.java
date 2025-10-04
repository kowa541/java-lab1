import java.util.Scanner;

public class MainOne {

    public static void main(String[] args) {
        System.out.println("Лабораторная 1. Методы");
        Scanner me = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите задание из списка 6,7,8,9,10 или 0 для завершения");
            System.out.print("Введите Ваш выбор: ");
            String input = me.nextLine().trim();
            if (input.equals("0")){
                System.out.println("Завершение работы");
                break;
            }
            switch (input){
                case "6":
                    System.out.println("Возвращает true если введена большая латинская буква");
                    System.out.print("Введите символ: ");
                    String x = me.nextLine();
                    if (x.length() == 1){
                        System.out.println(isUpperCase(x.charAt(0)));
                    }
                    else{
                        System.out.println("Некорректнный ввод");
                    }
                    break;
                case "7":
                    System.out.println("Возвращает истинность вхождения числа в диапазон");
                    System.out.print("Введите границы диапазона и число: ");
                    String[] numbers = me.nextLine().trim().split("\\s+");
                    if (numbers.length == 3) {
                        try {
                            int a = Integer.parseInt(numbers[0]);
                            int b = Integer.parseInt(numbers[1]);
                            int num = Integer.parseInt(numbers[2]);
                            System.out.println(isInRange(a, b, num));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно три числа.");
                    }
                    break;
                case "8":
                    System.out.println("Одно из принятых чисел делит другое нацело");
                    System.out.print("Введите два числа ");
                    String[] div = me.nextLine().trim().split("\\s+");
                    if (div.length == 2) {
                        try {
                            int z = Integer.parseInt(div[0]);
                            int y = Integer.parseInt(div[1]);
                            System.out.println(isDivisor(z, y));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно два числа.");
                    }
                    break;
                case "9":
                    System.out.println("Возвращает истинность равенства трёх чисел");
                    System.out.print("Введите три целых числа ");
                    String[] equ = me.nextLine().trim().split("\\s+");
                    if (equ.length == 3) {
                        try {
                            int f = Integer.parseInt(equ[0]);
                            int s = Integer.parseInt(equ[1]);
                            int t = Integer.parseInt(equ[2]);
                            System.out.println(isEqual(f, s, t));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно три числа.");
                    }
                    break;
                case "10":
                    System.out.println("Сумма единиц пяти чисел");
                    System.out.print("Введите пять чисел ");
                    String[] summa = me.nextLine().trim().split("\\s+");
                    if (summa.length == 5) {
                        try {
                            int q = Integer.parseInt(summa[0]);
                            int w = Integer.parseInt(summa[1]);
                            int e = Integer.parseInt(summa[2]);
                            int r = Integer.parseInt(summa[3]);
                            int t = Integer.parseInt(summa[4]);
                            System.out.println(lastNumSum(q, w, e, r, t));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно пять чисел.");
                    }
                    break;
                default:
                    System.out.println("Нет такого номера");
                    break;

            }

        }
    }


    public static boolean isUpperCase(char x){
        return x>='A' && x<='Z';
    }

    public static boolean isInRange(int a, int b, int num){
        return num<=a && num>=b || num<=b && num>=a;
    }

    public static boolean isDivisor(int z, int y){
        return z!=0 && y%z==0 || y!=0 && z%y==0;
    }

    public static boolean isEqual(int f, int s, int t){
        return f==s && s==t;
    }

    public static int lastNumSum(int q, int w, int e, int r, int t){
        return ((((((getLastDigit(q) + getLastDigit(w)) % 10
                + getLastDigit(e)) % 10
                + getLastDigit(r)) % 10
                + getLastDigit(t))));
    }

    private static int getLastDigit(int n) {
        return Math.abs(n % 10);
    }
}