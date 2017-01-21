package org.usfirst.frc.team340.robot.commands.groups;

import org.usfirst.frc.team340.robot.commands.CloseClaw;
import org.usfirst.frc.team340.robot.commands.ConditionalCommandTest;
import org.usfirst.frc.team340.robot.commands.DriveXbox;
import org.usfirst.frc.team340.robot.commands.OpenClaw;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CCTest extends CommandGroup {
    public CCTest() {
        addParallel(new DriveXbox());
        addSequential(new ConditionalCommandTest(new CloseClaw(), new OpenClaw()));
    }
}
