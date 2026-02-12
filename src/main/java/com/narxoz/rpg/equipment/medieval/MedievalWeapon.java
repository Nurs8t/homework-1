package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Weapon;

public class MedievalWeapon implements Weapon {
    private String name;
    private int damage;
    private String type;

    public MedievalWeapon() {
        this.name = "Dragon Slayer";
        this.damage = 50;
        this.type = "Sword";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponType() {
        return "";
    }

    @Override
    public String getWeaponInfo() {
        return "";
    }
}