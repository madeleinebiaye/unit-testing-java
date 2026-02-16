package esiea.td.mock;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import esiea.td.model.Image;

public class DigitalPhotographerTest {

    @Test
    void TestTakePictureWithFlash() {

        DigitalCameraMock mock = new DigitalCameraMock();
        DigitalPhotographer photographer = new DigitalPhotographer();

        photographer.SetDigitalCamera(mock);

        Image image = photographer.TakePictureWithFlash();

        assertTrue(mock.isSnapshotTaken());
        assertFalse(mock.isFlashOn());
        assertNotNull(image);
    }
}