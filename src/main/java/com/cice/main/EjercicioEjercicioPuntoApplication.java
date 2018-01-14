package com.cice.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cice.negocio.Gestora;

@SpringBootApplication
/**
 * 
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 */
public class EjercicioEjercicioPuntoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioEjercicioPuntoApplication.class, args);
		Gestora gestora = new Gestora();
		
		gestora.showMenu();
	}
}
