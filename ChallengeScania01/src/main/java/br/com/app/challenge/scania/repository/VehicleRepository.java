package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
