/*Write a program to create a base class Fruit with name, taste and size as is attribute. Create a method EAT() which describe the names of the fruit and its taste.
* Inherit the same two other classes Apple and Mango and override the EAT() method to represent each fruit taste */
// Base class Fruit
public class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + ". It tastes " + taste + ".");
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Biting into an apple. It tastes sweet and crisp.");
    }
}

class Mango extends Fruit {
    public Mango(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Savoring a juicy mango. It tastes sweet and tangy.");
    }
}

class FruitTest {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Generic Fruit", "Undefined Taste", "Unknown Size");
        Apple apple = new Apple("Apple", "Sweet and Crisp", "Medium");
        Mango mango = new Mango("Mango", "Sweet and Tangy", "Large");

        genericFruit.eat();
        apple.eat();
        mango.eat();
    }
}

