package lld.design.designPattern.creational.factory;

abstract public class Plan {
    protected double rate;

    abstract void setRate();

    public void calculateBills(int units) {
        System.out.println(units * rate);
    }
}
