package TelaPrincipal;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.DSL;

public class PesquisaVerification {
	
	private WebDriver driver;
	DSL dsl;
	public PesquisaVerification(WebDriver driver) {
		dsl = new DSL(driver);
		this.driver = driver;
	}

	public void verificarPesquisaComSucesso() {
		String textoPesquisa = dsl.pegarTexto(By.xpath("//h1[@class='archive-title']"));
		Assert.assertTrue(textoPesquisa.contains("Resultados da busca"));
	}

	public void verificarPesquisaSemComSucesso() {
		String textoPesquisa = dsl.pegarTexto(By.xpath("//h1[@class='entry-title']"));
		Assert.assertTrue(textoPesquisa.contains("Nenhum resultado"));
	}

	

}
