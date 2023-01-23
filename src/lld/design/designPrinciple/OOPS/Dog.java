package lld.design.designPrinciple.OOPS;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }

    public void sleep() {
        System.out.println("Dog can sleep");
    }

//    @Override
//    public void fly() {
//        throw new RuntimeException();
//    }
}
