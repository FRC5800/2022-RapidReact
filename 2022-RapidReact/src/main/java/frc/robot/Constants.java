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



    public final class Controller{
    // controller
      public static final int CONTROLLER_ID = 0;
    //buttons
      public static final int Y_BUTTON = 4;
      public static final int A_BUTTON = 1;
      public static final int UP_BUTTON_ID = 6;
      public static final int DOWN_BUTTON_ID = 7;
    }

    public final class Shooter{
    // motors
      public static final int RIGHT_MOTOR_ID = 30;
      public static final int LEFT_MOTOR_ID = 31;
    // speed
      public static final double SPEED = 0.8;
    // delay
      public static final double DELAY = 2;
    }

    public final class DriveTrain{
    //motors
      public static final int LEFT_MASTER_ID = 2;
      public static final int LEFT_SLAVE_ID = 1;
      public static final int RIGHT_MASTER_ID = 4;
      public static final int RIGHT_SLAVE_ID = 3;
    }

    public final class Storage{
    // motors
      public static final int CONV_ID = 20;
    // speeds
      public static final double SPEED = 1.0;
    }

    public final class Intake{
    //motors
      public static final int MOTOR_ID = 10;
    // speeds
      public static final double MAX_SPEED = 0.7;
      public static final double DEADBAND = 0.3;
    }

    public final class Climber{
    //motors
      public static final int UP_MASTER_ID = 8;
      public static final int UP_SLAVE_ID = 9;
      public static final int DOWN_MASTER_ID = 10;
      public static final int DOWN_SLAVE_ID = 11;
    // speeds
      public static final double SPEED = 0.5;
    }

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
