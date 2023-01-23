package lld.design.designPattern.behavioral.command;

// ConcreteCommand
public class CommitCommand implements Command {

    Transaction transaction;

    public CommitCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        transaction.commit();
    }
}