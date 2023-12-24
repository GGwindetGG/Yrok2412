public class Sobaka {
    int ves, age;
    String pol, poroda, tswet;

    public Sobaka(int ves, int age) {
        this.ves = ves;
        this.age = age;
    }

    public Sobaka(String pol, String poroda, String tswet) {
        this.pol = checkMale(pol);
        this.poroda = poroda;
        this.tswet = checkTswet(tswet);
    }

    public Sobaka(int ves, int age, String pol, String poroda, String tswet) {
        this.ves = ves;
        this.pol = checkMale(pol);
        this.poroda = poroda;
        this.tswet = checkTswet(tswet);
        if (age < 1 || age > 20) {
            this.age = 5;

        } else {
            this.age = age;
        }

    }

    private String checkMale(String checkmale) {
        if (checkmale.equals("male") || checkmale.equals("famele")){
            return checkmale;
        }else {
            return "male";
        }

    }

    @Override
    public String toString() {
        return "Sobaka{" +
                "ves=" + ves +
                ", age=" + age +
                ", pol='" + pol + '\'' +
                ", poroda='" + poroda + '\'' +
                ", tswet='" + tswet + '\'' +
                '}';
    }

    private String checkTswet(String checktswet){
        switch (checktswet){
            case "Yellow":
                return checktswet;
            case "Orange":
                return checktswet;
            case "Red":
                return checktswet;
            case "Blue":
                return checktswet;
            case "Green":
                return checktswet;
            case "Purple":
                return checktswet;
            case "Pink":
                return checktswet;


        }

        return "White";

    }
}
