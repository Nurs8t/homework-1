package com.narxoz.rpg.equipment.magic;

import com.narxoz.rpg.equipment.*;

public class MagicEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new MagicWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MagicArmor();
    }

    @Override
    public EquipmentSet createSet() {
        return new EquipmentSet(EquipmentTheme.MAGIC, createWeapon(), createArmor());
    }

    @Override
    public EquipmentTheme getTheme() {
        return EquipmentTheme.MAGIC;
    }
}
