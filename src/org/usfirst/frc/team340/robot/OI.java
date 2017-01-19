package org.usfirst.frc.team340.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
@SuppressWarnings("unused")
public class OI {
	
	//TODO: enumerate correct integers
	
	//DRIVER
	private Joystick driver = new Joystick(0);
	private Button driverA = new JoystickButton(driver, 0);
	private Button driverB = new JoystickButton(driver, 1);
	private Button driverX = new JoystickButton(driver, 2);
	private Button driverY = new JoystickButton(driver, 3);
	private Button driverLS = new JoystickButton(driver, 4);
	private Button driverRS = new JoystickButton(driver, 5);
	private Button driverLB = new JoystickButton(driver, 6);
	private Button driverRB = new JoystickButton(driver, 7);
	private Button driverBack = new JoystickButton(driver, 8);
	private Button driverStart = new JoystickButton(driver, 9);
	
	//CO-DRIVER
	private Joystick coDriver = new Joystick(1);
	private Button coDriverA = new JoystickButton(coDriver, 0);
	private Button coDriverB = new JoystickButton(coDriver, 1);
	private Button coDriverX = new JoystickButton(coDriver, 2);
	private Button coDriverY = new JoystickButton(coDriver, 3);
	private Button coDriverLS = new JoystickButton(coDriver, 4);
	private Button coDriverRS = new JoystickButton(coDriver, 5);
	private Button coDriverLB = new JoystickButton(coDriver, 6);
	private Button coDriverRB = new JoystickButton(coDriver, 7);
	private Button coDriverBack = new JoystickButton(coDriver, 8);
	private Button coDriverStart = new JoystickButton(coDriver, 9);
	
	//MANUAL BOARD
	private Joystick board = new Joystick(2);
}
