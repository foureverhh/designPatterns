package uml.structurial.adapter.classAdapter.adapter;

import uml.structurial.adapter.classAdapter.Power5V;
import uml.structurial.adapter.classAdapter.adapee.Power220V;

public class PowerAdapter extends Power220V implements Power5V {

    @Override
    public void getPower5V() {
        //super.getPower220();
        this.getPower220();
        transformVoltage();
    }

    private void transformVoltage(){
        System.out.println("Voltage converts from 200V to 5V");
    }
}
