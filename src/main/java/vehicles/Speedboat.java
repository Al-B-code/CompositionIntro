package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IWaterVehicle, IMotorised{

    //Properties
    String hullType;
    IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor, String hullType){
        super(weight, maxSpeed, baseProduct);
        this.motor = motor;
        this.hullType = hullType;

    }
    @Override
    public String getHullType(){
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType){
        this.hullType = hullType;
    }


    //
    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {

    }
}
