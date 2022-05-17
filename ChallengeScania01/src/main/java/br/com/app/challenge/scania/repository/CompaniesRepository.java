package br.com.app.challenge.scania.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.app.challenge.scania.model.Companies;

public interface CompaniesRepository extends JpaRepository<Companies, Long> {

}
