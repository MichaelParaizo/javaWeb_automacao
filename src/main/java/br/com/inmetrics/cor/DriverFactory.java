package br.com.inmetrics.cor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static WebDriver driver;

	public static final String url = "http://www.inmrobo.tk/accounts/login/";

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
