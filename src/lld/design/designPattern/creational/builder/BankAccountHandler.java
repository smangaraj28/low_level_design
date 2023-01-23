package lld.design.designPattern.creational.builder;

public class BankAccountHandler {

    public static void main(String[] args) {

        BankAccount account = new BankAccount.Builder()
                .withAccountNumber(134134)
                .withOwner("Soumya")
                .atBranch("Khordha")
                .openingBalance(1000)
                .build();

        System.out.println(account);

//        BankAccount anotherAccount = new BankAccount.Builder()
//                .withOwner("Mangaraj")
//                .atBranch("Jatni")
//                .openingBalance(1341413)
//                .atRate(3.6)
//                .build();

//        System.out.println(anotherAccount);
    }
}
