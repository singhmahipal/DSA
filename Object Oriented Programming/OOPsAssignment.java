
// Q1: Complex Number Operations
class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex sum(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)),
                           ((a.real * b.imag) + (a.imag * b.real)));
    }

    public void printComplex() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (real != 0 && imag == 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + " + imag + "i");
        }
    }
}

// Q2: Inheritance
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

// Q3: Polymorphism
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Q4: Abstraction
abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car drives on the road.");
    }
}

class Bike extends Vehicle {
    @Override
    void move() {
        System.out.println("Bike rides on two wheels.");
    }
}

public class OOPsAssignment {
    public static void main(String[] args) {
        // Q1: Complex Numbers
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.sum(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.prod(c, d);

        e.printComplex();
        f.printComplex();
        g.printComplex();

        // Q2: Inheritance
        Student s = new Student("Alice", 20, "Computer Science");
        s.display();

        // Q3: Polymorphism
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();

        // Q4: Abstraction
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.move();
        bike.move();
    }
}

/*
Expected Output:

Q1:
13 + 9i
-5 + 1i
16 + 77i

Q2:
Name: Alice, Age: 20
Course: Computer Science

Q3:
Drawing a circle
Drawing a rectangle

Q4:
Car drives on the road.
Bike rides on two wheels.
*/
