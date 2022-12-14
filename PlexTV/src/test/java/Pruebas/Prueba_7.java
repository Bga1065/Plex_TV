package Pruebas;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Prueba_7{
	
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
	}
	@Test
	public void Test() {
		driver.get("https://www.plex.tv/");
		driver.findElement(By.cssSelector("#plex-global-nav > header > div.fresnel-lessThan-md.nav.menuContainer > button")).click();
		driver.findElement(By.cssSelector("#mobile-get-the-app-3 > span")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#plex-app > div.grid-x.modal-download.plex-pht-modal > div.large-7.cell.text-left.downloads-panel.downloads-panel-right.plex-form-downloads > div.download-tray.plex-pht-release > a.button.plex-downloads-releasesbutton.releasesbutton-build")).click();
			
	}	
	@After
	public void termina() {
		//driver.quit();
	}
}
