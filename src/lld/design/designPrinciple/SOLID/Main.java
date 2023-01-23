package lld.design.designPrinciple.SOLID;


import lld.design.designPrinciple.SOLID.di.used.BossCoderTeamv2;
import lld.design.designPrinciple.SOLID.di.used.Mentor;
import lld.design.designPrinciple.SOLID.di.used.Professional;
import lld.design.designPrinciple.SOLID.di.used.Teacher;
import lld.design.designPrinciple.SOLID.srp.used.DietSender;
import lld.design.designPrinciple.SOLID.srp.used.RewardsCalculator;
import lld.design.designPrinciple.SOLID.srp.used.ScheduleSender;
import lld.design.designPrinciple.SOLID.srp.used.TrainerSRP;
import lld.design.designPrinciple.SOLID.openclose.used.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Without SRP - tightly coupled , no proper real world entity
//        Trainer t = new Trainer("Soumya", 2, 26);
//        t.sendDiet();
//        t.sendSchedule();
//        t.calculateRewards();

        // with proper SRP
        TrainerSRP betterTrainer = new TrainerSRP("Soumya", 2, 26);
//
        ScheduleSender scheduleSender = new ScheduleSender();
        scheduleSender.sendSchedule(betterTrainer);
//
        DietSender dietSender = new DietSender();
        dietSender.sendDiet(betterTrainer);
//
        RewardsCalculator rewardsCalculator = new RewardsCalculator();
        rewardsCalculator.calculateRewards(betterTrainer);

//        ------------------------------------------------
        // open for extension, closed for modification
        List<AnimalOP> animalList = new ArrayList<>();
        AnimalOP a = new CatOP();
        AnimalOP b = new DogOP();
        AnimalOP c = new ParrotOp();
//        AnimalOP d = new SnakeOP();
//
        animalList.add(a);
        animalList.add(b);
        FosterAnimal f = new FosterAnimal();
        f.fosterAnimal(animalList);
//
        FosterAnimal f1 = new FosterAnimal();
        f1.fosterAnimal(a);
        f1.fosterAnimal(b);


        List<Professional> professionalList = new ArrayList<>();
        professionalList.add(new Mentor());
        professionalList.add(new Teacher());
        BossCoderTeamv2 bossCoderTeamv2 = new BossCoderTeamv2();
        bossCoderTeamv2.hire(professionalList);



    }


}
