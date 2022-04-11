package com.example.MavenCharacterCreator;

import com.example.MavenCharacterCreator.CharacterData.PlayerCharacter;
import com.example.MavenCharacterCreator.repository.CharacterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenCharacterCreatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MavenCharacterCreatorApplication.class, args);
	}
	@Autowired
	private CharacterRepository characterRepository;

	@Override
	public void run(String... args) throws Exception {		
		PlayerCharacter character = new PlayerCharacter();
		character.setpCharID(1);
		character.setPcharName("Lynxes");
		character.setThey("she");		
		character.setThem("her");
		character.setpClass("Ranger");
		character.setPlayerRace("Half-elf");
		characterRepository.save(character);		
	}

}
