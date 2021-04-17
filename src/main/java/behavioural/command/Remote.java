package behavioural.command;

public class Remote {
    Command slot;

    public Remote() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
