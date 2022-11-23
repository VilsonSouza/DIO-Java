package com.eumemu.testeSpringWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eumemu.testeSpringWeb.model.Usuario;
import com.eumemu.testeSpringWeb.repository.UsuarioRepository;

@RestController
public class UserController {
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/users")
	public List<Usuario>getUsers(){
		return repository.findAll();
	}
	@GetMapping("/users/{username}")
	public Usuario findOne(@PathVariable String username) {
		return repository.findByUsername(username);
	}
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	@PostMapping()
	public void postUser(@RequestBody Usuario usuario){
		repository.save(usuario);
	}
	@PutMapping
	public void putUser(@RequestBody Usuario usuario){
		repository.save(usuario);
	}


}
