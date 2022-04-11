package com.example.MavenCharacterCreator.Controller;

import com.example.MavenCharacterCreator.repository.CharacterRepository;
import com.example.MavenCharacterCreator.CharacterData.PlayerCharacter;
import com.example.MavenCharacterCreator.Exception.ResourceNotFoundException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {
    
    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public List<PlayerCharacter> getAllCharacters() {
        return characterRepository.findAll();
    }

    @PostMapping
    public PlayerCharacter createCharacter(@RequestBody PlayerCharacter character) {
        return characterRepository.save(character);
    }

    @GetMapping("{pcharName}")
    public ResponseEntity<PlayerCharacter> getCharacterByName(@PathVariable String pcharName) {
        PlayerCharacter character = characterRepository.findById (pcharName)
            .orElseThrow(() -> new ResourceNotFoundException("Character by: " + pcharName + " does not exist"));
        return ResponseEntity.ok(character);
    }
}
