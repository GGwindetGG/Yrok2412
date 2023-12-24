import java.util.Scanner;

public class ResultKalikeliatora {
    public static void main(String[] args) {
        int chislo1, chislo2;
        String znak;
        Scanner chisla = new Scanner(System.in);
        System.out.println("Напишите число: ");
        chislo1 =chisla.nextInt();
        System.out.println("Напишите число: ");
        chislo2 =chisla.nextInt();
        System.out.println("Введите знак. Доступные знаки: / = деление, * = умножение, - = минус, + = плюс:");
        znak=chisla.next();
        switch (znak){
            case "+":
                System.out.println("Ваш результат: " +Rkalikeiator.plusi(chislo1,chislo2));
                break;
        }
        switch (znak){
            case "-":
                System.out.println("Ваш результат: " +Rkalikeiator.minysi(chislo1,chislo2));
                break;
        }
        switch (znak){
            case "/":
                System.out.println("Ваш результат: " +Rkalikeiator.delenie(chislo1,chislo2));
            break;
        }
        switch (znak){
            case "*":
                System.out.println("Ваш результат: " +Rkalikeiator.ymnozenie(chislo1,chislo2));
                break;
        }
    }
}
