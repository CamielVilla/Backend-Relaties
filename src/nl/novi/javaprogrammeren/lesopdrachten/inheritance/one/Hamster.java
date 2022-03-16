package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Hamster extends PetAnimal{

    int numberOfTurnsInRad = 0;
    String favFood = "sunflowerseeds";

    public Hamster(String name, String bossName, String sex, String race) {
        super(name, bossName, sex, race);
    }


    public void getsInRad(int numberOfTimes) {
        numberOfTurnsInRad =+ 50;
        int totalTurns = numberOfTimes * numberOfTurnsInRad;
        System.out.println(name + "turned " + totalTurns + " times.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats " + favFood);
    }
}
