package lld.design.designPrinciple.DRY;

public class SenderService implements ISenderService {
    @Override
    public void send() {
        System.out.println("sending");
    }
}
