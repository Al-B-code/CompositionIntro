package vehicles;

import products.IProduct;

public class Kayak extends Vehicle implements IWaterVehicle{

    String hullType;

    //Constructor
    public Kayak(String inputHullType, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = inputHullType;
    }

    //
    @Override
    public String getHullType() {
        return null;
    }

    @Override
    public void setHullType(String hullType) {

    }
}
