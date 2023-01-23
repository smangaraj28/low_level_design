package lld.splitwise.model;

import java.util.List;

public class PercentExpense extends Expense {

    public PercentExpense(double amount, User paidBy, List<Split> splits) {
        super(amount, paidBy, splits);
    }

    @Override
    public boolean validate() {
        for (Split split : this.getSplits()) {
            if (!(split instanceof PercentSplit)) {
                return false;
            }
        }
        double totalPercent = 100;
        double sumOfSplitPercent = 0;
        for (Split split : this.getSplits()) {
            PercentSplit exactSplit = (PercentSplit) split;
            sumOfSplitPercent += exactSplit.getPercent();
        }
        if (sumOfSplitPercent != totalPercent) {
            return false;
        }
        return true;
    }
}
