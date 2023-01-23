package lld.design.designPattern.creational.builder;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

//    public BankAccount(long accountNumber, String owner, String branch, double balance, double interestRate) {
//        this.accountNumber = accountNumber;
//        this.owner = owner;
//        this.branch = branch;
//        this.balance = balance;
//        this.interestRate = interestRate;
//    }

    private BankAccount() {

    }

    public static class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder() {
        }

        public Builder withAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            if(this.accountNumber == 0) {
                return null;
            }
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;
        }

    }

    @Override
    public String toString() {
        return "Account - " + accountNumber + " With Owner - " + owner + " at Branch - " + branch +
                " has Balance : " + balance + " interest rate : " + interestRate;
    }
}
