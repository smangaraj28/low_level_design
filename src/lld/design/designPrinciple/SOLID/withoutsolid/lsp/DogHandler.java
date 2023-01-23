package lld.design.designPrinciple.SOLID.withoutsolid.lsp;

public class DogHandler {
    public static void main(String[] args) {
        IDog realDog = new RealDog();
        realDog.eat();
        realDog.makeNoise();

//        IDog dummyDog = new DummyDog();
//        dummyDog.eat();
//        dummyDog.makeNoise();

        IDog dummyDog = new DummyDog();
        dummyDog.eat();
        dummyDog.makeNoise();
    }
}
