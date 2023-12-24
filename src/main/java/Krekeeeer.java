import java.util.Scanner;

public class Krekeeeer {
    public static void main(String[] args) {
        int[] v= new int[15];
        v[0]=2; v[13]=28;
        v[1]=4;
        v[2]=6;
        v[3]=8;
        v[4]=10;
        v[5]=12;
        v[6]=14;
        v[7]=16;
        v[8]=18;
        v[9]=20;
        v[10]=22;
        v[11]=24;
        v[12]=26;

        v[14]=30;
        System.out.println(v[0]);
        System.out.println(v[2]);
        System.out.println(v[4]);
        System.out.println(v[6]);
        System.out.println(v[8]);
        System.out.println(v[10]);
        System.out.println(v[12]);
        System.out.println(v[14]);
        int rep;
        Scanner rp = new Scanner(System.in);
        System.out.println("Введи число:");
        rep = rp.nextInt();
        if (rep > 0 && rep < 14);{
            System.out.println("Это:" +v[rep]);
        }





    }
}
