package lld.splitwise.service;

//import com.splitwise.model.*;
import lld.splitwise.model.*;

import java.util.List;

public class ExpenseService {
    // EXPENSE u4 1200 4 u1 u2 u3 u4 EXACT 200 300 600 100

//    u1 -> 20
//    u2 -> 30
//    u3 -> 60
//    u4 -> 10
//    went a party u4 ( 1200 ) u1 (200) , u2 (300) , u3 (600) , u4 (100)
    // u4 1200 4 u1 u2 u3 u4 PERCENT 20 30 40 10
    // u4 1200 4 u1 u2 u3 u4 EQUAL


    public static Expense createExpense(ExpenseType expenseType, double amount, User paidBy, List<Split> splits) {
        switch (expenseType) {
            case EXACT -> {
                // splits ->  < <u1,200> , <u2,300> , <u3,400> , <u4,100> >
                return new ExactExpense(amount, paidBy, splits);
            }
            case PERCENT -> {
                // splits ->  < <u1,20> , <u2,30> , <u3,40> , <u4,10> >
                for (Split split : splits) {
                    PercentSplit percentSplit = (PercentSplit) split;
                    split.setAmount(amount * percentSplit.getPercent() / 100);
                }
//                    < <u1, 300> <u2, 300>, <u3,  300> , <u4, 300> >
                return new PercentExpense(amount, paidBy, splits);
            }
            case EQUAL -> {
//                u1 1200 4  u1 u2 u3 u4 EQUAL
                int totalNoOfUsers = splits.size();
                double equalAmount = (double) amount / totalNoOfUsers;
                for (Split split : splits) {
                    split.setAmount(equalAmount);
                }
//                < <u1, 300> <u2, 300>, <u3,  300> , <u4, 300> >
                return new EqualExpense(amount, paidBy, splits);
            }
            default -> {
                return null;
            }
        }
    }
}
