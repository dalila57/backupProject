package fr.formation.toptrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.toptrip.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
