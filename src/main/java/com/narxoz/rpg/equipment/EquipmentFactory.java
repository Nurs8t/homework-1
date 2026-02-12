package com.narxoz.rpg.equipment;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    EquipmentSet createSet();
    EquipmentTheme getTheme();
}
