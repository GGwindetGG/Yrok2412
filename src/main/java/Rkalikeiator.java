public class Rkalikeiator {
    public static int plusi(int chislo1, int chislo2) {
        int result;
        result = chislo1 + chislo2;

        return result;
    }
public static int minysi(int chislo1, int chislo2) {
        int result;
        result = chislo1 - chislo2;
        return result;
}
public static int ymnozenie(int chislo1, int chislo2){
        int result;
        result = chislo1 * chislo2;
        return result;
}
public static int delenie(int chislo1, int chislo2){
        if(chislo2!=0){
            int result;
            result = chislo1 / chislo2;
            return result;

        }
        else{
            System.out.println("Ошибка!");
            return 0;
        }



}
}
