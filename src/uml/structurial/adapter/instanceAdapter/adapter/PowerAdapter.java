package uml.structurial.adapter.instanceAdapter.adapter;

import uml.structurial.adapter.instanceAdapter.Power12V;
import uml.structurial.adapter.instanceAdapter.adapee.Power220V;

public class PowerAdapter implements Power12V {
    private Power220V power220V;

    public PowerAdapter(Power220V power220V) {
        this.power220V = power220V;
    }

    @Override
    public void getPower12V() {
        //super.getPower220();
        power220V.getPower220();
        transformVoltage();
    }

    private void transformVoltage(){
        System.out.println("Voltage converts from 200V to 12V");
    }
}
