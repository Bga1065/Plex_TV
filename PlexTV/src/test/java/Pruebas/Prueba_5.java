package Pruebas;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Prueba_5{
	
	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		
	}
	@Test
	public void Test() {
		driver.get("https://watch.plex.tv/movies-and-shows/category/comedy");		
		driver.findElement(By.cssSelector("#__next > div.App_app__fO6n7 > header > div > div.p8jtya1i.p8jtya1j.p8jtya1k.p8jtya11 > nav > button > span > svg")).click();
		driver.findElement(By.cssSelector("#radix-\\:Rckm\\: > div > div.p8jtya6m.p8jtya9q.p8jtya7q.p8jtya8m.oywxfn0.oywxfn2.oywxfn5.oywxfn7 > span > div > div.p8jtya12.p8jtya9.p8jtya4e.p8jtya1q.p8jtya1n.p8jtya2i.p8jtya2m.p8jtya32.p8jtya3m > button.nckz222.p8jtya16.p8jtya32.p8jtya3m.p8jtyam.nckz22d.j6xja40.p8jtyaf6.nckz228")).click();
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#radix-\\:rc\\: > div > div > div > span > div > div > div > div.p8jtya12.p8jtya9.p8jtya4a.p8jtya1q.p8jtya2i.p8jtya2q > div > div.p8jtya12.p8jtya9.p8jtya1m.p8jtya2i.p8jtya2m.p8jtya3i > button")).click();
		driver.findElement(By.name("email")).sendKeys("finhXD@gmail.com");
	
	}	
	
	@After
	public void cierre() {
		//driver.quit();
		
	}
}
