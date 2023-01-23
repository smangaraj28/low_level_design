package dsa.studentpack;

import java.lang.*;

public class GiftAbled implements IGift, ISwitch {
    private int roll;
    private String name;
    {

    }
    GiftAbled() {
        System.out.println("Constructor Getting called");
    }
    GiftAbled(int b, String name) {
        this.roll = b;
        this.name = name;
    }
    public void printNameRoll() {
        System.out.print(this.roll);
        System.out.print(" ");
        System.out.println(this.name);
    }
    public static void main(String[] args) {
//        google.studentpack.GiftAbled g1 = new google.studentpack.GiftAbled();
        GiftAbled pradeep = new GiftAbled(1, "Pradeep");
        GiftAbled deepanshu = new GiftAbled(2, "Deepanshu");
        GiftAbled vipin = new GiftAbled(3, "Vipin");
        pradeep.printNameRoll();
        deepanshu.printNameRoll();
        vipin.printNameRoll();

    }

    @Override
    public String gradeCheck(int score) {
        if (score >= 90) {
            return "O";
        } else if (score >= 80) {
            return "E";
        } else {
            return "A";
        }
    }

    @Override
    public String scoreCheck(int score) {
        return null;
    }
}
interface IGift {
    public String gradeCheck(int score);
    public String scoreCheck(int score);

}
interface ISwitch {
    public String gradeCheck(int score);
    public String scoreCheck(int score);

}