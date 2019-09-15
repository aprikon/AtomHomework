public class Human {
    private String name;
    private int age;
    private int weight;
    private int iq;

    //конструктор
    Human(String name, int age, int weight, int iq) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.iq = iq;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getAge() {
        return this.age;
    }

    public int getIq() {
        return this.iq;
    }

}