// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commandgroups;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Shoot;
import frc.robot.commands.TimedConveyor;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.StorageSystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ConveyorAndShoot extends SequentialCommandGroup {
  /** Creates a new ConveyorAndShooter. */
  public ConveyorAndShoot(StorageSystem storageSystem, Shooter shooter, double convSpeed, double shooterSpeed, double time) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new TimedConveyor(storageSystem, convSpeed, time),
      new Shoot(shooter, shooterSpeed)
    );
  }
}
