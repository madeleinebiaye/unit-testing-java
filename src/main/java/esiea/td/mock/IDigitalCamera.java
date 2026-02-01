package esiea.td.mock;
import esiea.td.model.Image;

public interface IDigitalCamera{
    Image TakeSnapshot();
    void FlashlightOn();
    void FlashlightOff();
}
