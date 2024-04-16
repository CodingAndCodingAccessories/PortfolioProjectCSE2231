public class LogicGatesUC2Smart {

    private boolean motionDetected;
    private boolean doorOpened;
    private boolean lightsOn;
    private LogicGates1 gate1;
    private LogicGates1 gate2;

    public LogicGatesUC2Smart() {
        // Initialize the components
        this.motionDetected = false;
        this.doorOpened = false;
        this.lightsOn = false;
        this.gate1 = new LogicGates1();
        this.gate2 = new LogicGates1();
    }

    // Method to simulate motion detection
    public void detectMotion() {
        this.motionDetected = true;
        System.out.println("Motion detected!");
        // Turn on lights if motion is detected and door is closed
        if (!this.doorOpened) {
            this.gate1.setInputA(this.motionDetected);
            this.gate1.setInputB(this.doorOpened);
            this.lightsOn = this.gate1.ORGate(); // Turn on lights if motion detected OR door opened
            System.out.println("Lights turned on: " + this.lightsOn);
        }
    }

    // Method to simulate door opening
    public void openDoor() {
        this.doorOpened = true;
        System.out.println("Door opened!");
        // Turn on lights if door is opened and motion is detected
        if (this.motionDetected) {
            this.gate2.setInputA(this.doorOpened);
            this.gate2.setInputB(this.motionDetected);
            this.lightsOn = this.gate2.ORGate(); // Turn on lights if door opened OR motion detected
            System.out.println("Lights turned on: " + this.lightsOn);
        }
    }

    public static void main(String[] args) {
        LogicGatesUC2Smart automation = new LogicGatesUC2Smart();
        // Simulate motion detection and door opening
        automation.detectMotion();
        automation.openDoor();
    }
}
