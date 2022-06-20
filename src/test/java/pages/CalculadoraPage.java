package pages;

import io.appium.java_client.MobileBy;
import support.BasePage;

public class CalculadoraPage extends BasePage {
	
	public void clicarPonto() {
		clicarPorTexto(".");
	}
	
	public void clicarNum0() {
		clicarPorTexto("0");
	}
	
	public void clicarNum1() {
		clicarPorTexto("1");
	}
	
	public void clicarNum2() {
		clicarPorTexto("2");
	}
	
	public void clicarNum3() {
		clicarPorTexto("3");
	}
	
	public void clicarNum4() {
		clicarPorTexto("4");
	}
	
	public void clicarNum5() {
		clicarPorTexto("5");
	}
	
	public void clicarNum6() {
		clicarPorTexto("6");
	}
	
	public void clicarNum7() {
		clicarPorTexto("7");
	}
	
	public void clicarNum8() {
		clicarPorTexto("8");
	}
	
	public void clicarNum9() {
		clicarPorTexto("9");
	}
	
	public void clicarMaisMenos() {
		clicar(MobileBy.AccessibilityId("Plus/minus"));
	}
		
	public void clicarSoma() {
		clicar(MobileBy.AccessibilityId("Plus"));
	}
	
	public void clicarSubtracao() {
		clicar(MobileBy.AccessibilityId("Minus"));
	}
	
	public void clicarMultiplicacao() {
		clicar(MobileBy.AccessibilityId("Multiplication"));
	}
	
	public void clicarDivisão() {
		clicar(MobileBy.AccessibilityId("Division"));
	}
	
	public void clicarPorcentagem() {
		clicar(MobileBy.AccessibilityId("Percentage"));
	}
	
	public void clicarParenteses() {
		clicar(MobileBy.AccessibilityId("Brackets"));
	}
	
	public void clicarLimpar() {
		clicar(MobileBy.AccessibilityId("Clear"));
	}
	
	public void clicarHistorico() {
		clicar(MobileBy.AccessibilityId("History"));
	}
	
	public void clicarConversor() {
		clicar(MobileBy.AccessibilityId("Unit converter"));
	}
	
	public void clicarRotacao() {
		clicar(MobileBy.AccessibilityId("Rotate screen"));
	}
	
	public void clicarBackSpace() {
		clicar(MobileBy.AccessibilityId("Backspace"));
	}
	
	public void clicarIgual() {
		clicar(MobileBy.AccessibilityId("Equal"));
	}

}
