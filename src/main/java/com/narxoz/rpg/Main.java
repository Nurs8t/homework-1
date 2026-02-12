package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.*;
import com.narxoz.rpg.equipment.medieval.*;
import com.narxoz.rpg.equipment.magic.*;
import com.narxoz.rpg.equipment.ranger.*;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("Arthur");
        Character mage = mageFactory.createCharacter("Merlin");
        Character archer = archerFactory.createCharacter("Legolas");

        System.out.println("✓ Warrior created: " + warrior.getName());
        System.out.println("✓ Mage created: " + mage.getName());
        System.out.println("✓ Archer created: " + archer.getName());
        System.out.println();
    }
}