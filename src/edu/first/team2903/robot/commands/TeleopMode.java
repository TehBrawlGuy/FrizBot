package edu.first.team2903.robot.commands;

import edu.first.team2903.robot.OI;
import java.util.Random;

public class TeleopMode extends CommandBase {

    

    public TeleopMode() {
        requires(drivetrain);
        requires(shooter);
    }

    protected void initialize() {
        shooter.frisbeePusher.setAngle(80);
        shooter.diskDrop.setAngle(0);
    }

    protected void execute() {
        boolean state = true;

        //Can't figure out how to turn setPusher to true to activate the 
        //frisbee into the shooter area. Set to button 5 in OI.java
        //OI.triggerButton.whenPressed(new ToggleShooter());
        
        if (OI.scoreStick.getZ() < 0) {
            shooter.setSpeed(-OI.scoreStick.getZ() * 2);
        } else {
            shooter.setSpeed(0);
        }


        //smart shooter
        if (OI.scoreStick.getRawButton(1)) {
            try {
                shooter.shoot();
            } catch (InterruptedException ex) {
                System.out.println("EXCEPTION OCCURED?!");
                System.out.println("Today's Execption Occured Lotto Winner: "+new Random().nextInt());
            }
        }

        if(OI.scoreStick.getRawButton(2)) {
            drivetrain.climb(OI.scoreStick.getY());
        } else {
            drivetrain.climb(0);
        }
        
        drivetrain.drive(OI.leftStick.getY(), OI.rightStick.getY());

    }

    protected boolean isFinished() {
        //Will end when teleop is done
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
