package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public  class RangerLeatherArmor implements Armor {
    private String name;
    private int protection;
    private String armorType;


    public RangerLeatherArmor(String name, int protection) {
        this.name = name;
        this.protection = protection;
        this.armorType = "Light Armor";
    }


    public String getArmorInfo() {
        return "Magic Staff (Magic) - A mystical staff that uses magical power";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Protection: " + protection);
        System.out.println("Type: " + armorType);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefense() {
        return 0;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }
}