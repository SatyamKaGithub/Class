/*
Write a program in JAVA language to create a class named Shape it should contain 2 method draw()
and erase() that print "Drawing shape" and "Erasing shape" respectively.
For this class create subclasses Circle, Triangle and Square, and each class should override the parent
class function draw() and erase(). The draw() method should print "Drawing Circle", "Drawing Triangle" and "Drawing Square"
The Erase() method should print "Erasing Circle", "Erasing Triangle" and "Erasing Square".
Create objects of Circle, Triangle and Square in the following way and observe the polymorphism nature of the class by calling draw() and Erase().

* */
class SHAPE {
    void draw() {
        System.out.println("Drawing shape");
    }

    void erase() {
        System.out.println("Erasing shape");
    }
}

class Circle extends SHAPE {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends SHAPE {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends SHAPE {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}

class Main {
    public static void main(String[] args) {
        SHAPE circle = new Circle();
        SHAPE triangle = new Triangle();
        SHAPE square = new Square();

        circle.draw();
        circle.erase();

        triangle.draw();
        triangle.erase();

        square.draw();
        square.erase();
    }
}

