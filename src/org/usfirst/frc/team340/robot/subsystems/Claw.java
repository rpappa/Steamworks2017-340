package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {
    private Solenoid hinge;
    private Solenoid arms;
    private Talon rollers;
    
    /**
     * He made me do it
     */
    public Claw() {
	hinge = new Solenoid(RobotMap.ARM_SOLENOID_CHANNEL);
	arms = new Solenoid(RobotMap.CLAW_SOLENOID_CHANNEL);
	rollers = new Talon(RobotMap.CLAW_ROLLERS_PORT);
    }
    
    public void initDefaultCommand() {
        //Nothing to see here, move along
    }
    
    /**
     * Switch the value of the arm's solenoid
     */
    public void toggleArm() {
	hinge.set(!hinge.get());
    }
    
    /**
     * Set the value of the arm's solenoid
     * @param isDown true if the arm
     * is lowered and vice versa
     */
    public void setArm(boolean isDown) {
	hinge.set(isDown);
    }
    
    /**
     * Switch the value of the claw's solenoid
     */
    public void toggleClaw() {
	arms.set(!arms.get());
    }
    
    /**
     * Set the value of the claw's solenoid
     * @param isClosed true if the claw
     * is lowered and vice versa
     */
    public void setClaw(boolean isClosed) {
	arms.set(isClosed);
    }
    
    public void setRollers(double speed) {
	if(speed < -1) {
	    speed = -1;
	} else if(speed > 1) {
	    speed = 1;
	}
	
	rollers.set(speed);
    }
}
