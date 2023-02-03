package lld.splitwise.model;

import java.util.List;

abstract public class Expense {
    private String id;
    private double amount;
    private User paidBy;
    private List<Split> splits;

    // u4 1200 4 u1 u2 u3 u4 EXACT 200 300 600 100
    // expense ( amount = 1200 , paidBy = u4, splits = [ ExactSplit(u1, 200 ),ExactSplit(u2, 300 ),ExactSplit(u3, 600 ), ExactSplit(u4, 100 ) ]

    // u4 1200 4 u1 u2 u3 u4 PERCENT 20 30 40 10
    // u4 1200 4 u1 u2 u3 u4 EQUAL                            ( same )
    // u4 1200 4 u1 u2 u3 u4 EXACT 300 300 300 300            ( same )
//    id  -> kfajdhfkajf
//    amount -> 1200
//    paidBy -> u4
//   splits ->  < <u1,200> , <u2,300> , <u3,600> , <u4,100> >
//

    public Expense(double amount, User paidBy, List<Split> splits) {
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public abstract boolean validate();
}
