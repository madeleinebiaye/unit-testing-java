package esiea.td.mock;

import esiea.td.model.Image;

public class DigitalCameraMock implements IDigitalCamera {

    private boolean flashOn = false;
    private boolean snapshotTaken = false;

    @Override
public Image TakeSnapshot() {
    snapshotTaken = true;
    return new Image();   // ← ICI on enlève le paramètre
}



    @Override
    public void FlashlightOn() {
        flashOn = true;
    }

    @Override
    public void FlashlightOff() {
        flashOn = false;
    }

    public boolean isFlashOn() {
        return flashOn;
    }

    public boolean isSnapshotTaken() {
        return snapshotTaken;
    }
}
