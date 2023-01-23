package lld.design.designPrinciple.SOLID.withoutsolid.srp;

public class Trainer {

    private String name;
    private int id;
    private int age;

    public Trainer(String name, int id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void sendDiet() {
        System.out.println("Sending diet");
    }

    public void sendSchedule() {
        System.out.println("sending schedule");
//        fdafdaf
    }

    public void calculateRewards() {
        System.out.println("calculate rewards");
    }

    public void sendVaccination() {}
}
