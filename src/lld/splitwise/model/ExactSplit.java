package lld.splitwise.model;

public class ExactSplit extends Split {
    public ExactSplit(User user, double amount) {
        super(user);
        setAmount(amount);
    }
}
