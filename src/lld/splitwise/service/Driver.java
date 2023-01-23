package lld.splitwise.service;

//import com.splitwise.model.*;
import lld.splitwise.model.*;

import java.util.*;

public class Driver {
    // 0       1   2   3 4  5  6  7   8
    // EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL
    // SHOW
    // SHOW u1
    public static void main(String[] args) {
        ExpenseManager expenseManager = new ExpenseManager();
        expenseManager.addUser(new User("u1", "Soumya", "smangaraj@gmail.com", "3141413"));
        expenseManager.addUser(new User("u2", "Shubham", "smangaraj@gmail.com", "3141413"));
        expenseManager.addUser(new User("u3", "Sai", "smangaraj@gmail.com", "3141413"));
        expenseManager.addUser(new User("u4", "Satya", "smangaraj@gmail.com", "3141413"));
        //                              0       1   2   3  4  5  6  7   8
        //            String command = "EXPENSE u1 1000 4 u1 u2 u3 u4 EQUAL";
        //            String command = "EXPENSE u1 1000 4 u1 u2 u3 u4 EXACT 100 200 300 400";
        //            String command = "EXPENSE u1 1000 4 u1 u2 u3 u4 PERCENT 10 40 20 30";
        //            String command = "SHOW u1"; (show balance for that particular user u1 )
        //            String command = "SHOW"; ( show all balances )

        Scanner in = new Scanner(System.in);
        while (true) {

            String command = in.nextLine();
            String[] commands = command.split(" ");
            String commandType = commands[0];
            switch (commandType) {
                case "SHOW" -> {
                    if (commands.length == 1) {
                        expenseManager.showBalances();
                    } else {
                        expenseManager.showBalance(commands[1]);
                    }
                    break;
                }
                case "EXPENSE" -> {
                    String paidBy = commands[1];
                    double amount = Double.parseDouble(commands[2]);
                    int noOfUsers = Integer.parseInt(commands[3]);

                    String expenseType = commands[4 + noOfUsers];

                    List<Split> splits = new ArrayList<>();
                    switch (expenseType) {
                        case "EQUAL" -> {
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new EqualSplit(expenseManager.userMap.get(commands[4 + i])));
                            }
                            expenseManager.addExpense(ExpenseType.EQUAL, amount, paidBy, splits, null);
                            break;
                        }
                        case "EXACT" -> {
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new ExactSplit(expenseManager.userMap.get(commands[4 + i]),
                                        Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.EXACT, amount, paidBy, splits, null);
                            break;
                        }
                        case "PERCENT" -> {
                            for (int i = 0; i < noOfUsers; i++) {
                                splits.add(new PercentSplit(expenseManager.userMap.get(commands[4 + i]),
                                        Double.parseDouble(commands[5 + noOfUsers + i])));
                            }
                            expenseManager.addExpense(ExpenseType.PERCENT, amount, paidBy, splits, null);
                            break;
                        }
                        default -> {
                            System.out.println("Wrong command Type");
                        }
                    }
                }
            }
        }
    }
}
