// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.StorageSystem;

public class ActivateConveyor extends CommandBase {

  private final StorageSystem storageSystem;
  private double convSpeed;

  private Timer timer = new Timer();
  private double time;
  
  public ActivateConveyor(StorageSystem storageSystem, double speed, double time) {
    this.time = time;
    convSpeed = speed;
    this.storageSystem = storageSystem;
    addRequirements(storageSystem);
  }

  @Override
  public void initialize() {
    timer.reset();
    timer.start();
  }

  @Override
  public void execute() {
    storageSystem.activateStorage(convSpeed);

  }

  @Override
  public void end(boolean interrupted) {
    storageSystem.stopStorage();
  }

  @Override
  public boolean isFinished() {
    return timer.get() > time;
  }
}
