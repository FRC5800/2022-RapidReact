// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {

  public static final int CONTROLLER_ID = 0;

  public static final int RIGHT_MOTOR_SHOOTER_ID = 4;
  public static final int LEFT_MOTOR_SHOOTER_ID = 5;
  public static final int LEFT_MASTER_ID = 2;
  public static final int LEFT_SLAVE_ID = 1;
  public static final int RIGHT_MASTER_ID = 4;
  public static final int RIGHT_SLAVE_ID = 3;
  public static final int STORAGE_CONV_ID = 0;
  public static final int INTAKE_MOTOR_ID = 1;
  public static final int CLIMBER_LEFT_MASTER_ID = 8;
  public static final int CLIMBER_LEFT_SLAVE_ID = 9;
  public static final int CLIMBER_RIGHT_MASTER_ID = 10;
  public static final int CLIMBER_RIGHT_SLAVE_ID = 11;
  
  public static final double SHOOTER_SPEED = 0.8;
  public static final double STORAGE_SPEED = 1.0;
  public static final double INTAKE_SPEED = 0.5;  
  public static final double CLIMBER_SPEED = 0.5;
  public static final double SHOOTER_DELAY = 2;

  public static final int Y_BUTTON = 4;
  public static final int A_BUTTON = 1;
  public static final int TRIGGER_ID = 5;
  public static final int UP_BUTTON_ID = 6;
  public static final int DOWN_BUTTON_ID = 7;
  
  //PID Channel
  public static final int A_CHANNEL = 0;
  public static final int B_CHANNEL = 1;

  //PID
  private static final double CPR = 2048;
  private static final double WHEEL_CIRCUMFERENCE = Math.PI * 5;
  public  static final double CONVERT_TO_DISTANCE = WHEEL_CIRCUMFERENCE / CPR;

  public static final double kTurnP = 1;
  public static final double kTurnI = 0;
  public static final double kTurnD = 0;

  public static final double KP_VALUE = 0.05;

  public static final double kMaxTurnRateDegPerS = 100;
  public static final double kMaxTurnAccelerationDegPerSSquared = 300;

  public static final double kTurnToleranceDeg = 5;
  public static final double kTurnRateToleranceDegPerS = 10; // degrees per second
}
