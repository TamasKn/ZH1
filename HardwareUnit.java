package com.tom;

public class HardwareUnit {

    //Instead of interface I used class as Java not allow variables and abstract class was not enough flexible

    protected String name;
    protected double price;
    protected UnitTypes types;

    enum UnitTypes {
        Processor,
        MotherBoard,
        Memory,
        GraphicsCard,
    }

    public HardwareUnit(String name, double price, UnitTypes types) {
        this.name = name;
        this.price = price;
        this.types = types;
    }

    public boolean faulty(){
            int random = (int) (Math.random()*99); //For testing, change to {...random()*10 } and the condition to {...random<6 }
            if(random == 0){
                return true;
            } else {
                return false;
            }
    }

    @Override
    public String toString() {
        return types + ": " + name + ", $" + price;

    }
}
