package lld.design.designPrinciple.SOLID.withoutsolid.lsp;

public class DummyDog implements IDog {
    @Override
    public void eat() {
//        throw new RuntimeException("Dummy dog can't eat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow");
    }
}
