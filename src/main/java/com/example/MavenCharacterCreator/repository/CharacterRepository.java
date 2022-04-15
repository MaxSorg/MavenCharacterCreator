package com.example.MavenCharacterCreator.repository;

import com.example.MavenCharacterCreator.CharacterData.PlayerCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<PlayerCharacter, Long> {
    // all crud database methods
}