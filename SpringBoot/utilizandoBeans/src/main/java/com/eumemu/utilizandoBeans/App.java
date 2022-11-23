package com.eumemu.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Livro livro = factory.getBean(Livro.class);
		livro.setNome("Harry Potter");
		livro.setCodigo("ab33211aa");
		Autor autor = factory.getBean(Autor.class);
		autor.setNomeAutor("J.K Rowling");
		livro.exibir();
		
		((AbstractApplicationContext) factory).close();
	}

}
