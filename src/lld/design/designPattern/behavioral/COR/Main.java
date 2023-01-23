package lld.design.designPattern.behavioral.COR;

public class Main {

    public static Logger doChaining() {
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO); // 1

        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO); // 2
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO); // 3
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;

        // console -> error -> debug
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();
        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");

        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is completed");
    }
}
