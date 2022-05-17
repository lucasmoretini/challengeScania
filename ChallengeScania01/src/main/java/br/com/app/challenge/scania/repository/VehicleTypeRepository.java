package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long> {

}
