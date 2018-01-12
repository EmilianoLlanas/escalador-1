package org.usfirst.frc.team3158.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;


public class ClimberSubsystem extends Subsystem {
	CANTalon ClimberMotor1;
	CANTalon ClimberMotor2;
	
	public ClimberSubsystem (int ClimberMotorNumber1,int ClimberMotorNumber2){
		ClimberMotor1= new CANTalon (ClimberMotorNumber1);
		ClimberMotor2= new CANTalon (ClimberMotorNumber2);
	}
  public void ClimberUp (boolean climbup){ 
	  if ( climbup==true){
		  ClimberMotor1.set(.90);
		  ClimberMotor2.set(-.90);
	  } else{ 
	  ClimberMotor1.set(0);
	  ClimberMotor2.set(0);
	 }
	  }
	  public void ClimberDown (boolean climbdown){ 
		  if (climbdown==true){
			  ClimberMotor1.set(-.90);
			  ClimberMotor2.set(.90);
		  } else{ 
		  ClimberMotor1.set(0);
		  ClimberMotor2.set(0);
		  
		  }

	  
  }
    public void initDefaultCommand() {
   
    }
}

