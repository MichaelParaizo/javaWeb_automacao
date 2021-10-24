package br.com.inmetrics.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.inmetrics.cor.DriverFactory;

public class FuncionarioListPage {

	private WebElement LinkNovoFuncionario = DriverFactory.getDriver()
			.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a"));

	public String getLinkNovoFuncionario() {
		return LinkNovoFuncionario.getText();
	}
}
