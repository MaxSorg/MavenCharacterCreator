package com.example.MavenCharacterCreator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.MavenCharacterCreator.CharacterData.Race;



class Race_test {   
    @ParameterizedTest
    @CsvSource ({
        "HUMAN, 0, 0, 0, 0, 0, 0",
        "HALF_ELF, 0, 0, 0, 0, 0, 0",
        "ELF, 0, 2, -2, 0, 0, 0",
        "DWARF, 0, 0, 2, 0, 0, -2",
        "HALFLING, -2, 2, 0, 0, 0, 0",
    })
    void testRaceAttributes(Race race, int str, int dex, int con, int intel, int wis, int cha) {
        assertEquals(str, race.getStr());
        assertEquals(dex, race.getDex());
        assertEquals(con, race.getCon());
        assertEquals(intel, race.getIntel());
        assertEquals(wis, race.getWis());
        assertEquals(cha, race.getCha());
        race.printRaceFull();
    }   

    @ParameterizedTest
    @CsvSource ({
        "HUMAN, Humans are normal",
        "HALF_ELF, Half elves are cool",
        "ELF, Elves live long",
        "DWARF, Dwarves are grumpy",
        "HALFLING, Halflings are lucky",
    })
    void testRaceDescriptions(Race race, String desc) {        
            assertEquals(desc, race.printDescription());        
    }
}
