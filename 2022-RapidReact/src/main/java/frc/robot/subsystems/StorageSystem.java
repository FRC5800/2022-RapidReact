// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class StorageSystem extends SubsystemBase {
  
  private final VictorSPX storageMotor = new VictorSPX(Constants.STORAGE_CONV_ID);

  public StorageSystem() {}

  @Override
  public void periodic() {}

  public void activateStorage(double speed){ 
    storageMotor.set(ControlMode.PercentOutput, speed);
  }

  public void stopStorage(){
    storageMotor.set(ControlMode.PercentOutput, 0.0);
  }
  
}
