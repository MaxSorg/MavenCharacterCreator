package com.example.MavenCharacterCreator.Controller;

import com.example.MavenCharacterCreator.CharacterData.Race;
import com.example.MavenCharacterCreator.Exception.ResourceNotFoundException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/races")
public class RaceController {

    

    @GetMapping
    public EnumMap<Race, int[]> getAllRaces() { 
        EnumMap<Race, int[]> raceMap = new EnumMap<Race, int[]>(Race.class);     
        for ( Race race : Race.values()) {
            int[] bonus = race.RaceBonusesFull();
            raceMap.put(race, bonus);
        }
        return raceMap;
    }
    
}
