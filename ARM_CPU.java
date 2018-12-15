package com.tom;

public class ARM_CPU extends CPU {

    private int coreNumber;

    public ARM_CPU(String name, double price, int coreNumber) {
        super(name, price);
        this.coreNumber = coreNumber;
    }

    @Override
    public boolean faulty() {
        return super.faulty();
    }

    //@Override
    public int compareTo(double price, int coreNumber) {
        if((this.price == price) && (this.coreNumber == coreNumber)){
            return 0;
        } else if( ((this.price == price) && (this.coreNumber > coreNumber)) || this.price > price){
            return 1;
        } else if((this.price == price) && (this.coreNumber < coreNumber)){
            return -1;
        } else {
            return -1;
        }

    }
}
