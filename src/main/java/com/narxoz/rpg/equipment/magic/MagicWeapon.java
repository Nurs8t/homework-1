package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class MagicWeapon implements Weapon {
    private String name;
    private int damage;
    private String type;

    public MagicWeapon() {
        this.name = "Archmage Staff";
        this.damage = 40;
        this.type = "Staff";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getWeaponType() { return type; }

    @Override
    public String getWeaponInfo() {
        return name + " | Type: " + type + " | DMG: " + damage + " | Channel arcane energy";
    }
}