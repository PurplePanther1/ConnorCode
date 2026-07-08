package org.firstinspires.ftc.teamcode;

public class RobotLocation {
    double angleRadians;

    public RobotLocation(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }

    public double getHeading(){
        double angle = this.angleRadians;
        while (angle > Math.PI){
            angle -= 2*Math.PI;
        }
        while (angle < -Math.PI){
            angle += 2*Math.PI;
        }
        return Math.toDegrees(angle);
    }

    @Override
    public String toString(){
        return "Robotlocation: angle (" + angleRadians + ")";
    }

    public void turn(double angleChange){
        angleRadians += Math.toRadians(angleChange);
    }
    public void  setAngle(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }
}
