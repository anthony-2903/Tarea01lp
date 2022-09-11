package upeu.edu.pe.trabajo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

	
	@GetMapping("/")
	
	public String index() {
		return "Bienvenidos a tarea 01 de API REST";
	}
}
