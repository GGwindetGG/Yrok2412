import java.util.Scanner;

public class Klass {
    public static void main(String[] args) {
        int num1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        num1 = in.nextInt();
        if (num1 > 0 && num1 < 8) {

            System.out.println(num1 + " это число не больше 7 и не меньше 1");}
        else {
            System.out.println("Вы ввели меньше или больше 7 и 1");
        }
        if (num1 == 1 && num1  <2) {
            System.out.println("Сейчас Понедельник.");
        }
        if (num1 == 2 && num1  <3) {
            System.out.println("Сейчас Вторник.");
        }
        if (num1 == 3 && num1  <4) {
            System.out.println("Сейчас Среда.");
        }
        if (num1 == 4 && num1  <5) {
            System.out.println("Сейчас Четверг.");
        }
        if (num1 == 5 && num1  <6) {
            System.out.println("Сейчас Пятница.");
        }
        if (num1 == 6 && num1  <7) {
            System.out.println("Сейчас Суботта.");
        }
        if (num1 == 7 && num1  <8) {
            System.out.println("Сейчас Воскресенье.");
        }

        }
    }

