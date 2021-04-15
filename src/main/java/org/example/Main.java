package org.example;

public  class Main {

    public static void main(String[] args){
        car bmw = carCREATOR("BMW", WheelPowerType.ELECTRIC);
       car mb = carCREATOR("MB", WheelPowerType.WATER);

      bmw.carbreak();
      bmw.drive();
        bmw.tern("Left");
        mb.carbreak();
        mb.drive();
        mb.tern("Right");
       // wp.Tern("right");
      //  wwp.Tern("left");
        bmw.change_gear(5);
        mb.change_gear(4);

     }
     private static car carCREATOR(String Car, WheelPowerType wpType){
       if (Car.equals("BMW")) {
           BMW bmw = new BMW();
           bmw.setWheelPower(wpType);
           return bmw;
                     }
        return new MB(new WaterWheel());


     }
    //private static WheelPower Wheellll(String wheel){
      //  if (wheel.equals("EWP")) {
        //    return new ElecticWheel();
        //}
  //      return new WaterWheel();

}



