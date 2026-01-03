package org.firstinspires.ftc.teamcode.teleop;

import com.pedropathing.ftc.localization.Encoder;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class EncoderCheck extends OpMode {
    DcMotor rightFront, rightRear, leftFront, leftRear;

    @Override
    public void init() {
        rightFront = hardwareMap.get(DcMotor.class,"rightFrontDriveMotor");
        leftFront = hardwareMap.get(DcMotor.class, "leftFrontDriveMotor");
        leftRear = hardwareMap.get(DcMotor.class, "leftRearDriveMotor");
        rightRear = hardwareMap.get(DcMotor.class, "rightRearDriveMotor");

        rightFront.setPower(0.0);
        leftFront.setPower(0.0);
        leftRear.setPower(0.0);
        rightRear.setPower(0.0);

        rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightRear.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftRear.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        telemetry.addData("rightFront", rightFront.getCurrentPosition());
        telemetry.addData("leftFront", leftFront.getCurrentPosition());
        telemetry.addData("leftRear", leftRear.getCurrentPosition());
        telemetry.addData("rightRear", rightRear.getCurrentPosition());

    }
}
