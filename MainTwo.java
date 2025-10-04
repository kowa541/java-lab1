import java.util.Scanner;

public class MainTwo {

    public static void main(String[] args) {
        System.out.println("Лабораторная 1. Условия");
        Scanner me = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Выберите задание из списка 6,7,8,9,10 или 0 для завершения");
            System.out.print("Введите Ваш выбор: ");
            String input = me.nextLine();
            if (input.equals("0")){
                System.out.println("Завершение работы");
                break;
            }
            switch (input){
                case "6":
                    System.out.println("Сумма двух чисел это третье число");
                    System.out.print("Введите три числа: ");
                    String[] numbers = me.nextLine().trim().split("\\s+");
                    if (numbers.length == 3) {
                        try {
                            int a = Integer.parseInt(numbers[0]);
                            int b = Integer.parseInt(numbers[1]);
                            int c = Integer.parseInt(numbers[2]);
                            System.out.println(sum3(a, b, c));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно три числа.");
                    }
                    break;
                case "7":
                    System.out.println("Сумма чисел с условием");
                    System.out.print("Введите два числа: ");
                    String[] summa = me.nextLine().trim().split("\\s+");
                    if (summa.length == 2) {
                        try {
                            int a = Integer.parseInt(summa[0]);
                            int b = Integer.parseInt(summa[1]);
                            System.out.println(sum2(a, b));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целые числа.");
                        }
                    } else {
                        System.out.println("Нужно два числа.");
                    }
                    break;
                case "8":
                    System.out.println("Количество год/года/лет");
                    System.out.print("Введите возраст ");
                        try {
                            int z = Integer.parseInt(me.nextLine().trim());
                                System.out.println(age(z));
                        } catch (NumberFormatException e) {
                                System.out.println("Это не целое число.");
                            }

                    break;
                case "9":
                    System.out.println("Число в день недели");
                    System.out.print("Введите целое число ");
                        try {
                            int f = Integer.parseInt(me.nextLine().trim());
                            System.out.println(day(f));
                        } catch (NumberFormatException e) {
                            System.out.println("Это не целое число.");
                        }
                    break;
                case "10":
                    System.out.println("Список дней с нынешнего");
                    System.out.print("Введите день недели ");
                    printDays(me.nextLine().toLowerCase());
                    break;
                default:
                    System.out.println("Нет такого номера");
                    break;

            }

        }
    }
    public static boolean sum3(int x, int y, int z){
        return x+y==z||x+z==y||z+y==x;
    }


    public static int sum2(int x, int y){
        return (x+y>=10&&x+y<=19)?20:x+y;
    }

    public static String age(int x){
        if (x%10 ==1 && x!=11){
            return x+" год";
        }
        if ((x%10 == 2 || x%10 == 3 || x%10 == 4) && (x !=12) && (x != 13) && (x != 14)){
            return x+" года";
        }
        return x+" лет";
    }

     public static String day(int x){
         return switch (x) {
             case 1 -> "понедельник";
             case 2 -> "вторник";
             case 3 -> "среда";
             case 4 -> "четверг";
             case 5 -> "пятница";
             case 6 -> "суббота";
             case 7 -> "воскресенье";
             default -> "это не день недели";
         };
     }

    public static void printDays(String x){
        switch (x){
            case "понедельник":
                System.out.println(x);
                x = "вторник";
            case "вторник":
                System.out.println(x);
                x = "среда";
            case "среда":
                System.out.println(x);
                x = "четверг";
            case "четверг":
                System.out.println(x);
                x = "пятница";
            case "пятница":
                System.out.println(x);
                x = "суббота";
            case "суббота":
                System.out.println(x);
                x = "воскресенье";
            case "воскресенье":
                System.out.println(x);
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}
