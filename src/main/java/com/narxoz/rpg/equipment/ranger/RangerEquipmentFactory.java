package com.narxoz.rpg.equipment.ranger;

import com.narxoz.rpg.equipment.*;

public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new RangerWeapon();
    }

    @Override
    public Armor createArmor() {
        return new RangerArmor();
    }

    @Override
    public EquipmentSet createSet() {
        return new EquipmentSet(EquipmentTheme.RANGER, createWeapon(), createArmor());
    }

    @Override
    public EquipmentTheme getTheme() {
        return EquipmentTheme.RANGER;
    }
}