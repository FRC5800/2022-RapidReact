// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Climber extends SubsystemBase {

  private final VictorSP upMaster = new VictorSP(Constants.Climber.UP_MASTER_ID);
  private final VictorSP downMaster = new VictorSP(Constants.Climber.DOWN_MASTER_ID);
  private final VictorSP upSlave = new VictorSP(Constants.Climber.UP_SLAVE_ID);
  private final VictorSP downSlave = new VictorSP(Constants.Climber.DOWN_SLAVE_ID);

  private final SpeedControllerGroup upGroup = new SpeedControllerGroup(upMaster, upSlave);
  private final SpeedControllerGroup downGroup = new SpeedControllerGroup(downMaster, downSlave);

  public Climber() {
  }

  public void setClimberSpeed(double speed){
    upGroup.set(speed);
    downGroup.set(speed);
  }

  public void extendClimber(double speed){
    upGroup.set(speed);
    downGroup.set(0);
  }

  public void retractClimber(double speed){
    upGroup.set(0);
    downGroup.set(-speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
