package org.firstinspires.ftc.teamcode.subsystems.intake;

import org.firstinspires.ftc.teamcode.RobotHW;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class IntakeHW {
    private final DcMotorEx activeIntake;

    public IntakeHW(RobotHW robotHW) {
        this.activeIntake = robotHW.hardwareMap.get(DcMotorEx.class, "activeIntake");
    }

    public void setIntake(boolean on) {
        activeIntake.setPower(on ? 1.0 : 0.0);
    }

    public void update() {
    }
}

