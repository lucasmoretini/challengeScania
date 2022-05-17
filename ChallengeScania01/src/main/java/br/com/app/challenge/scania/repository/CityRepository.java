package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
