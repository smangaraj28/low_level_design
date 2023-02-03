package lld.splitwise.service;

//import com.splitwise.model.*;
import lld.splitwise.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ExpenseManager ( expenses , userMap, balanceSheet )
// ExpenseService ( creating expenses )
// Expense Class ( creating splits )


public class ExpenseManager {
    List<Expense> expenses;
    Map<String, User> userMap; // userid, userObj(name, email, id, mobile)
    Map<String, Map<String, Double>> balanceSheet; // userid,owes <another userid, amount>

//    {
//        "user1" : {
//            "user2": 1200 // user1 will pay user2 1200
//            "user3": -400 // user3 will pay user1 400
//    }

//    User1 has to pay -400 to user3 === user3 has to pay 400 to user1

//    u1 1000 2 u2 u3 EXACT 800 200
    //    {
//        "user1" : {
//            "user2": -800 // user2 will pay user1 800
//            "user3": -200 // user3 will pay user1 200
//    }


    public ExpenseManager() {
        this.expenses = new ArrayList<Expense>();
        this.userMap = new HashMap<String, User>();
        this.balanceSheet = new HashMap<String, Map<String, Double>>();
    }

    //add users to user map
    public void addUser(User user) {
        this.userMap.put(user.getId(), user);
        this.balanceSheet.put(user.getId(), new HashMap<String, Double>());
    }

    // add expenses
    public void addExpense(ExpenseType expenseType, double amount, String paidBy,
                           List<Split> splits, ExpenseMetaData expenseMetaData) {
        Expense expense = ExpenseService.createExpense(expenseType, amount, userMap.get(paidBy), splits);
        expenses.add(expense);
        // update the balance sheets for all the users
//            < <u1, 300> <u2, 300>, <u3,  300> , <u4, 300> >
        for (Split split : expense.getSplits()) {

//            u4 -> <u1, 200> , <u2, 300> , u3 , u4
            String paidTo = split.getUser().getId(); // u1
            if(paidTo.equals(paidBy)) {
                continue;
            }
            Map<String, Double> balancesForPaidByUser = balanceSheet.get(paidBy); //
            // u4 1200 4 EQUAL u1 u2 u3 u4 // first time balance sheet for u1 doesn't contain u4

            // u4 -> {u1=200,u2 -> 300, u4-> 0 }
            // checking if paidBy balance sheet contains paidTo user
            if (!balancesForPaidByUser.containsKey(paidTo)) {
                balancesForPaidByUser.put(paidTo, 0.0);
            }
            balancesForPaidByUser.put(paidTo, balancesForPaidByUser.getOrDefault(paidTo, 0.0) + split.getAmount());

//            {u1: {u4 : -200}
            // checking if paidBy balance sheet contains paidTo user
            Map<String, Double> balancesForPaidToUser = balanceSheet.get(paidTo);

            if (!balancesForPaidToUser.containsKey(paidBy)) {
                balancesForPaidToUser.put(paidBy, 0.0);
            }
            balancesForPaidToUser.put(paidBy, balancesForPaidToUser.get(paidBy) - split.getAmount());
        }
    }

//    public void showBalance(String userId, int b) {
//        showBalance("fdafafd");
//    }
    // show balances - show balance for a specific user id , show balance for all users
    public void showBalance(String userId) {
        boolean isEmpty = true;
        for (Map.Entry<String, Double> userBalance : balanceSheet.get(userId).entrySet()) {
            if (userBalance.getValue() != 0) {
                isEmpty = false;
                printBalance(userId, userBalance.getKey(), userBalance.getValue());
            }
        }
        if (isEmpty) {
            System.out.println("No Balance");
        }
    }
//u1 -> , u2 -> u3 ->
    public void showBalances() {
        boolean isEmpty = true;
        for (Map.Entry<String, Map<String, Double>> allBalances : balanceSheet.entrySet()) {
            System.out.println("Showing balances for user: " + userMap.get(allBalances.getKey()).getName());
//            showBalance(allBalances.getKey());
            for (Map.Entry<String, Double> userBalance : allBalances.getValue().entrySet()) {
                if (userBalance.getValue() != 0) {
                    isEmpty = false;
                    printBalance(allBalances.getKey(), userBalance.getKey(), userBalance.getValue());
                }
            }
        }
        if (isEmpty) {
            System.out.println("No Balance");
        }
    }

    private void printBalance(String user1, String user2, double amount) {
        String user1Name = userMap.get(user1).getName();
        String user2Name = userMap.get(user2).getName();
        if (amount < 0) {
            System.out.println(user1Name + " has to pay " + user2Name + " : " + Math.abs(amount));
        } else if (amount > 0) {
            System.out.println(user2Name + " has to pay " + user1Name + " : " + Math.abs(amount));
        }
    }
}
