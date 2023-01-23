package lld.design.designPattern.creational.factory;

public class GenerateBill {
    public static void main(String[] args) {

        PlanFactory planFactory = new PlanFactory();

        Plan p = planFactory.getPlan("DOMESTICPLAN"); // new DomesticPlan();
        p.setRate();
        p.calculateBills(100);

        Plan q = planFactory.getPlan("COMMERCIALPLAN");
        q.setRate();
        q.calculateBills(100);


        Plan r = planFactory.getPlan("INSTITUTIONALPLAN");
        r.setRate();
        r.calculateBills(100);

        Plan s = planFactory.getPlan("GOVTPLAN");
        s.setRate();
        s.calculateBills(100);


//        DomesticPlan d = new DomesticPlan();
//        d.setRate();
//        d.calculateBills(1000);

    }
}
