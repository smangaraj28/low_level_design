package lld.design.designPrinciple.SOLID.lsp.used;

public class DogHandlerV2 {
    public static void main(String[] args) {

        IRealDog dog = new RealDogV2();
        dog.eat();
        dog.makeNoise();

        IToyDog dummyDog = new DummyDogV2();
        dummyDog.makeNoise();
//        dummyDog.eat();

    }

}


