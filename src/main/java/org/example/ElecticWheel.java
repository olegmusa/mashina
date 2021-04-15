package org.example;

public class ElecticWheel implements WheelPower{
    @Override
    public void Tern(String direction) {
        System.out.println( "ElectricWheel trning " + direction);
    }
}
