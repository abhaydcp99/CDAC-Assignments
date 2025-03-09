// 1. Write a Java class structure for the following cases and print relevant SOP (printed messages).


class Q1_LightSwitch {
	  public static void main(String[] args) {
        Q1_LightSwitch myLight = new Q1_LightSwitch(); // Create an instance of LightSwitch

        // Test the light switch
        myLight.checkIfOn(); // Check initial state (should be OFF)
        myLight.switchOn();  // Turn the light ON
        myLight.checkIfOn(); // Check state (should be ON)
        myLight.switchOff(); // Turn the light OFF
        myLight.checkIfOn(); // Check state (should be OFF)
    }
		  
      public boolean isOn; //---------- static attribute
	  
	  public Q1_LightSwitch(){
		  this.isOn = false; //--------- deafault state is off
	  }
       
	   
	   // switch on light process -----------------------
       public void switchOn(){
           this.isOn = true;
           System.out.println("Light is now ON!!!");
	   }
       
	   // switch off light process ----------------------
	   
	   public void switchOff(){
		    this.isOn = false;
			System.out.println("Light is OFF!!!");
	   }
	   
	   // FINAL BEHAVIOUR OF LIGHT -----------------------
	   
	   public void checkIfOn(){
		   if (this.isOn) {
			   System.out.println("The light is on !!");
		   } else {
			   System.out.println("The light is off!!");
		   }
	   }
}	   
      	