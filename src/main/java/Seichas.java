import java.util.Scanner;

public class Seichas {
    public static void main(String[] args) {
        int real;
        Scanner oreo = new Scanner(System.in);
        System.out.println("Введите 1 любое число: ");
        real = oreo.nextInt();
        System.out.printf("Ввели число: " + real);
        if (real % 2 == 0 && real > 10 && real < 45) {
            System.out.println(" - Это число Чётное и не меньше 10, и не больше 45. ");
        }


    }
}