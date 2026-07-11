package org.firstinspires.ftc.teamcode;

public class RobotLocation {
    double angleRadians;
    double x;
    double y;

    public RobotLocation(double angleDegrees, double x, double y){
        this.angleRadians = Math.toRadians(angleDegrees);
        this.x = x;
        this.y = y;
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
    public double getAngle(){
        double angle = this.angleRadians;
        return angle;
    }
    @Override
    public String toString(){
        return "Robotlocation: angle (" + angleRadians + ")";
    }

    public void turn(double angleChange){
        angleRadians += Math.toRadians(angleChange);
    }
    public void changeX(double xChange){
        x += xChange;
    }
    public void changeY(double yChange){
        y += yChange;
    }
    public void  setAngle(double angleDegrees){
        this.angleRadians = Math.toRadians(angleDegrees);
    }

}
