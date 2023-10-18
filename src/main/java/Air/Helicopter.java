package Air;

import products.IProduct;
import vehicles.Vehicle;

public class Helicopter extends Vehicle implements IAirVehicle, IRadar{

    //Properties
    IRadar radar;
    IAirVehicle airVehicle;
    
    public Helicopter(float weight, int maxSpeed, IProduct baseProduct, IRadar radar){
        super(weight, maxSpeed, baseProduct);
        this.radar = radar;
//         this.airVehicle = vehicle;
    }

    //
    @Override
    public int getNumberWindows() {
        return airVehicle.getNumberWindows();
    }

    @Override
    public void setNumberWindows(int windowsAmount) {
        airVehicle.setNumberWindows(windowsAmount);
    }

    @Override
    public void startRadar() {

    }

    @Override
    public void stopRadar() {

    }

    @Override
    public int getRadarRange() {
        return radar.getRadarRange();
    }

    @Override
    public void setRadarRange(int radarRange) {
        radar.setRadarRange(radarRange);
    }

    @Override
    public double getRadarSweep() {
        return radar.getRadarSweep();
    }

    @Override
    public void setRadarSweep(double radarSweep) {

    }
}
