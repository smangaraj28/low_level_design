package lld.design.designPrinciple.OOPS;

import java.util.List;

// Association ( Unrelated / independent objects come together to achieve a goal )
public class AnimalFarm {
    private List<Animal> animalList; // Aggregation
    private FarmLand land;

    public AnimalFarm(List<Animal> animalList) {
        this.animalList = animalList;
    }
}

class FarmLand {
    private int length;
    private int breadth;

    public FarmLand(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
