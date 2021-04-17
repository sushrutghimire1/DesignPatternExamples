package behavioural.command;

public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Light light = new Light();
        Stereo stereo = new Stereo();
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();
    }
}
