package br.com.vitoria.programas02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/")
	public String inicio() {
		return "Esse é o inicio";
	}
	
	@GetMapping("/oi")
	public String nomeDaFuncao() {
		return "Legal vc chegou na sua API!";
	}
	
	@GetMapping("/t2")
	public String t() {
		return "Aki é o T2!";
	}
}
