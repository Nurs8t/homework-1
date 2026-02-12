package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.Weapon;

public class RangerWeapon implements Weapon {
    private String name;
    private int damage;
    private String type;

    public RangerWeapon() {
        this.name = "Elven Longbow";
        this.damage = 45;
        this.type = "Bow";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getWeaponType() { return type; }

    @Override
    public String getWeaponInfo() {
        return name + " | Type: " + type + " | DMG: " + damage + " | Silent and deadly";
    }
}