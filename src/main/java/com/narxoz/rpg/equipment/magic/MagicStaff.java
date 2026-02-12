package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.Weapon;

public class MagicStaff implements Weapon{
    private String name;
    private int damage;
    private String weaponType;


    public MagicStaff(String name, int damage) {
        this.name = name;
        this.damage = damage;
        this.weaponType = "Staff";
    }

    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Magic Staff (Magic) - A mystical staff that uses magical power";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }


}