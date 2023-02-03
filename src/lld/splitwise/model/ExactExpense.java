package lld.splitwise.model;

import java.util.List;

public class ExactExpense extends Expense {
    public ExactExpense(double amount, User paidBy, List<Split> splits) {
        super(amount, paidBy, splits);
    }

    @Override
    public boolean validate() {
        int total = 0;
        for (Split split : this.getSplits()) {
            if (!(split instanceof ExactSplit)) {
                return false;
            } else {
                total += split.getAmount();
            }
        }
        if(total != this.getAmount()) {
            return false;
        }
        return true;
    }
}