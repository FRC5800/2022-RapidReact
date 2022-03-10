// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class PIDDriveStraight extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final DriveTrain driveTrain;

  private final double distance;
  private double positionError = 0;
  private double trueError = 0;

  /**
   * Creates a new PIDDriveStraight.
   *
   * @param subsystem The subsystem used by this command.
   */
  public PIDDriveStraight(DriveTrain dt, double distance) {
    driveTrain = dt;
    this.distance = distance;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveTrain.resetEncoders();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    positionError = ((driveTrain.getTrueDistance() - distance) / distance) * 100;
    trueError = positionError * Constants.KP_VALUE;

    if(distance > 0){
      driveTrain.arcadeDrive(trueError, 0);
    }

    if(distance < 0){
      driveTrain.arcadeDrive(-trueError, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if(distance > 0){
      return driveTrain.getTrueDistance() >= distance;
    } else if(distance < 0){
      return driveTrain.getTrueDistance() <= distance;
    }

	return false;
  }
}
