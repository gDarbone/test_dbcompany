package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL {
	private WebDriver driver;

	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void clicar(By by) {
		driver.findElement(by).click();
	}

	public void digitar(By by, String text) {
		driver.findElement(by).sendKeys(text);
	}
	
	public String pegarTexto(By by) {
		return driver.findElement(by).getText();
	}
}
