package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Lion extends WildAnimal {

    int numberOfPups;
    String favFood = "hyena's";

    public Lion(String name, String shedName, int lastFeed, String land, int numberOfPups) {
        super(name, shedName, lastFeed, land);
        this.numberOfPups = numberOfPups;
    }

    @Override
    public void eat() {
        System.out.println("eats " + favFood);
    }

    @Override
    public void sound() {
        System.out.println("miauw");
    }
}
