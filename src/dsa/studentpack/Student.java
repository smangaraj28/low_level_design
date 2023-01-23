package dsa.studentpack;

public class Student {
    int rollno;
    String name;
    static String college = "CET";

    static {
        System.out.println("Static Block Executed");
    }

    Student() {
        System.out.println("Default Constructor");
    }

    Student(int r, String n) {
        this();
        this.rollno = r;
        this.name = n;
        this.display();
    }

    public void display() {
        System.out.println("student " + name + " has roll " + rollno);
    }

    static void change() {
        college = "IIM";
    }

    public static void main(String[] args) {
        Student vipin = new Student(1, "Vipin");
        Student jaya = new Student(2, "jaya");
        Student[] students = new Student[3];
        String[] names = {"vipin", "jaya", "amaresh"};
        for (int i = 0; i < 3; i++) {
            students[i] = new Student(i + 1, names[i]);
        }
        System.out.println(Student.college);
        System.out.println(vipin.rollno);
        vipin.display();
        jaya.display();
        Student.change();
        System.out.println(Student.college);
    }
}

class Parent {

}

class Child extends Parent {

}

class Employee {
    int id;
    String name;
    float salary;
}

class Developer extends Employee {
    String no_of_defects;
}

class JavaDeveloper extends Developer {

}

class QA extends Employee {
    String no_of_issues_raised;
}

class Manager extends Employee {
    String no_of_reportes;
}

class Address {
    String street;
    String country;
    int pincode;
}

class Employee1 {
    int id;
    String name;
    Address address;

}

class Summation {
    static int add(int a, int b) {
        return a + b;
    }

    static float add(int a, float b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, String c) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(Summation.add(12, 23));
        System.out.println(Summation.add(12, 23, "fadfa"));
        System.out.println(Summation.add(12, 23.1f));
        System.out.println(Summation.add(7, 8, 9));
    }

    public static void main(String args) {
        System.out.println("String args");
    }

    public static void main() {
        System.out.println("No Args");
    }
}

class Vehicle {
    Vehicle() {
        System.out.println("google.studentpack.Vehicle Constructor is getting called");
    }

    void run(int speed) {
        System.out.println("vehicle is running at speed " + speed);
    }
}

class Bike extends Vehicle {

    final int speedLimit = 90; // final variable

    Bike() {
        super();
        System.out.println("google.studentpack.Bike constructor is getting called");
    }

    void run(int bikeSpeed) {
        super.run(45);
        this.buy();
//        speedLimit = 150;
        System.out.println("google.studentpack.Bike is running at speed " + bikeSpeed);
    }

    void buy() {
        System.out.println("buy class");
    }

    public static void main(String[] args) {
        Bike r1 = new Bike();
        System.out.println(r1 instanceof Bike); // true
        System.out.println(r1 instanceof Vehicle); // true
//        System.out.println(r1 instanceof google.studentpack.Summation); // true
        r1.run(10);
    }
}

abstract class Shape {
    abstract void draw();

    void sum() {
        System.out.println("Abstract Class google.studentpack.Shape is being called");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing google.studentpack.Rectangle");
    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing google.studentpack.Circle");
    }
}

class TestAbstraction {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        rectangle.draw();
        circle.draw();
        rectangle.sum();
        circle.sum();
        int[] arr = new int[5];
        int array[] = {10, 20, 30, 40, 50};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        arr[5] = 23;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        int[][] arr2 = new int[2][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class TestArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int array[] = {10, 20, 30, 40, 50};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//        arr[5] = 23;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i : arr) {
            System.out.println(i);
        }
        int[][] arr2 = new int[2][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        int[][] arr3 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}