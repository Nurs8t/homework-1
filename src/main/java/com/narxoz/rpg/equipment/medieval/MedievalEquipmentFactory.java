package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.*;

public class MedievalEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new MedievalWeapon();
    }

    @Override
    public Armor createArmor() {
        return new MedievalArmor();
    }

    @Override
    public EquipmentSet createSet() {
        return new EquipmentSet(EquipmentTheme.MEDIEVAL, createWeapon(), createArmor());
    }

    @Override
    public EquipmentTheme getTheme() {
        return EquipmentTheme.MEDIEVAL;
    }
}
