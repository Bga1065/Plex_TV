package Pruebas;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba_6 {
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
	}
	@Test
	public void Test() {
		driver.get("https://app.plex.tv/desktop/?_gl=1*1h5flp5*_ga*MTcwMzIyMjkyOS4xNjY1NDI1NjMy*_ga_G6FQWNSENB*MTY3MDc5OTQwNC4xNS4xLjE2NzA3OTk0MDQuMC4wLjA.#!/");
        driver.findElement(By.xpath("//*[@id=\"plex\"]/div[3]/div/div[1]/div/div/div/div[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"plex\"]/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/a")).click();
			
	}	
	
	@After
	public void termina() {
		//driver.quit();
	}
}

