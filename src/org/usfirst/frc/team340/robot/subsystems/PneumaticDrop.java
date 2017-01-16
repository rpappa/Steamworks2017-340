package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This will, at some point,
 * contain the pneumatic drop
 * stuff and things
 */
public class PneumaticDrop extends Subsystem {
    private static Solenoid solenoid = new Solenoid(RobotMap.SOLENOID_CHANNEL);
    
    @Override
    protected void initDefaultCommand() {
	//Nothing to see here
    }
    
    public void toggleSolenoid() {
	solenoid.set(!solenoid.get());
    }
    
    public void setSolenoid(boolean isEnabled) {
	solenoid.set(isEnabled);
    }
}
