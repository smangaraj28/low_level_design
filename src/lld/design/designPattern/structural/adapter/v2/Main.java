package lld.design.designPattern.structural.adapter.v2;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        System.out.println(creditCard.getCreditCard());
    }
}
