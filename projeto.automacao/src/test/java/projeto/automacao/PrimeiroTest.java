package projeto.automacao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiroTest {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void e2etreinamentos() {
		driver.get("http://www.e2etreinamentos.com.br");
		String titulo = driver.getTitle();
		assertEquals("E2E Treinamentos", titulo);
	}

	@Test
	public void google() {
		driver.get("http://www.google.com.br");
		String titulo = driver.getTitle();
		assertEquals("Google", titulo);
	}

	@Test
	public void Amazon() {
		driver.get("http://www.Amazon.com.br");
		String titulo = driver.getTitle();
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);
	}
}
