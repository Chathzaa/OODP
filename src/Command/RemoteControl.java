package Command;

// RemoteControl.java (Invoker)
public class RemoteControl {
    private Command command;

    // Sets the command to be executed
    public void setCommand(Command command) {
        this.command = command;
    }

    // Executes the current command
    public void pressButton() {
        command.execute();
    }
}

