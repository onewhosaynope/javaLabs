package src.com.Labs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Deer("Бемби", 5, "Трава"));
        zoo.add(new Fox("Хитрица", 3, "Мясо"));
        zoo.add(new Wolf("Серый", 7, "Мясо"));

        for (Animal a : zoo) {
            System.out.println(a);
        }
    }

}
