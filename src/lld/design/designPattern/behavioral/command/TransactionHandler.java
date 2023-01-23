package lld.design.designPattern.behavioral.command;

// Invoker
public class TransactionHandler {
    private Command command;

    // CommitComand
    public void setCommand(Command command) {
        this.command = command;
    }

    //
    public void executeCommand() {
        command.execute();
    }
}
