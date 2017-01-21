package org.usfirst.frc.team340.robot.commands.groups;

import org.usfirst.frc.team340.robot.commands.ClawClose;
import org.usfirst.frc.team340.robot.commands.ConditionalCommandTest;
import org.usfirst.frc.team340.robot.commands.DriveXbox;
import org.usfirst.frc.team340.robot.commands.ClawOpen;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class CCTest extends CommandGroup {
    public CCTest() {
        addParallel(new DriveXbox());
        addSequential(new ConditionalCommandTest(new ClawClose(), new ClawOpen()));
    }
}
