package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Wolf extends WildAnimal {
    String packName;
    String favFood = "sheep";

    public Wolf(String name, String shedName, int lastFeed, String land, String packName) {
        super(name, shedName, lastFeed, land);
        this.packName = packName;
    }

    @Override
    public void eat() {
        System.out.println("eats " + favFood);
    }
    @Override
    public void sound() {
        System.out.println("woof");
    }
}