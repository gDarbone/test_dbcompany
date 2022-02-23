package TelaPrincipal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import core.DSL;

public class TelaPrincipalPage {

	private DSL dsl;

	public TelaPrincipalPage(WebDriver navegador) {
		dsl = new DSL(navegador);
	}

	public void clicarLupaPesquisa() {
		dsl.clicar(By.xpath("//button[@id='search-open']"));
	}

	public void preencherCampoPesquisa(String mensagem) {
		dsl.digitar(By.xpath("//div[@class='desktop-search']//form//label//input[@name='s']"), mensagem);
	}

	public void clicarPesquisar() {
		dsl.clicar(By.xpath("//div[@class='desktop-search']//form//input[@value='Pesquisar']"));
	}

}
