package lld.design.designPattern.behavioral.COR;

public class DebugBasedLogger extends Logger {

    public DebugBasedLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("DEBUG LOGGER INFO: " + msg);
    }
}
