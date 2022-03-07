// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {

    private final Shooter shooter;
    private double speed;

    public Shoot(Shooter shooter, double speed) {
        addRequirements(shooter);
        this.shooter = shooter;
        this.speed = speed;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        shooter.turnOnShooter(speed);
    }

    @Override
    public void end(boolean interrupted) {
        shooter.turnOffShooter();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
