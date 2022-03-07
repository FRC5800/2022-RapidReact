// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.Climber;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveRobot;
import frc.robot.commands.ExtendClimber;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.StorageSystem;
import frc.robot.commands.ConveyorAndShoot;
import frc.robot.commands.GrabBalls;
import frc.robot.commands.InvertIntake;
import frc.robot.commands.RetractClimber;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;




public class RobotContainer {

  //subsystems
  private final Climber climber = new Climber();
  private final DriveTrain driveTrain = new DriveTrain();
  private final Shooter shooter = new Shooter();
  private final StorageSystem storageSystem = new StorageSystem();
  private final Intake intake = new Intake();
 
  private final XboxController xboxController = new XboxController(Constants.CONTROLLER_ID);

   //buttons
  private final JoystickButton xButton = new JoystickButton(xboxController, XboxController.Button.kX.value);
  private final JoystickButton yButton = new JoystickButton(xboxController, XboxController.Button.kY.value);
  private final JoystickButton rightTrigger = new JoystickButton(xboxController, Constants.TRIGGER_ID);
  private final JoystickButton upButton = new JoystickButton(xboxController, Constants.UP_BUTTON_ID);
  private final JoystickButton downButton = new JoystickButton(xboxController, Constants.DOWN_BUTTON_ID);

  public RobotContainer() {
    driveTrain.setDefaultCommand(new DriveRobot(driveTrain, xboxController));
    configureButtonBindings();
  }

  private void configureButtonBindings() {
    xButton.toggleWhenPressed(new DriveRobot(driveTrain, xboxController));

    rightTrigger.whenHeld(new GrabBalls(intake));
    yButton.whenHeld(new InvertIntake(intake));

    xButton.whenHeld(new ConveyorAndShoot(storageSystem, shooter, Constants.STORAGE_SPEED, Constants.SHOOTER_SPEED, Constants.SHOOTER_DELAY));

    upButton.whenHeld(new ExtendClimber(climber, Constants.CLIMBER_SPEED));
    downButton.whenHeld(new RetractClimber(climber, Constants.CLIMBER_SPEED));
  }

  public Command getAutonomousCommand() {
    return null;
  }
}
