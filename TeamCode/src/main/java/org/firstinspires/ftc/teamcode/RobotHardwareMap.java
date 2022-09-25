package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDeviceHealthImpl;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class RobotHardwareMap {
    //Create Motors
    public DcMotor frontRightMotor = null;
    public DcMotor frontLeftMotor = null;
    public DcMotor backRightMotor = null;
    public DcMotor BackLeftMotor = null;

    //Additional Variable
    HardwareMap hardwareMap = null;
    public ElapsedTime runtime = new ElapsedTime();

    public HardwareMap(HardwareMap) hwMap) {
}
