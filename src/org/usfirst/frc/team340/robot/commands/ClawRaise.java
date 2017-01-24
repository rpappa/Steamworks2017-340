package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class ClawRaise extends InstantCommand {
    public ClawRaise() {
        requires(Robot.claw);
    }

    @Override
    protected void execute() {
    	Robot.claw.setArm(false);
    }
}
