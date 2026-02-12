package com.narxoz.rpg.equipment;

public class EquipmentSet {
    private EquipmentTheme theme;
    private Weapon weapon;
    private Armor armor;

    public EquipmentSet(EquipmentTheme theme, Weapon weapon, Armor armor) {
        this.theme = theme;
        this.weapon = weapon;
        this.armor = armor;
    }

    public EquipmentTheme getTheme() {
        return theme;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void displaySetInfo() {
        System.out.println("=== " + theme + " SET ===");
        System.out.println("Weapon: " + weapon.getName() + " (DMG: " + weapon.getDamage() + ")");
        System.out.println("Armor: " + armor.getName() + " (DEF: " + armor.getDefense() + ")");
        System.out.println();
    }
}