package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Armor;

public class RangerArmor implements Armor {
    private String name;
    private int defense;
    private String type;

    public RangerArmor() {
        this.name = "Leather Armor";
        this.defense = 45;
        this.type = "Light";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDefense() { return defense; }

    @Override
    public String getArmorType() { return type; }

    @Override
    public String getArmorInfo() {
        return name + " | Type: " + type + " | DEF: " + defense + " | Moves like wind";
    }
}
