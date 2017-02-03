package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	
	private static final double ENGAGEMENT_SPEED = 0.5;
	private static final double CLIMB_SPEED = 0.75;
	private Spark drumOne;
	
	@SuppressWarnings("unused")
	private Spark drumTwo; //TODO: see if we need to worry about both (check for sync)
	
	public Climber() {
		drumOne = new Spark(RobotMap.CLIMBER_DRUM_PORT_ONE);
		drumTwo = new Spark(RobotMap.CLIMBER_DRUM_PORT_TWO);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void goAtEngagementSpeed(){
		goToSpeed(ENGAGEMENT_SPEED);
	}
	
	private void goToSpeed(double speed){
		drumOne.set(speed);
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
		return drumOne.get() ==0;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
