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
@Table(name = "player_character")
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   
    private int pCharID;

    @Column(name = "_character_name")
    private String pcharName;

    @Column(name = "pronoun_one")
    private String they;
    
    @Column(name = "pronoun_two")
    private String them;

    @Column(name = "character_race")
    private String playerRace;    

    @Column(name = "character_class")
    private String pClass;

    public int getpCharID() {
        return pCharID;
    }

    public void setpCharID(int pCharID) {
        this.pCharID = pCharID;
    }

    public String getPcharName() {
        return pcharName;
    }

    public void setPcharName(String pcharName) {
        this.pcharName = pcharName;
    }

    public String getThey() {
        return they;
    }

    public void setThey(String they) {
        this.they = they;
    }

    public String getThem() {
        return them;
    }

    public void setThem(String them) {
        this.them = them;
    }

    public String getPlayerRace() {
        return playerRace;
    }

    public void setPlayerRace(String playerRace) {
        this.playerRace = playerRace;
    }

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }
   
    
}
