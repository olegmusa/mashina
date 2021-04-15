package org.example;

public class WaterWheel implements WheelPower {
    @Override
    public void Tern(String direction) {
        System.out.println("WaterWheel terning " + direction);
    }
}
