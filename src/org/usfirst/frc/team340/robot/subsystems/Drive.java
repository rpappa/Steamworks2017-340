package org.usfirst.frc.team340.robot.subsystems;

import org.usfirst.frc.team340.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;

public class Drive {
    private static Talon leftDrive = new Talon(RobotMap.LEFT_DRIVE_PORT);
    private static Talon rightDrive = new Talon(RobotMap.RIGHT_DRIVE_PORT);
    
    public void setLeftDrive(double speed) {
	if(speed < -1) {
	    speed = -1;
	} else if(speed > 1) {
	    speed = 1;
	}
	
	leftDrive.set(speed);
    }
    
    public void setRightDrive(double speed) {
	if(speed < -1) {
	    speed = -1;
	} else if(speed > 1) {
	    speed = 1;
	}
	
	rightDrive.set(-speed);
    }
    
    public void setBothDrive(double speed) {
	setBothDrive(speed, speed);
    }
    
    public void setBothDrive(double lSpeed, double rSpeed) {
	setLeftDrive(lSpeed);
	setRightDrive(rSpeed);
    }
}
