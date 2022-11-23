package com.eumemu.springboottest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.eumemu.controller.TestController;

public class TestUnitController {
	
	@Test
	public void testUnit() {
		TestController controller = new TestController();
		
		String resultado = controller.saudacao("Cleiton");
		
		assertEquals("Bem vindo, Cleiton", resultado);
	}
}
