package edu.first.team2903.robot.subsystems;

import edu.first.team2903.robot.RobotMap;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {

    public Victor shooterWheel = new Victor(RobotMap.shooterWheel);
    public Servo frisbeePusher = new Servo(RobotMap.frisbeePusher);
    public Servo diskDrop = new Servo(RobotMap.diskDrop);
    //Servo frisbeePusher = new Servo(RobotMap.frisbeePusher);

    protected void initDefaultCommand() {
    }

    public void setSpeed(double speed) {
        shooterWheel.set(speed);
    }

    public void setPusher(boolean state) {
        if (state == true) {
            // frisbeePusher.setAngle(180); 
        }
        if (state == false) {
            //frisbeePusher.setAngle(90);
        }
    }

    public void shoot() throws InterruptedException {
        frisbeePusher.setAngle(160); //Po - Maybe set to 175
        Thread.sleep(1500);           //wait for disk to shoot
        frisbeePusher.setAngle(80);   //pusher in
        Thread.sleep(1000);           //wait with pusher back
    }
}
