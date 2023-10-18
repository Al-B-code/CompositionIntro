package Air;

public class Radar implements IRadar{
    
    
    private int range;
    private double sweepFrequency;
    
    public Radar(int range, double sweepFrequency){
        this.range = range;
        this.sweepFrequency = sweepFrequency;
    }


    //
    @Override
    public void startRadar() {
        
    }

    @Override
    public void stopRadar() {

    }

    @Override
    public int getRadarRange() {
        return this.range;
    }

    @Override
    public void setRadarRange(int radarRange) {

    }

    @Override
    public double getRadarSweep() {
        return this.sweepFrequency;
    }

    @Override
    public void setRadarSweep(double radarSweep) {

    }

}
