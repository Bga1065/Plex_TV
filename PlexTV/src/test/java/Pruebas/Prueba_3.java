package Pruebas;

import java.time.Duration;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba_3 {
	
	ThreadLocal<ChromeDriver> driver = new ThreadLocal<ChromeDriver>();

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/bayro/OneDrive/Documentos/Documents/Calidad_de_Software/Demo_2/chromedriver.exe/");
		driver.set(new ChromeDriver());
		getDriver().manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	}

	public WebDriver getDriver() {

		return driver.get();
	}

	@Test
	public void prueba3() {
		getDriver().get("https://watch.plex.tv/movies-and-shows/category/action?_gl=1*2s7nnb*_ga*NTU0ODg4NTI0LjE2NzA4MjU3MTM.*_ga_G6FQWNSENB*MTY3MDgyNzYxMy4yLjEuMTY3MDgyNzcyOC4wLjAuMA..");		
		getDriver().findElement(By.cssSelector("#__next > div.App_app__fO6n7 > header > div > div.p8jtya1i.p8jtya1j.p8jtya1k.p8jtya11 > nav > button > span > svg")).click();
		getDriver().findElement(By.cssSelector("#radix-\\:Rckm\\: > div > div.p8jtya6m.p8jtya9q.p8jtya7q.p8jtya8m.oywxfn0.oywxfn2.oywxfn5.oywxfn7 > span > div > div.p8jtya12.p8jtya9.p8jtya4e.p8jtya1q.p8jtya1n.p8jtya2i.p8jtya2m.p8jtya32.p8jtya3m > button.nckz222.p8jtya16.p8jtya32.p8jtya3m.p8jtyam.nckz22d.j6xja40.p8jtyaf6.nckz228")).click();
		getDriver().manage().window().maximize();
		getDriver().findElement(By.id("username")).sendKeys("jfinhXD@gmail.com");
		getDriver().findElement(By.id("password")).sendKeys("pollolandia12");
		getDriver().findElement(By.cssSelector("#radix-\\:rc\\: > div > div > div > span > div > div > div > div.p8jtya12.p8jtya9.p8jtya4a.p8jtya1q.p8jtya2i.p8jtya2q > form > div > button")).click();
		
	}
	@Test
	public void prueba3_1() {
		getDriver().get("https://watch.plex.tv/movies-and-shows/category/action?_gl=1*2s7nnb*_ga*NTU0ODg4NTI0LjE2NzA4MjU3MTM.*_ga_G6FQWNSENB*MTY3MDgyNzYxMy4yLjEuMTY3MDgyNzcyOC4wLjAuMA..");		
		getDriver().findElement(By.cssSelector("#__next > div.App_app__fO6n7 > header > div > div.p8jtya1i.p8jtya1j.p8jtya1k.p8jtya11 > nav > button > span > svg")).click();
		getDriver().findElement(By.cssSelector("#radix-\\:Rckm\\: > div > div.p8jtya6m.p8jtya9q.p8jtya7q.p8jtya8m.oywxfn0.oywxfn2.oywxfn5.oywxfn7 > span > div > div.p8jtya12.p8jtya9.p8jtya4e.p8jtya1q.p8jtya1n.p8jtya2i.p8jtya2m.p8jtya32.p8jtya3m > button.nckz222.p8jtya16.p8jtya32.p8jtya3m.p8jtyam.nckz22d.j6xja40.p8jtyaf6.nckz228")).click();
		getDriver().manage().window().maximize();
		getDriver().findElement(By.id("username")).sendKeys("thegunter2006xd@gmail.com");
		getDriver().findElement(By.id("password")).sendKeys("pollolandia12");
		getDriver().findElement(By.cssSelector("#radix-\\:rc\\: > div > div > div > span > div > div > div > div.p8jtya12.p8jtya9.p8jtya4a.p8jtya1q.p8jtya2i.p8jtya2q > form > div > button")).click();
		
	}

	@After
	public void tearDown() {
		//getDriver().quit();
	}
}
