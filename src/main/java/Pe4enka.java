import java.util.Scanner;

public class Pe4enka {
    public static void main(String[] args) {
        String[] v = new String[3];

        Scanner rp = new Scanner(System.in);
        System.out.println("Введите имя:");
        v [0] = rp.next();
        System.out.println("Ваше Имя: " +v[0]);
        System.out.println("Введите Фамилию:");
        v [1] = rp.next();
        System.out.println("Ваша Фамилия: " +v[1]);
        System.out.println("Введите оттчество:");
        v [2] = rp.next();
        System.out.println("Ваше оттчество: " +v[2]);
        System.out.println("Ваше имя и фамилия, и оттчество: " +v[0] + " " + v[1] + " " +v[2]);
    }
}
