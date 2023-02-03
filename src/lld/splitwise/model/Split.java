package lld.splitwise.model;

abstract public class Split {
    private User payingUser;
    double amount;

    public Split(User user) {
        this.payingUser = user;
    }

    public User getUser() {
        return payingUser;
    }

    public void setUser(User user) {
        this.payingUser = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

// EXPENSE u4 1200 4 u1 u2 u3 u4 EXACT 200 300 600 100
// Expense Class -> EXACT Expense Class // u4 1200 , Array of Exact Split Classes
// Split Class -> Exact Split Class // u1 u2 u3 u4 EXACT 200 300 600 100
// u1 has to pay 200 ( ExactSplit(u1, 200) )
// u2 has to pay 300 ( ExactSplit(u2, 300) )
// u3 has to pay 600 ( ExactSplit(u3, 600) )
// u4 has to pay 100 ( ExactSplit(u4, 100) )

