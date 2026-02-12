package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Armor;

public class MagicArmor implements Armor {
    private String name;
    private int defense;
    private String type;

    public MagicArmor() {
        this.name = "Wizard Robe";
        this.defense = 30;
        this.type = "Cloth";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorType() { return type; }

    @Override
    public String getArmorInfo() {
        return name + " | Type: " + type + " | DEF: " + defense + " | Infused with magic";
    }
}