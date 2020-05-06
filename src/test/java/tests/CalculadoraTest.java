package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.appium.java_client.MobileBy;
import pages.CalculadoraPage;
import support.BaseTest;

public class CalculadoraTest extends BaseTest {
	
	private CalculadoraPage page = new CalculadoraPage();
	
	@Test
	public void realizarCalculo() {
		page.clicarNum5();
		page.clicarNum0();
		page.clicarMultiplicacao();
		page.clicarNum5();
		page.clicarNum0();
		page.clicarIgual();
		assertEquals("2,500", page.obterTexto(MobileBy.AccessibilityId("Calculator input field")));
		
		page.clicarSoma();
		page.clicarNum3();
		page.clicarNum0();
		page.clicarNum0();
		page.clicarIgual();
		assertEquals("2,800", page.obterTexto(MobileBy.AccessibilityId("Calculator input field")));
		
		page.clicarSubtracao();
		page.clicarNum2();
		page.clicarNum6();
		page.clicarIgual();
		assertTrue(page.existeElementoPorTexto("2,774"));
		
		page.clicarDivisão();
		page.clicarNum8();
		page.clicarIgual();
		assertEquals("346.75", page.obterTexto(MobileBy.AccessibilityId("Calculator input field")));
		
		page.clicarLimpar();
		assertTrue(page.existeElementoPorTexto(""));
	}
}
