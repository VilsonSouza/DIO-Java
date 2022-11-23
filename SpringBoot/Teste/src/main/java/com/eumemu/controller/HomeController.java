package com.eumemu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eumemu.service.UserService;



@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home(Model model) {

		userService.buscaDadosBanco();
		userService.deletaDados();
		userService.buscaUsuarioPorId(1);

//		model.addAttribute("mensagem", "Hello Word");

		return "home";
	}
	public static void main(String[] args) {
		HomeController home= new HomeController();
		
		String retorno = home.home(null);
		
		System.out.println(retorno);
	}

}
