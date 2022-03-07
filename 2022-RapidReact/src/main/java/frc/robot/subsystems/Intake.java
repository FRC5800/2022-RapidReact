// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  private VictorSPX intakeMotor;

  public Intake() {  
    intakeMotor = new VictorSPX(Constants.INTAKE_MOTOR_ID);
  }

  public void periodic() {}

  public void grabBalls(double speed) {
    intakeMotor.set(ControlMode.PercentOutput, speed);
  }

  public void stopIntake() {
    intakeMotor.set(ControlMode.PercentOutput, 0);
  }
}