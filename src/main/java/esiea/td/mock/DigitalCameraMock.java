package esiea.td.mock;
import esiea.td.model.Image;

public class DigitalCameraMock implements IDigitalCamera {

    private boolean isFlashOn = false;

    @Override
    public Image TakeSnapshot() {
        // TODO This would connect to the real camera and take a picture
        return null;
    }

    @Override
    public void FlashlightOn() {
        // TODO This would connect to the real camera and set the flash light on
        isFlashOn = true;
    }

    @Override
    public void FlashlightOff() {
        // TODO This would connect to the real camera and set the flash light off
        isFlashOn = false;
    }
}
