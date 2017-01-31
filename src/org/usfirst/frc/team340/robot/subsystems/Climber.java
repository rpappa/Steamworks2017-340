package org.usfirst.frc.team340.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void goAtEngagementSpeed(){
		
	}
	
	public void goToSpeed(double speed){
		
	}
	
	public boolean isEngagedWithRope(){
		return false;
	}
	
	public void goAtClimbSpeed(){
		
	}
	
	public boolean isEngagedWithTouchPad(){
		return false;
	}
	
	public void goStopped(){
		
	}
	
	public boolean isStopped(){
		return false;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

