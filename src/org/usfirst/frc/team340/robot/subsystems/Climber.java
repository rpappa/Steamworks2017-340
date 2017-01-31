package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	
	private static final double ENGAGEMENT_SPEED = 0.5;
	private static final double CLIMB_SPEED = 0.75;
	private Talon drum;
	
	public Climber() {
		drum = new Talon(RobotMap.CLIMBER_DRUM_PORT);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void goAtEngagementSpeed(){
		goToSpeed(ENGAGEMENT_SPEED);
	}
	
	private void goToSpeed(double speed){
		drum.set(speed);
	}
	
	public boolean isEngagedWithRope(){
		return false;
	}
	
	public void goAtClimbSpeed(){
		goToSpeed(CLIMB_SPEED);
	}
	
	public boolean isEngagedWithTouchPad(){
		return false;
	}
	
	public void goStopped(){
		goToSpeed(0); //zero is no movement therefore stop
	}
	
	public boolean isStopped(){
		return drum.get() ==0;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

