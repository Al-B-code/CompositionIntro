package vehicles;

public class Motor implements IMotorised{

    private int hp;
    private int fuel;

    public Motor(int hp, int fuel){
        this.hp = hp;
        this.fuel = fuel;
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
        return this.hp;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {

    }
    
    

}
