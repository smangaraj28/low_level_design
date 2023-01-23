package lld.design.designPrinciple.DRY;

public class SendCake {

    private ISenderService senderService;

    public SendCake(ISenderService senderService) {
        this.senderService = senderService;
    }

    public void sendCake() {
        System.out.println("Baking cake");

        // Repeated code
//        System.out.println("Sending");

        senderService.send();
    }
}
