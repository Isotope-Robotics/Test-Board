package frc.robot;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TimedRobot;

public class relay extends TimedRobot {
   
    private Servo myServo;

    @Override
    public void robotInit() {
        myServo = new Servo(0);
    }

    @Override
    public void teleopPeriodic() {
        // Set the servo position to half (0.5)
        myServo.set(0.5);
    }
}

