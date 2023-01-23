package dsa.otherpack;

public class RecursionEx {
    static int counter = 0;

    static void recursiveMethod() {
        if (counter >= 5) {
            return;
        }
        counter += 1;
        System.out.println("google.studentpack.GiftAbled " + counter);
        recursiveMethod();
        System.out.println("Process " + counter);
    }

    static void normalMethod() {
        System.out.println("google.studentpack.GiftAbled ");
    }

    public static void main(String[] args) {
        recursiveMethod();
        for (int i = 0; i < 5; i++) {
            normalMethod();
        }
    }
}

class A {
    public static void main(String[] args) {
        RecursionEx.recursiveMethod();
    }
}
