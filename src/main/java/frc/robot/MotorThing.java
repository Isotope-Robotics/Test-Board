package frc.robot;
// import for Spark Max (Neo Motor "Controller")
import com.revrobotics.CANSparkMax;

// imports the library to change the MotorType for the Spark Max
import com.revrobotics.CANSparkLowLevel.MotorType;

// import com.ctre.phoenix6.hardware.CANcoder;

// imports the CTRE TalonFX motor library
import com.ctre.phoenix6.hardware.TalonFX;


public class MotorThing {
    
    // needs to be static, Constants.NEOMotorIndex references the ID of the spark max
    public static final CANSparkMax NEOMotor = new CANSparkMax(Constants.NEOMotorIndex, MotorType.kBrushless);
    // only need to type the motor type for Spark Max Motors
    public static final TalonFX TalonMotor = new TalonFX(Constants.TalonMotorIndex);
}