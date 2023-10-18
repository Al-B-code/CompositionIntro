package Air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {

    int getNumberWindows();
    void setNumberWindows(int windowsAmount);
}
