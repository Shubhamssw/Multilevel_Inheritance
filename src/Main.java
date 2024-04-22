class Animal {

    String name;


    public Animal(String name) {
        this.name = name;
    }


    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }


    @Override
    void sound() {
        System.out.println(getName() + " barks.");
    }


    public String getName() {
        return this.name;
    }
}

class Bulldog extends Dog {

    public Bulldog(String name) {
        super(name);
    }


    @Override
    void sound() {
        System.out.println(getName() + " snorts and barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Generic Animal");
        Dog myDog = new Dog("Rex");
        Bulldog myBulldog = new Bulldog("Bruno");

        myAnimal.sound();
        myDog.sound();
        myBulldog.sound();
    }
}
