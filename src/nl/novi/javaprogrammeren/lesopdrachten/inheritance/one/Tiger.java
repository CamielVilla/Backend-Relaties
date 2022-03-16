package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Tiger extends WildAnimal {
    int numberOfStripes;
    String favFood = "antilopen";

    public Tiger (String name, String shedName, int lastFeed, String land, int numberOfStripes) {
        super(name, shedName, lastFeed, land);
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void eat() {
        System.out.println("eats " + favFood);
    }

    @Override
    public void sound() {
        System.out.println("roar");
    }
}