package fr.formation.toptrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.toptrip.entity.Documents;

public interface DocumentsRepository extends JpaRepository<Documents, Integer>{

}
