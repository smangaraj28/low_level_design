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
