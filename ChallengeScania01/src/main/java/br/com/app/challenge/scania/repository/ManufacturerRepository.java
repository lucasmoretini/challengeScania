package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {

}
