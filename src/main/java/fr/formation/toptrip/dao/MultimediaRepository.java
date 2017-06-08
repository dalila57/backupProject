package fr.formation.toptrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.toptrip.entity.Multimedia;

public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {

}
