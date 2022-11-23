package com.eumemu.testeSpringWeb.Handler;

public class CampoRequeridoException extends BusinessExeception{
    public CampoRequeridoException(String campo){
        super("O campo %s é obrigatorio",campo);
    }
}
