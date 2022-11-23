package com.eumemu.testeSpringWeb.Handler;

public class BusinessExeception extends RuntimeException{

    public BusinessExeception(String mensagem) {
        super(mensagem);
    }
    public BusinessExeception(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
