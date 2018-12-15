package com.tom;

public class Main {

    public static void main(String[] args) {

        //User class not being created, description is not clear
        

        HardwareUnit newCpu = new ARM_CPU("Intel i7",220, 4);
        HardwareUnit newMbu = new HardwareUnit("Asus Maximus", 350, HardwareUnit.UnitTypes.MotherBoard);
        HardwareUnit newRam = new HardwareUnit("ADATA 16GB", 85, HardwareUnit.UnitTypes.Memory);
        HardwareUnit newGpu = new HardwareUnit("GTX 1080", 855.99, HardwareUnit.UnitTypes.GraphicsCard);

        HardwareUnit otherRam = new HardwareUnit("Kingston 32Gb", 75, HardwareUnit.UnitTypes.Memory);
        HardwareUnit otherCpu = new ARM_CPU("AMD", 88, 6);
        HardwareUnit otherMbu = new HardwareUnit("MSI", 283.99, HardwareUnit.UnitTypes.MotherBoard);
        HardwareUnit otherGpu = new HardwareUnit("Radeon Vega 64", 755.35, HardwareUnit.UnitTypes.GraphicsCard);

        PC myPc = new PC("ROG");

        myPc.addNewComponent(newRam);
        myPc.addNewComponent(newMbu);
        myPc.addNewComponent(newCpu);
        myPc.addNewComponent(newGpu);
        //myPc.addNewComponent(otherRam);
        //myPc.addNewComponent(otherCpu);
        //myPc.addNewComponent(otherMbu);
        //myPc.addNewComponent(otherGpu);


        myPc.printSet();




    }
}
