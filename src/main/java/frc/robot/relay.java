package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;

public class relay {
   
    

  
       public static Servo myServo = new Servo(0);
    

    public static void servoUp() {
        // Set the servo position to half (0.5)
        myServo.set(myServo.get() + 0.05);
    
}

public static void servoDown() {
        // Set the servo position to half (0.5)
        myServo.set(myServo.get() - 0.05);
    
}

public static DigitalInput laser = new DigitalInput(8);
}

