// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.StorageSystem;

public class TimedConveyor extends CommandBase {

  private final StorageSystem storageSystem;
  private final Timer timer = new Timer();
  private double speed;
  private double time;

  public TimedConveyor(StorageSystem storageSystem, double speed, double time) {
    this.speed = speed;
	this.time = time;
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
    storageSystem.activate(speed);
  }

  @Override
  public void end(boolean interrupted) {
    storageSystem.stop();
  }

  @Override
  public boolean isFinished() {
    return timer.get() >= time;
  }
}
