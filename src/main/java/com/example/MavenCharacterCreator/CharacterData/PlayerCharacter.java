package com.example.MavenCharacterCreator.CharacterData;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "character")
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private String characterName;

    @Column(name = "pronoun_one")
    private String they;
    
    @Column(name = "pronoun_two")
    private String them;

    @Column(name = "character_race")
    private String playerRace;    

    @Column(name = "character_class")
    private String pClass;
}
