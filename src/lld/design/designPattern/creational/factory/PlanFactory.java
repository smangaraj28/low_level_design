package lld.design.designPattern.creational.factory;

public class PlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        } else if (planType.equalsIgnoreCase("GOVTPLAN")) {
            return new GovtPlan();
        }
        return null;
    }
}
