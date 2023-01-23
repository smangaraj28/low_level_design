package lld.design.designPrinciple.SOLID.lsp.used;

public class RealDogV2 implements IRealDog {
    @Override
    public void eat() {
        System.out.println("eating pedigree");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bow !! Bow !!");
    }
}
