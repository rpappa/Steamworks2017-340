package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ClawOpen extends InstantCommand {
    public ClawOpen() {
	requires(Robot.claw);
    }
    
    @Override
    protected void execute() {
	Robot.claw.setClaw(false);
    }
}
