package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Cat extends PetAnimal {
    String inOrOutdoor;
    String favFood = "birds";

    public Cat(String name, String bossName, String sex, String race, String inOrOutdoor) {
        super(name, bossName, sex, race);
        this.inOrOutdoor = inOrOutdoor;
    }

    @Override
    public void sound() {
        System.out.println("miauwmiauw");
    }

    @Override
    public void eat() {
        System.out.println("eats " + favFood);
    }
}