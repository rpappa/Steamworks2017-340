package org.usfirst.frc.team340.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class DPad extends Button {
    private Joystick joystick;
    private int direction;
    
    /**
     * Class for dealing with the D-Pad
     * aka PoV hat using enum
     * @param joy {@link Joystick} in
     * question
     * @param dir {@link Direction} enum
     * to use
     */
    public DPad(Joystick joy, Direction dir) {
    	this(joy, dir.getDirection());
    }
    		
    /**
     * Class for dealing with the D-Pad
     * aka PoV hat
     * @param joy the joystick
     * @param direction angle the hat
     * must be equal to
     */
    public DPad(Joystick joy, int direction) {
    	joystick = joy;
    	this.direction = direction;
    }
    
    /**
     * Enumerates all of the eight possible
     * directions for a d-pad
     */
    public enum Direction {
    	right(90),
    	upRight(45),
    	up(0),
    	upLeft(315),
    	left(270),
    	downLeft(225),
    	down(180),
    	downRight(135);
    	
    	private int dir;
    	
    	private Direction(int direction) {
    	    dir = direction;
    	}
    	
    	public int getDirection() {
    	    return dir;
    	}
    }
    
    /**
     * Gets whether or not the hat's angle
     * is equal to the given angle
     * @return true if the PoV hat is
     * equal to the given angle, false
     * otherwise
     */
    public boolean get() {
    	return joystick.getPOV() == direction;
    }
}
