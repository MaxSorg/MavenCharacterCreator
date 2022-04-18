package com.example.MavenCharacterCreator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.MavenCharacterCreator.CharacterData.PlayerClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PlayerClass_test {
    @ParameterizedTest
    @CsvSource ({
        "BARBARIAN, 12, Light, Berserker Rage, Wildling",
        "FIGHTER, 10, Heavy & Shields, Adrenaline, Second Wind",
        "PALADIN, 10, Heavy & Shields, Smite, Lay on Hands",
        "CLERIC, 8, Heavy & Shields, Turn Undead, Invoke Divinity",
        "DRUID, 8, Medium & Shields, Animal Companion, Formshift",
        "RANGER, 8, Medium, Tactical Mastery, Heart Piercer",
        "ROGUE, 6, Light, Backstab, Evasion",    
        "WIZARD, 4, None, Presence of Mind, Mirror Image",
    })
    void testPlayerClassEnum (PlayerClass job, int hitPoints, String armorProf, 
    String abilityOne, String abilityTwo){
        assertEquals(hitPoints, job.getHitPoints());
        assertEquals(armorProf, job.getArmorProf());
        assertEquals(abilityOne, job.getAbilityOne());
        assertEquals(abilityTwo, job.getAbilityTwo());
    }

    @Test
    void printAbilityDescriptions() {
        for (PlayerClass pClass : PlayerClass.values()) {
            System.out.print(pClass + " abilities\n\n" + pClass.getAbilityOne() + ":\n" +
            pClass.abilityOneDescription() + "\n\n" + 
            pClass.getAbilityTwo() + ":\n" + pClass.abilityTwoDescription() + "\n\n");            
        }
    }
}
