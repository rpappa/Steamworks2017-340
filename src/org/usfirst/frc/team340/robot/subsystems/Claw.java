package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {
    private Solenoid arm;
    private Solenoid claw;
    
    /**
     * He made me do it
     */
    public Claw() {
	arm = new Solenoid(RobotMap.ARM_SOLENOID_CHANNEL);
	claw = new Solenoid(RobotMap.CLAW_SOLENOID_CHANNEL);
    }
    
    public void initDefaultCommand() {
        //Nothing to see here, move along
    }
    
    /**
     * Switch the value of the arm's solenoid
     */
    public void toggleArm() {
	arm.set(!arm.get());
    }
    
    /**
     * Set the value of the arm's solenoid
     * @param isDown true if the arm
     * is lowered and vice versa
     */
    public void setArm(boolean isDown) {
	arm.set(isDown);
    }
    
    /**
     * Switch the value of the claw's solenoid
     */
    public void toggleClaw() {
	claw.set(!claw.get());
    }
    
    /**
     * Set the value of the claw's solenoid
     * @param isDown true if the claw
     * is lowered and vice versa
     */
    public void setClaw(boolean isDown) {
	claw.set(isDown);
    }
}

