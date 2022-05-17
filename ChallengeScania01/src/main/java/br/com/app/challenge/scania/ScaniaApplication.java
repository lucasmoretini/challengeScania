package br.com.app.challenge.scania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({ "br.com.fiap.appprodutoteste.produto.controllers, br.com.fiap.appprodutoteste.produto.config" })
public class ScaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaniaApplication.class, args);
	}

}
