package org.usfirst.frc.team340.robot.commands.groups;

import org.usfirst.frc.team340.robot.commands.ClawGrabGear;
import org.usfirst.frc.team340.robot.commands.ClawHarvest;
import org.usfirst.frc.team340.robot.commands.ClawRaise;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class HarvestGear extends CommandGroup {
    public HarvestGear() {
        addSequential(new ClawHarvest());
        addSequential(new ClawGrabGear());
        addSequential(new ClawRaise());
    }
}
