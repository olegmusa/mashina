package org.example;

public class MB implements car {
    WheelPower wheelPowe;
    public MB(WheelPower WP) {
        this.wheelPowe = WP;
    }
    @Override
    public void drive() {
        System.out.println("MB driving");
    }

    @Override
    public void tern(String direction) {
       wheelPowe.Tern(direction);
    }

    @Override
    public void carbreak() {
        System.out.println("MB breaking");
    }

    @Override
    public void change_gear( int gearNumber) {
        Driver_gear(gearNumber);
    }
    private void Driver_gear(int gearNumber){
        System.out.println("Driver changing gear to " + gearNumber);

}
}
