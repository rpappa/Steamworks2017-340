package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {
	private static final double ROLLER_SPEED = .75; //TODO: perfect this
	
	private DoubleSolenoid claw;
	private DoubleSolenoid hinge;
	private DoubleSolenoid pusher;
	private TalonSRX rollers;
	
	public Claw() {
		claw = new DoubleSolenoid(RobotMap.CLAW_SOLENOID_FORWARD_CHANNEL, RobotMap.CLAW_SOLENOID_REVERSE_CHANNEL);
		hinge = new DoubleSolenoid(RobotMap.ARM_SOLENOID_FORWARD_CHANNEL, RobotMap.ARM_SOLENOID_REVERSE_CHANNEL);
		pusher = new DoubleSolenoid(RobotMap.PUSHER_SOLENOID_FORWARD_CHANNEL, RobotMap.PUSHER_SOLENOID_REVERSE_CHANNEL);
		rollers = new TalonSRX(RobotMap.CLAW_ROLLERS_PORT);
	}
    
	public void goUp(){
		hinge.set(Value.kReverse);
	}

	public boolean isUp(){
		return hinge.get().equals(Value.kReverse);
	}
	
	public void goDown(){
		hinge.set(Value.kForward);
	}
	
	public boolean isDown(){
		return hinge.get().equals(Value.kForward);
	}
	
	public void goOpen(){
		claw.set(Value.kForward); //TODO: see if forward is open or closed
	}
	
	public boolean isOpened(){
		return claw.get().equals(Value.kForward);
	}
	
	public void goClose(){
		claw.set(Value.kReverse);
	}
	
	public boolean isClosed(){
		return claw.get().equals(Value.kReverse);
	}
	
	public void goRetract(){
		pusher.set(Value.kReverse);
	}
	
	public boolean isRetracted(){
		return pusher.get().equals(Value.kReverse);
	}
	
	public void goExtend(){
		pusher.set(Value.kForward);
	}
	
	public boolean isExtended(){
		return pusher.get().equals(Value.kForward);
	}
	
	public void spinStop(){
		rollers.set(0); //0 because no speed is stopped
	}
	
	public boolean isStopped(){
		return rollers.getSpeed() == 0;
	}
	
	public void spinIn(){
		rollers.set(ROLLER_SPEED);
	}
	
	public boolean whenGearIsAcquired(){
		return false; //TODO: make this
	}
	
	public void spinOut(){
		rollers.set(-ROLLER_SPEED); //Negative to push out
	}
	
	public boolean whenGearIsNotAcquired(){
		return false; //TODO: make this
	}
	
    public void initDefaultCommand() {
        //No default command needed
    }
}
