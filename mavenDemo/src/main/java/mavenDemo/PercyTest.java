package mavenDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.percy.*;
import io.percy.selenium.*;

public class PercyTest {

	public static void main(String[] args) {
	
		System.setProperty("web.driver.chromedrive", "C:\\chromedriver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		Percy pr = new Percy(dr);
		dr.get("https://demo.axis360qa.baker-taylor.com");
		pr.snapshot("home page");

	}

}
