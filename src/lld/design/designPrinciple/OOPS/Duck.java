package lld.design.designPrinciple.OOPS;

public class Duck extends Animal implements FlyingAnimal {
    @Override
    public void makeSound() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }
}
