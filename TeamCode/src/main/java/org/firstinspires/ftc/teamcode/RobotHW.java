package org.firstinspires.ftc.teamcode;
import static org.firstinspires.ftc.teamcode.utils.Globals.START_LOOP;

import com.acmerobotics.dashboard.canvas.Canvas;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.opmodes.DriveHW;
import org.firstinspires.ftc.teamcode.subsystems.deposit.DepositHW;
import org.firstinspires.ftc.teamcode.subsystems.intake.IntakeHW;
import org.firstinspires.ftc.teamcode.utils.priority.HardwareQueue;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class RobotHW extends Robot {
    public final HardwareMap hardwareMap;
    public final HardwareQueue hardwareQueue;
    public final DriveHW driveHW;
    public final DepositHW depositHW;
    public final IntakeHW intakeHW;

    private BooleanSupplier stopChecker = null;

    public ArrayList<Consumer<Canvas>> canvasDrawTasks;



    public RobotHW(HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
        this.hardwareQueue = new HardwareQueue();

        intakeHW = new IntakeHW(this);
        driveHW  = new DriveHW(this);
        depositHW = new DepositHW(this);



    }

    public void update() {
        START_LOOP();

        if (this.stopChecker != null && this.stopChecker.getAsBoolean()) {
            this.hardwareQueue.update();
            return;


        }


        driveHW.update();
        intakeHW.update();
        depositHW.update();

        hardwareQueue.update();
    }

}