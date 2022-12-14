package Pruebas;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba_10 {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));

	}

	@Test
	public void Test() {
		driver.get("https://www.plex.tv/");
		driver.findElement(
				By.cssSelector("#plex-global-nav > header > div.fresnel-lessThan-md.nav.menuContainer > button"))
				.click();
		driver.findElement(By.cssSelector("#mobile-free-movies-tv-2 > span")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(
				"#__next > div.App_app__fO6n7 > main > section:nth-child(2) > div > div > div:nth-child(72) > div > a"))
				.click();

	}

	@After
	public void termina() {
		// driver.quit();
	}
}
