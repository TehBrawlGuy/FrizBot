/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.first.team2903.robot.commands;

/**
 *
 * @author GLaDOS
 */
public class ToggleShooter extends CommandBase {
    
    boolean done = false;
    
    public ToggleShooter() {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
     //   if(shooter.getPusherState()==true) {
       //     shooter.setPusher(false);
        //} else {
          //  shooter.setPusher(true);
        //}
       // done = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
