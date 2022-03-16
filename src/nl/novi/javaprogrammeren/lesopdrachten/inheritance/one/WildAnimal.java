package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public abstract class  WildAnimal extends Animal{
    String name;
    String shedName;
    int lastFeed;
    String land;
    double movement;

    public WildAnimal(String name, String shedName, int lastFeed, String land){
        this.name = name;
        this.shedName = shedName;
        this.lastFeed = lastFeed;
        this.land = land;
    }

    public double move(){
        movement += 0.5;
        System.out.println(name + " has moved " + movement);
        return movement;
    }



    }

