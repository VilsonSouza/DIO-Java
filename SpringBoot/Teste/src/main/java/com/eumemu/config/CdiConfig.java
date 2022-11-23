package com.eumemu.config;
import javax.annotation.*;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

public class CdiConfig {
	
	@Inject
	private CdiTeste cdiTeste;
	
	@PostConstruct
	public void init() {
		cdiTeste.executaTeste();
	}
}
