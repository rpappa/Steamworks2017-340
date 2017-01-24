package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ClawHarvest extends InstantCommand {
    public ClawHarvest() {
        requires(Robot.claw);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.claw.setArm(true);
    	Robot.claw.setClaw(false);
    	Robot.claw.setRollers(1);
    }
}
