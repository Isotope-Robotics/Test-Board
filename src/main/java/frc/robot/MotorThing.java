package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;


public class MotorThing {
    
    public static CANSparkMax NEOMotor = new CANSparkMax(Constants.NEOMotorIndex, MotorType.kBrushless);
}
