package vehicles;

import products.IProduct;

public class Speedboat extends Vehicle implements IMotorised{

    //Properties
    String hullType;
    IMotorised motor;

    public Speedboat(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.motor = motor;

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
