package lld.design.designPrinciple.SOLID.withoutsolid.lsp;

public class RealDog implements IDog {
    @Override
    public void eat() {
        System.out.println("eating pedigree");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow Bow!!!");
    }
}
