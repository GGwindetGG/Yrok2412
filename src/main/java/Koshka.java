public class Koshka {
  private  String color, name;
  private int age;
  private Glass kosha;

    @Override
    public String toString() {
        return "Koshka{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", kosha=" + kosha +
                '}';
    }

    public Koshka(String color, String name, int age, Glass kosha) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.kosha = kosha;
    }
}
