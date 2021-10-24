package br.com.inmetrics.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)	
@CucumberOptions(
	strict = false, // Com a opcao de false qualquer step nao definido ira falhar e a visar ao step para implementar 
	dryRun = false, // Valida mapeamento e executa todos os testes com a opção false
	snippets = SnippetType.CAMELCASE,
	monochrome = true,
	plugin = {"pretty", "html:target/report-html"},
	features = "src/main/resources",
	tags = {"@positivo"},
	glue = {"br.com.inmetrics.steps"}
	
		)


public class Runner {

}
