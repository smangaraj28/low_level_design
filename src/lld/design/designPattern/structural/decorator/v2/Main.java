package lld.design.designPattern.structural.decorator.v2;

public class Main {
    public static void main(String[] args) {


        VegFood vf = new VegFood();
        System.out.println(vf.prepareFood());
        System.out.println(vf.foodPrice());

//        Food f5 = new NonVegFood();
//        System.out.println(vf.prepareFood());
//        System.out.println(vf.foodPrice());


        Food f1 = new NonVegFood(new VegFood());
        System.out.println(f1.prepareFood());
        System.out.println(f1.foodPrice());




        Food f2 = new ChineseFood(new VegFood());
        System.out.println(f2.prepareFood());
        System.out.println(f2.foodPrice());

        Food f3 = new ChineseFood(new NonVegFood(null));
        System.out.println(f3.prepareFood());
        System.out.println(f3.foodPrice());


    }
}
