package fr.formation.toptrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.toptrip.entity.Vocabulary;

public interface VocabularyRepository extends JpaRepository<Vocabulary, Integer>{

}
