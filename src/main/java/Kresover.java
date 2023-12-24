import java.sql.SQLOutput;
import java.util.Scanner;

public class Kresover {
    public static void main(String[] args) {
        int[] mass = new int[3];
        Scanner rek = new Scanner(System.in);
        System.out.println("Введи 1 число:");
        mass[0] = rek.nextInt();
        System.out.println("Вы ввели: " + mass[0]);
        System.out.println("Введи 2-е число:");
        mass[1] = rek.nextInt();
        System.out.println("Вы ввели: " + mass[1]);
        System.out.println("Введи 3-ее число:");
        mass[2] = rek.nextInt();
        System.out.println("Вы ввели: " + mass[2]);
        if (mass[0] > mass[1] && mass[0] > mass[2]) {
            System.out.println("Это самая большая ячейка из всех под числом: " + mass[0]);
        }
        if (mass[1] > mass[2] && mass[1] > mass[2]) {
            System.out.println("Это самая большая ячейка из всех под числом: " + mass[1]);
        }
        if (mass[2] > mass[0] && mass[2] > mass[1]) {
            System.out.println("Это самая большая ячейка из всех под числом: " + mass[2]);
        }
        if (mass[0] == mass[1] && mass[1] == mass[2]) {
            System.out.println("У вас нет самого большого числа, у вас все числа одинаковы.");
        }
        System.out.println("Какую ячейку вы хотите вывести? ");
        int kr;
        kr = rek.nextInt();
        if (kr >= mass.length) {
            System.out.println("Вы ввели не существующую ячеку. Всего может быть от 0 до 2.");
        } else {
            System.out.println(mass[kr]);
        }
        int rel, mer;
        rel = mass[0] + mass[1] + mass[2];
        System.out.println( mass[0] +" + " + mass[1]+ " + "   + mass[2]+ " = "  +rel);
        rel = mass[0] * mass[1] * mass[2];
        System.out.println(mass[0] + " * " + mass[1]+ " * " +mass[2] + " = " + rel);
        rel = mass[0] / mass[1];
        System.out.println(mass[0]+ " / "+mass[1]+ " / "+mass[2] + rel);


        if (mass[1] == 0) {
            System.out.println("error. Нельзя поделить на 0.");
        } else {
            mer = mass[0] / mass[1];
            System.out.println(mer);
        }

        if (mass[2] == 0) {
            System.out.println("error. Нельзя поделить на 0.");
        } else {
            mer = mass[1] / mass[2];
            System.out.println(mer);
        }

    }
}



