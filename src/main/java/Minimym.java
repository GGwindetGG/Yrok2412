public class Minimym {
    public static int Mini(int[] min) {
        int size = min.length, minimymA = min[0];
        for (int i = 0; i < size; i++) {
            if (minimymA > min[i]) {
                minimymA = min[i];
            }
        }
        return minimymA;
    }

    public static int Suma(int[] summ) {
        int  syma =0;
        for (int i = 0; i < summ.length; i++ ) {
            syma=syma+summ[i];
        }
        return syma;
    }
}



