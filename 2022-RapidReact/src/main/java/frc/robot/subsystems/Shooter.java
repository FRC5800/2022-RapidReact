// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
    private final WPI_TalonSRX rightMotor = new WPI_TalonSRX(Constants.RIGHT_MOTOR_SHOOTER_ID);
    private final WPI_TalonSRX leftMotor = new WPI_TalonSRX(Constants.LEFT_MOTOR_SHOOTER_ID);

    public Shooter() {
        rightMotor.configFactoryDefault();
        leftMotor.configFactoryDefault();
        leftMotor.setInverted(true);
    }

    public void turnOnShooter(double speed) {
        rightMotor.set(speed);
        leftMotor.set(speed);
    }

    public void turnOffShooter() {
        rightMotor.set(0);
        leftMotor.set(0);
    }
}
