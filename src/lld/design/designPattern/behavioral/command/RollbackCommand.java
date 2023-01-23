package lld.design.designPattern.behavioral.command;

// ConcreteCommand
public class RollbackCommand implements Command {

    Transaction transaction;

    public RollbackCommand(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void execute() {
        transaction.rollback();
    }
}
