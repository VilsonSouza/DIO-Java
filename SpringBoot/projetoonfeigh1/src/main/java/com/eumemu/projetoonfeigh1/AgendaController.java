package com.eumemu.projetoonfeigh1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Contato")
public class AgendaController {
	
	@GetMapping
	public Contato retornaContato() {
		return Contato.builder().id(1L).nome("cleber").telefone("9999-9999").build();
	}
	
}
