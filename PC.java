package com.tom;

import java.util.*;

public class PC extends HardwareUnit {

    protected Set<HardwareUnit> components;

    public PC(String name) {
        super(name,0, null);
        this.components = new HashSet<>();
    }

    public void addNewComponent(HardwareUnit item) {
        if (!faulty()) {
            if (components.size() < 4 && !isExist(item)) {
                components.add(item);
                this.price += item.price;
                System.out.println("A new " + item.types + ": " + item.name + " succesfully added to " + this.name);
            } else {
                overflowMessage(item);
            }
        } else {
            errorMessage(item);
            addNewComponent(item);
        }

    }

    @Override
    public boolean faulty() {
        return super.faulty();
    }

    private void overflowMessage(HardwareUnit item) {
        System.out.println(this.name + " cannot accept more " + item.types + " unit.");
    }

    private void errorMessage(HardwareUnit item) {
        System.out.println(item + " is broken. " + "Replacement will be added to " + this.name);
    }


    public void printSet() {
        System.out.println("==========================");
        System.out.println(this.name + " components: \n");
        for (HardwareUnit comps : components) {
            System.out.println(comps);

        }
        System.out.println("\nTotal value: $" + this.price);
    }

    public boolean isExist(HardwareUnit type) {
        boolean flag = false;
        if (components != null) {
            for (HardwareUnit t : components) {
                if (t.types == type.types) {
                    flag = true;
                }
            }
        }
        return flag;
    }




}
