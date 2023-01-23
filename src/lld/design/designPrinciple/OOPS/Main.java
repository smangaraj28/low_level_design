package lld.design.designPrinciple.OOPS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Encapsulation
//        Person person = new Person();
//        person.name = "Soumya Sambit Mangaraj";
//        person.age = 26;
//        person.role = "SDE 2";
//
//        EncapusalatedPerson encapusalatedPerson = new EncapusalatedPerson();
////        encapusalatedPerson.age = -1; // Compilation error
//        encapusalatedPerson.setAge(-1); // Validation functions
//        encapusalatedPerson.setAge(30); //

        // Inheritence
        Animal a = new Cat();
//        a.fly();
        a.sleep();
        a.makeSound();

        Animal b = new Cat();
        b.sleep();
        b.makeSound();

        Animal c = new Cat();
        c.sleep();
        c.makeSound();

        // Aggregation
        List<Animal> animalList = new ArrayList<>();
        animalList.add(a);
        animalList.add(b);
        animalList.add(c);

        // polymorphisim
        for (Animal animal : animalList) {
            animal.makeSound();
        }
        System.out.println(overloadEx(2));
        System.out.println(overloadEx(1, 2));

    }

    private static int overloadEx(int a) {
        return a;
    }

    private static int overloadEx(int a, int b) {
        return a + b;
    }
}
