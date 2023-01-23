package lld.design.designPattern.structural.adapter.v2;

// Adopter Class ( wrapper class )
public class BankCustomer extends BankDetails implements CreditCard {

    public void abc() {
        System.out.println("ABC");
    }

    @Override
    public void giveBankDetails() {
        String customerName = "Soumya";
        long accNo = 131341341;
        String bankName = "SBI";
        this.setAccHolderName(customerName);
        this.setAccNumber(accNo);
        this.setBankName(bankName);
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername = getAccHolderName();
        String bname = getBankName();
        return "The Account number " + accno + " of " + accholdername + " in " + bname +
                " bank is valid and authenticated for issuing the credit card. ";
    }
}
