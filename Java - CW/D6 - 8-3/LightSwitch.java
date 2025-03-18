class LightSwitch {
    // State/Attributes
    private boolean isOn;

    // Constructor to initialize the light switch
    public LightSwitch() {
        this.isOn = false; // Default state is off
    }

    // Behavior: Switch on the light
    public void switchOn() {
        this.isOn = true;
        System.out.println("Light is now ON.");
    }

    // Behavior: Switch off the light
    public void switchOff() {
        this.isOn = false;
        System.out.println("Light is now OFF.");
    }

    // Behavior: Check if the light is on
    public void checkIfOn() {
        if (this.isOn) {
            System.out.println("The light is ON.");
        } else {
            System.out.println("The light is OFF.");
        }
    }
}