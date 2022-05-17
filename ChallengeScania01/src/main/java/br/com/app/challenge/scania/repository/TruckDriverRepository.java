package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.TruckDriver;

public interface TruckDriverRepository extends JpaRepository<TruckDriver, Long> {

}
