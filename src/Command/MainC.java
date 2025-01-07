package Command;

// Main.java (Client)
public class MainC {
    public static void main(String[] args) {
        // Create receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Create command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        // Create invoker (RemoteControl)
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF

        // Turn the fan on
        remote.setCommand(fanOn);
        remote.pressButton();  // Output: Fan is ON

        // Turn the fan off
        remote.setCommand(fanOff);
        remote.pressButton();  // Output: Fan is OFF
    }
}
