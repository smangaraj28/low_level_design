package dsa.otherpack;

public class Complex {
    private int a = 10;
    int b = 20;
    protected int c;
    public int d;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public static void main(String[] args) {
        Complex complex = new Complex();
        System.out.println(complex.a);
    }
}

class Solution {
    public static void main(String[] args) {
        Complex complex = new Complex();
//        System.out.println(complex.a);
        System.out.println(complex.b);
        System.out.println(complex.getA());
        complex.setA(100);
        System.out.println(complex.getA());
    }
}