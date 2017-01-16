package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PneumaticDropSwitch extends Command {
    private Boolean mode; //True for drop, false for raise, null for toggle
    
    /**
     * Toggle the pneumatic drop
     */
    public PneumaticDropSwitch() {
        requires(Robot.drop);
        mode = null;
    }
    
    /**
     * Raise or lower the pneumatic drop
     * @param drop if true, drops;
     * if false; raises
     */
    public PneumaticDropSwitch(boolean drop) {
	requires(Robot.drop);
	mode = Boolean.valueOf(drop);
    }

    @Override
    protected void initialize() {
	//Nothing to see here, move along
    }

    @Override
    protected void execute() {
	if(mode == null) {
	    Robot.drop.toggleSolenoid();
	} else {
	    Robot.drop.setSolenoid(mode.booleanValue());
	}
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void end() {
	//Doesn't do anything
    }

    @Override
    protected void interrupted() {
	//Nothing to do here
    }
}
