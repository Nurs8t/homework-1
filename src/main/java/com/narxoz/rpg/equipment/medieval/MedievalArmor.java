package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public class MedievalArmor implements Armor {
    private String name;
    private int defense;
    private String type;


    public MedievalArmor() {
        this.name = "Knight's Plate";
        this.defense = 80;
        this.type = "Heavy";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorType() {
        return "";
    }

    @Override
    public String getArmorInfo() {
        return "";
    }
}