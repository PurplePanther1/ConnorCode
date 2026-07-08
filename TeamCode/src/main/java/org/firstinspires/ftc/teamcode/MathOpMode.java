package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class MathOpMode extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double leftForward = -gamepad1.left_stick_y/2;
        double rightForward = -gamepad1.right_stick_y/2;
        double combined = leftForward + rightForward;
        boolean bPressed = gamepad1.b;
        telemetry.addData("Left Forward", leftForward);
        telemetry.addData("Right Forward", rightForward);
        telemetry.addData("Combined", combined);
        telemetry.addData("B button pressed", bPressed);
    }
}
