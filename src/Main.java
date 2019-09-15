import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Human> humanList = new ArrayList<Human>();
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Human Alex = new Human("York", 12, 10, 100);
        Animal Ice = new Animal("Bodya", 2, 20,false);

        System.out.println(Alex);

        Function<Human, Animal> humanToAnimal = Human -> (
                new Animal(Human.getName(), Human.getAge(), Human.getWeight()
                )
        );

        humanList.stream().map((h)-> humanToAnimal.apply(h))
                .collect(Collectors.toList(animalList))
                .forEach(System.out::println);


    }
}
