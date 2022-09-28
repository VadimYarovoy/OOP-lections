package L5;


import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<CatAssasin> catAssasins = new ArrayList<>();

        addCat(animals);
        addCat(catAssasins);

        print(animals);
        print(catAssasins);

        Cat cat = catAssasins.get(0);

        //deleteCat(animals, cat);
        deleteCat(catAssasins, cat);
    }

    public static void deleteCat(List<? extends  Cat> cats, Cat cat) {
        cats.remove(cat);
        System.out.println("Cat removed");
    }

    public static void print(List<?> list) {
        for (Object o: list) {
            System.out.println(0);
        }
    }

    public static void addCat(List<? super CatAssasin> cats) {
        cats.add(new CatAssasin("Эцио"));
        System.out.println("Cat added");
    }

    static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

    }

    static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }
    }

    static class CatAssasin extends Cat {
        public CatAssasin(String name) {
            super(name);
        }
    }
}
