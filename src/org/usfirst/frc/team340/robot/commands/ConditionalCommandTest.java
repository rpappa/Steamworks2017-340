package org.usfirst.frc.team340.robot.commands;

import org.usfirst.frc.team340.robot.OI.Axis;
import org.usfirst.frc.team340.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;
import edu.wpi.first.wpilibj.command.InstantCommand;

@Deprecated
public class ConditionalCommandTest extends ConditionalCommand {
    public ConditionalCommandTest(Command onTrue) {
    	this(onTrue, new InstantCommand());
    }
    
    public ConditionalCommandTest(Command onTrue, Command onFalse) {
	super(onTrue, onFalse);
    }
    
    @Override
    protected boolean condition() {
    	return Robot.oi.getDriverAxis(Axis.LEFT_X) < 0;
    }
}
