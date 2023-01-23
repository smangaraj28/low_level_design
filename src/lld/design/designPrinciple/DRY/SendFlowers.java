package lld.design.designPrinciple.DRY;

public class SendFlowers {

    private ISenderService senderService;

    public SendFlowers(ISenderService senderService) {
        this.senderService = senderService;
    }

    public void sendFlowers() {
        System.out.println("Making boquet");

        this.senderService.send();
        // Repeated code
//        System.out.println("Sending");

//        How do we improve it ?
    }
}
