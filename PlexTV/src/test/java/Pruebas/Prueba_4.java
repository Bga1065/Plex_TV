package Pruebas;

import java.time.Duration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Prueba_4 {
    
    private WebDriver driver;

   @Before
    public void setUp() {
	   System.setProperty("webdriver.chrome.driver", "/Users/Lindsay/OneDrive/Escritorio/Demo2/chromedriver.exe/");    
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));        
    }
    @Test
    public void Test() {
        driver.get("https://www.plex.tv/");        
        driver.findElement(By.cssSelector("#plex-global-nav > header > div.fresnel-lessThan-md.nav.menuContainer > button")).click();
        driver.findElement(By.cssSelector("#mobile-news-0 > span")).click();
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#slick-slide00 > div > a")).click();    
    }    
    
    @After
    public void cierre() {
        //driver.quit();
        
    }
}