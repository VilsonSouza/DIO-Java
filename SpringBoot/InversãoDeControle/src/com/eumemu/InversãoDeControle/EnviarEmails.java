package com.eumemu.InversãoDeControle;

public class EnviarEmails {
	public EnviarEmails(String tipo, String endereco, String senha) {
		
	}
	public static EnviarEmails obterDados() {
		return new EnviarEmails("stmp", "contato@email.com", "senha");
	}
	public void retornar(String mensagem) {
		System.out.println("Email Enviado");
	}
}
