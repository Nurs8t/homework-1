package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Mage implements Character {
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 150;
        this.strength = 15;
        this.intelligence = 90;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        displayEquipment();
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL! Deals massive magic damage!");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equipped " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equipped " + armor.getName());
    }

    @Override
    public void displayEquipment() {
        if (equippedWeapon != null) {
            System.out.println("Weapon: " + equippedWeapon.getName() + " (Damage: " + equippedWeapon.getDamage() + ")");
        }
        if (equippedArmor != null) {
            System.out.println("Armor: " + equippedArmor.getName() + " (Defense: " + equippedArmor.getDefense() + ")");
        }
        System.out.println();
    }
}