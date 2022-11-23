package com.eumemu.ScopesSingletonPrototype;
import com.eumemu.ScopesSingletonPrototype.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopesSingletonPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopesSingletonPrototypeApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}
}
