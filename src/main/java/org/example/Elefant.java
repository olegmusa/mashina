package org.example;

public  class Elefant {
    boolean wool ;
    int legs = 4;

    public  int getLegs() {
        return legs;
    }

    int ears = 2;

    public int getEars() {
        return ears;
    }

    public  void  Walk(){
        System.out.println("Walking");

}

    public  void  Wool(){
        if(wool = true)
        System.out.println("Covered");
        else System.out.println("NOT Covered");
    }


}
