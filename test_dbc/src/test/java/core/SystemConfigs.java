package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SystemConfigs {
	
	private static final String URL = "https://blogdoagi.com.br/";
	private WebDriver driver;
	
	public SystemConfigs() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	
	public WebDriver retornarDriver() {
		return this.driver;
	}
	 

}
