package lld.design.designPrinciple.DRY;

public class Main {
    public static void main(String[] args) {
        ISenderService senderService = new SenderService();
        SendCake sendCake = new SendCake(senderService);
        sendCake.sendCake();
    }
}
