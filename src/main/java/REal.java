import java.util.Scanner;

public class REal {
    public static void main(String[] args) {
        int ber, jer;
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число1:");
        ber= in.nextInt();
        Scanner rec = new Scanner(System.in);
        System.out.println("Введи число2:");
        jer= in.nextInt();
        if (ber % 2 ==0&&jer>ber){
            System.out.println(jer +" - Это число больше и чётное. ");
        }





    }
}

