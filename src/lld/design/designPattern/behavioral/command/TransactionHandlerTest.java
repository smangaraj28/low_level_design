package lld.design.designPattern.behavioral.command;

// Client
public class TransactionHandlerTest {
    public static void main(String[] args) {


        Transaction transaction = new Transaction();

        Command commit = new CommitCommand(transaction);
        Command rollback = new RollbackCommand(transaction);

        //..........

        TransactionHandler handler = new TransactionHandler();




        handler.setCommand(commit);
        handler.executeCommand();

        handler.setCommand(commit);
        handler.executeCommand();

        handler.setCommand(rollback);
        handler.executeCommand();
    }
}
