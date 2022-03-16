package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Dog extends PetAnimal {
    String favFood = "brokken";

    public Dog(String name, String bossName, String sex, String race) {
        super(name, bossName, sex, race);
    }

    @Override
    public void sound() {
        System.out.println("woof");
    }

    @Override
    public void eat() {
        System.out.println("eats " + favFood);
    }
}