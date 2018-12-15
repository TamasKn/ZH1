package com.tom;


public class CPU extends HardwareUnit implements Comparable{


    public CPU(String name, double price) {
        super(name, price, UnitTypes.Processor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object price) {
        return 0;
    }


    @Override
    public boolean faulty() {
        return super.faulty();
    }
}
