package com.company;



public class CalcVolume {
    public int water;
    public int volume;
    public int tank = 1200;



    public CalcVolume(int water, int volume, int tank) {
        this.volume = volume;
        this.water = water;
        this.tank = tank;
    }


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }
}



