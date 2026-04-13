package driver;

public class Robot implements Driver {
    @Override
    public void navigate() {
        System.out.println("Robot is driving autonomously");
    }
}