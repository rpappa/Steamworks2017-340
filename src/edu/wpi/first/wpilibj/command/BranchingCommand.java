package edu.wpi.first.wpilibj.command;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;
import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 * <h1><em>BranchingCommand</em></h1><br>
 * The meaning of this class is to create a
 * {@link Command} that can be branched out into two
 * possible outputs for the next {@link Command} to
 * be run.<br>
 * This type of {@link Command} functions exactly like
 * any other, with some extra little bits added on.
 * Specifically, it will automatically call the
 * constructor-passed {@link ConditionalCommand} on
 * its end.<br>
 * <br>
 * <em>Important things to note:</em>
 * <ul>
 * <li>{@link #end()} is NEVER to be
 * overridden!
 * <li>Rather than using {@link #end()}, you are required
 * to use {@link #preEnd()}, as {@link #end()} will automatically
 * invoke it before starting the {@link ConditionalCommand}.
 * <li>{@link #interrupted()} will simply call {@link #end()},
 * as that's what it defaults to in {@link Command#interrupted()}.
 * Feel free to override it for any other purpose, of course.
 * </ul><br>
 * This class is in the package that it's in because John
 * got curious about package access and I was too lazy to put
 * it back before Jakob thought about modifying the WPILib
 * wizards
 */
public abstract class BranchingCommand extends Command {
    private ConditionalCommand next;
    
    /**
     * This will create a new BranchCommand that 
     * is simply a pass-through and to support 
     * leaf nodes in our branching.
     */
    public BranchingCommand(){
	this(new ConditionalCommand(new InstantCommand()) {
	    
	    @Override
	    protected boolean condition() {
		return true;
	    }
	});
    }
    
    /**
     * Create a new {@link BranchingCommand} and
     * define the {@link ConditionalCommand} to
     * be run afterwards
     * @param cmd the {@link ConditionalCommand}
     * to run after this
     */
    public BranchingCommand(ConditionalCommand cmd) {
	setNextCommand(cmd);
    }
    
    /**
     * The replacement for {@link Command#end()}
     * for derivative use. This is where you may want to wrap up
     * loose ends, like shutting off a motor that was being used
     * in the command.<br>
     * Yes, I <em>did</em> just steal that from {@link Command#end()}
     */
    protected abstract void preEnd();
    
    private void setNextCommand(ConditionalCommand cmd) {
	next = cmd;
    }
    
    /**
     * Called when the command ended peacefully. This is never
     * to be overridden, as doing so may break the "branching"
     * part of "branching command"
     * @see BranchingCommand#preEnd()
     */
    @Override
    protected void end() {
	preEnd();
	next.start();
    }
}