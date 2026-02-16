package esiea.td.mock;

import esiea.td.model.Image;

public class DigitalPhotographer {

    private IDigitalCamera digitalCamera;

    public void SetDigitalCamera(IDigitalCamera camera) {
        this.digitalCamera = camera;
    }

    public Image TakePictureWithFlash() {

        digitalCamera.FlashlightOn();
        Image image = digitalCamera.TakeSnapshot();
        digitalCamera.FlashlightOff();

        return image;
    }
}

