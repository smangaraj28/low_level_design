package lld.design.designPattern.behavioral.command;

// Receiver
public class Transaction {

    private boolean isSafeToCommit;

    public void commit() {
        System.out.println("Trying to commit..");
        isSafeToCommit = true;
    }

    public void rollback() {
        System.out.println("rolling it back!!");
        isSafeToCommit = false;
    }
}
