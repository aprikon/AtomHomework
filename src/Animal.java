public class Animal {
    private String name;
    private int age;
    private int weight;
    private boolean wood;

    //конструктор
    Animal(String name, int age, int weight, boolean wood) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.wood = wood;
    }
    Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

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

    public boolean getWood() {
        return this.wood;
    }





}