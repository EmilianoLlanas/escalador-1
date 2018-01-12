package org.usfirst.frc.team3158.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	CANTalon ClimberMotor1;
	CANTalon ClimberMotor2;
	Joystick Control;
	JoystickButton ClimberUp;
	JoystickButton ClimberDown;
	public static ClimberSubsystem Climb;
	@Override
	public void robotInit() {
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		Climb=new ClimberSubsystem(0,0);
		Control= new Joystick(0);
		ClimberUp= new JoystickButton(Control,0);
		ClimberDown= new JoystickButton(Control,0);
		ClimberUp.whenPressed(new ClimberUpCommand());	
		ClimberUp.whenReleased(new ClimberOffCommand());
		ClimberDown.whenPressed(new ClimberDownCommand());	
		ClimberDown.whenReleased(new ClimberOffCommand());
	}


	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();

		System.out.println("Auto selected: " + autoSelected);
	}

	@Override
	public void autonomousPeriodic() {
		switch (autoSelected) {
		case customAuto:
		
			break;
		case defaultAuto:
		default:
	
			break;
		}
	}

	
	@Override
	public void teleopPeriodic() {
	}


	@Override
	public void testPeriodic() {
	}
}

