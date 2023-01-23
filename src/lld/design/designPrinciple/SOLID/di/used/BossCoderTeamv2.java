package lld.design.designPrinciple.SOLID.di.used;

import java.util.List;

public class BossCoderTeamv2 {
//    private Mentor mentor;
//    private Sweeper sweeper;
    private Professional teamMember;
    //Mentor, Teacher, SalesP

    public void hire(List<Professional> professionalList) {
        this.teamMember = (Professional) professionalList;
//        this.teamMember.add(new Mentor());
    }
}
