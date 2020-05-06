package support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class BasePage {
	
	public String obterTexto(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	
	public void clicar(By by) {
		DriverFactory.getDriver().findElement(by).click();
	}
	
	public void clicarPorTexto(String texto) {
		clicar(By.xpath("//*[@text='" + texto +"']"));
	}
	
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = DriverFactory.getDriver().findElements(By.xpath("//*[@text='"+ texto +"']"));
		return elementos.size() > 0;
	}
	
	public void aguardarElementoPorTexto(String texto) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='"+ texto +"']")));
	}
	
}