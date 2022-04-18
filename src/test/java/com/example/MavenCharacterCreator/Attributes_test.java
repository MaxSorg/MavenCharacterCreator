package com.example.MavenCharacterCreator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.MavenCharacterCreator.CharacterData.Attributes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Attributes_test {
    private Attributes attTest = new Attributes();     
    void checkStrBonus(int rank, int bonus) {
        attTest.str = rank;        
        assertEquals(bonus, attTest.calcStrBonus());
    }
    void checkDexBonus(int rank, int bonus) {
        attTest.dex = rank;
        assertEquals(bonus, attTest.calcDexBonus());
    }
    void checkConBonus(int rank, int bonus) {
        attTest.con = rank; 
        assertEquals(bonus, attTest.calcConBonus());
    }
    void checkIntelBonus(int rank, int bonus) {
        attTest.intel = rank;
        assertEquals(bonus, attTest.calcIntelBonus());
    }
    void checkWisBonus(int rank, int bonus){
        attTest.wis = rank;
        assertEquals(bonus, attTest.calcWisBonus());
    }    
    void checkChaBonus(int rank, int bonus){
        attTest.cha = rank;
        assertEquals(bonus, attTest.calcChaBonus());
    }    
    @ParameterizedTest
    @CsvSource({
        "20 , 5",
        "19 , 4",
        "18 , 4",
        "17 , 3",
        "16 , 3",
        "15 , 2",
        "9 , -1",
        "8 , -1",
        "7 , -2",
        "6 , -2",
    })
    void attTestParamterized(int rank, int bonus){
        checkStrBonus(rank, bonus);
        checkDexBonus(rank, bonus);
        checkConBonus(rank, bonus);
        checkIntelBonus(rank, bonus);
        checkWisBonus(rank, bonus);
        checkChaBonus(rank, bonus);
    }
}
 