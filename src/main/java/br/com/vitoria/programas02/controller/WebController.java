package br.com.vitoria.programas02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

	@GetMapping("/tela1/{var}")
	public String t(Model model, @PathVariable(value="var") String valorRecebido) {
		
		model.addAttribute("p1", valorRecebido);
		
		return "arquivo_base_html_01";
	}
}
