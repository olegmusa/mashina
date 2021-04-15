package org.example;

public class BMW implements car {
    WheelPower wheelPower;
    public void setWheelPower(WheelPowerType wpType){
        if (wpType == WheelPowerType.ELECTRIC){
        this.wheelPower = new ElecticWheel();
    } else {
            this.wheelPower = new WaterWheel();
        }
    }
    @Override
    public void drive() {

        System.out.println("BMW driving");
    }

    @Override
    public void tern(String direction) {
        wheelPower.Tern(direction);
    }

    @Override
    public void carbreak() {
        System.out.println("BMW breaking");
    }
    @Override
    public  void change_gear( int gearNumber){
        robotGear(gearNumber);
    }
    private void robotGear(int gearNumber){
        System.out.println("Robot changing gear to " + gearNumber);
    }

}
