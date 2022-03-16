package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class App {


    public static void main (String[] args) {

        Lion simba = new Lion("simba", "crib", 3, "zuid-afrika", 4);
        Tiger mama = new Tiger("mama", "wild", 3, "belgië", 88);
        Wolf bigbadwolf = new Wolf("bigbadwolf", "forest", 4, "netherlands", "wolfpack");

       Dog hondje = new Dog("hondje", "baas", "male", "golden retriever");
       Cat felix = new Cat("felix", "catboss", "female", "trashcat", "outdoor");

       simba.move();
       felix.move();
       mama.eat();
       hondje.eat();
       bigbadwolf.sound();

    }

    }

