package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class PetAnimal extends Animal {
    String name;
    String bossName;
    String sex;
    String race;
    double movement;



    public PetAnimal(String name, String bossName, String sex, String race) {
        this.name = name;
        this.bossName = bossName;
        this.sex = sex;
        this.race = race;
    }



    public double move(){
        movement += 0.25;
        System.out.println(name + " has moved " + movement);
        return movement;
    }




}





