package fr.formation.toptrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.toptrip.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
