package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.BranchingCommand;
import org.usfirst.frc.team340.robot.Robot;

public class ClawGrabGear extends BranchingCommand {
    public ClawGrabGear() {
        requires(Robot.claw);
    }

    @Override
    protected void execute() {
    	Robot.claw.setClaw(true);
    	Robot.claw.setRollers(0);
    }

	@Override
	protected boolean isFinished() {
		return true;
	}
}
