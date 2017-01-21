package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.OI.Axis;
import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for driving with Xbox 360 controller
 */
public class DriveXbox extends Command {

    /**
     * Constructs a new instance of
     * {@link DriveXbox}, and all it does
     * is set the required subsystem
     */
    public DriveXbox() {
        requires(Robot.drive);
    }

    @Override
    protected void initialize() {
    	Robot.drive.setBothDrive(0);
    }

    @Override
    protected void execute() {
    	Robot.drive.setBothDrive(Robot.oi.getDriverAxis(Axis.DRIVER_LEFT_Y), Robot.oi.getDriverAxis(Axis.DRIVER_RIGHT_Y));
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    	Robot.drive.setBothDrive(0);
    }

    @Override
    protected void interrupted() {
    	end();
    }
}
