package org.firstinspires.ftc.teamcode.subsystems.deposit;

import org.firstinspires.ftc.teamcode.RobotHW;

public class DepositHW {

    private final Arm arm;

    public DepositHW(RobotHW robotHW) {

        this.arm = new Arm(robotHW);
    }

    public void openClaw() {
        arm.clawOpen();
    }

    public void closeClaw() {
        arm.clawClose();
    }

    public void setClawRotation(double radians) {
        arm.setClawRotation(radians, 1.0);
    }

    public void setArmRotation(double radians) {
        arm.setArmRotation(radians, 1.0);
    }

    public void update() {
    }
}
