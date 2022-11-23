package com.eumemu.SpringPropertiesValues;


import org.springframework.boot.CommandLineRunner;

public class SistemaMensagem implements CommandLineRunner {
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome()
                + "\nE-mail:" + remetente.getEmail()
                + "\nCom telefones para contato: " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }
}
