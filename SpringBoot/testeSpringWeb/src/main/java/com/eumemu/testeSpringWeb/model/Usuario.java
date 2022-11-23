package com.eumemu.testeSpringWeb.model;

public class Usuario {
	private Integer id;
	private String login;
	private String password;
	
	public Usuario(){};
	public Usuario(String login, String passowrd) {
		this.login=login;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", password=" + password + "]";
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}
}
