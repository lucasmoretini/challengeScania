package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.State;

public interface StateRepository extends JpaRepository<State, Long> {

}
