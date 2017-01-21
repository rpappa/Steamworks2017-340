package org.usfirst.frc.team340.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class ConditionalCommandTest extends ConditionalCommand {
	public ConditionalCommandTest(Command onTrue) {
		super(onTrue);
	}
	
	@Override
	protected boolean condition() {
		return true;
	}
}
