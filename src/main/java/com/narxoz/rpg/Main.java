package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.medieval.*;
import com.narxoz.rpg.equipment.magic.*;
import com.narxoz.rpg.equipment.ranger.*;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG SYSTEM ===\n");

        CharacterFactory wf = new WarriorFactory();
        CharacterFactory mf = new MageFactory();
        CharacterFactory af = new ArcherFactory();

        Character w = wf.createCharacter("Arthur");
        Character m = mf.createCharacter("Merlin");
        Character a = af.createCharacter("Legolas");

        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();

        EquipmentSet ws = medieval.createSet();
        EquipmentSet ms = magic.createSet();
        EquipmentSet rs = ranger.createSet();

        w.equipWeapon(ws.getWeapon());
        w.equipArmor(ws.getArmor());
        m.equipWeapon(ms.getWeapon());
        m.equipArmor(ms.getArmor());
        a.equipWeapon(rs.getWeapon());
        a.equipArmor(rs.getArmor());

        w.displayStats();
        w.displayEquipment();
        m.displayStats();
        m.displayEquipment();
        a.displayStats();
        a.displayEquipment();

        System.out.println("\n✓ Factory Method: 3 characters");
        System.out.println("✓ Abstract Factory: 3 sets");
        System.out.println("✓ ENUM: CharacterType, EquipmentTheme");

        MagicStaff staff = new MagicStaff("Archmage Staff", 40);
        staff.displayInfo();
        System.out.println();

        System.out.println("✓ Factory Method: 3 characters");
        System.out.println("✓ Abstract Factory: 3 sets");
        System.out.println("✓ MagicStaff: " + staff.getName() + " (" + staff.getDamage() + " dmg)");

        IronSword ironSword = new IronSword();
        ironSword.displayInfo();
        System.out.println("Weapon name: " + ironSword.getName());
        System.out.println("Weapon type: " + ironSword.getWeaponType());
        System.out.println();

        System.out.println("✓ Factory Method: 3 characters");
        System.out.println("✓ Abstract Factory: 3 sets");
        System.out.println("✓ Iron Sword: " + ironSword.getDamage() + " dmg");


        RangerLeatherArmor armor = new RangerLeatherArmor("Forest Keeper", 45);
        armor.displayInfo();
        System.out.println("Armor name: " + armor.getName());
        System.out.println("Defense: " + armor.getDefense());
        System.out.println("Armor type: " + armor.getArmorType());
        System.out.println();

        System.out.println("✓ Factory Method: 3 characters");
        System.out.println("✓ Abstract Factory: 3 sets");
        System.out.println("✓ Ranger Armor: " + armor.getName() + " (" + armor.getDefense() + " def)");

    }
}