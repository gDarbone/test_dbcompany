package testExecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import TelaPrincipal.PesquisaVerification;
import TelaPrincipal.TelaPrincipalPage;
import core.SystemConfigs;

public class ExecutionTest {
	
	private SystemConfigs config;
	private TelaPrincipalPage telaPage;
	private PesquisaVerification telaVerif;

	
	@Before
	public void before() {
		config = new SystemConfigs();
		telaPage = new TelaPrincipalPage(getDriver());
		telaVerif = new PesquisaVerification(getDriver());
	}
	
	@After
	public void after() {
		getDriver().quit();
	}
	
	
	@Test
	public void realizarPesquisaComSucesso() {
		telaPage.clicarLupaPesquisa();
		telaPage.preencherCampoPesquisa("test");
		telaPage.clicarPesquisar();
		telaVerif.verificarPesquisaComSucesso();
	}
	
	@Test
	public void realizarPesquisaSemSucesso() {
		telaPage.clicarLupaPesquisa();
		telaPage.preencherCampoPesquisa("123123123");
		telaPage.clicarPesquisar();
		telaVerif.verificarPesquisaSemComSucesso();
	}
	
	
	
	public WebDriver getDriver() {
		return this.config.retornarDriver();
	}
	
	
	
	
	
}
