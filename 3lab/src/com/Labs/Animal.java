package src.com.Labs;

abstract class Animal {
    private final String name;
    private final int age;
    private final String favouriteFood;
    private final String animalName;
 
    protected Animal(String name, int age, String favouriteFood, String animalName) {
        this.name = name;
        this.age = age;
        this.favouriteFood = favouriteFood;
        this.animalName = animalName;
    }
 
    @Override
    public String toString() {
        return animalName + " " + name + " likes eat " + favouriteFood + " most of all, it's " + age + " years old!";
    }
 
}
