package SelmaVreto;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestMethodOrder(OrderAnnotation.class)

class Homepage {

	private static WebDriver webDriver;
	private static String baseUrl;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selma\\Desktop\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://www.blitz-cinestar-bh.ba/";
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		webDriver.close();
	}
	
	@Test
	@Order(1)
	void testLogo() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		webDriver.navigate().to(baseUrl + "/4dx");
		assertTrue("https://www.blitz-cinestar-bh.ba/4dx", true);
		Thread.sleep(2000);
		webDriver.findElement(By.cssSelector("img[src='img/cinestar-logotip.svg']")).click();	
		String url1 = webDriver.getCurrentUrl();
		assertEquals("https://www.blitz-cinestar-bh.ba/", url1);
		Thread.sleep(2000);
	}
	
	@Test
	@Order(2)
	void testMenu() throws InterruptedException {
	webDriver.get(baseUrl);
	webDriver.manage().window().maximize();
	webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	webDriver.findElement(By.cssSelector("img[src='img/imax-logo.svg']")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/imax", true);
	
	webDriver.findElement(By.cssSelector("img[src='img/4dx-logo-n2.svg']")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/4dx", true);
	
	webDriver.findElement(By.cssSelector("img[src='img/extreme-logo.svg']")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/extreme", true);
	
	webDriver.findElement(By.cssSelector(".tvoje-kino-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/tvoje-privatno-kino-8904", true);
	
	webDriver.findElement(By.cssSelector(".spektakli-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/spektakli", true);
	
	webDriver.findElement(By.cssSelector(".sjedala")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/sjedista-bih", true);
	
	webDriver.findElement(By.cssSelector(".loyalty-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/loyalty-program-7936", true);
	
	webDriver.findElement(By.cssSelector(".projekcije-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/skolske-projekcije-7351", true);
	
	webDriver.findElement(By.cssSelector(".rodendani-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/proslavi-rodjendan-kao-zvijezda-8585", true);
	
	webDriver.findElement(By.cssSelector(".starkids-icon")).click();
	assertTrue("https://www.blitz-cinestar-bh.ba/kids", true);
}
	
	@Test
	@Order(3)
	void testRotator() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.findElement(By.linkText("USKORO")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.linkText("NA PROGRAMU")).click();
		Thread.sleep(2000);
	    webDriver.findElement(By.linkText("AKCIJE I USLUGE")).click();
	    Thread.sleep(2000);
	    webDriver.findElement(By.linkText("4DX SARAJEVO, BANJA LUKA")).click();
		Thread.sleep(2000);
		webDriver.findElement(By.linkText("IMAX")).click();
	    Thread.sleep(2000);
	}
	
	@Test
	@Order(4)
	void testRotatorAds() throws InterruptedException {
		webDriver.get(baseUrl);
	    Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"tab1Content\"]/div/div/div/a/img")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bih/king-s-man-pocetak/7235", true);
    	Thread.sleep(2000);
    	webDriver.navigate().back();
	    webDriver.findElement(By.linkText("AKCIJE I USLUGE")).click();
	    Thread.sleep(2000);
		webDriver.findElement(By.cssSelector(".rotator3 img")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/business-club-7311", true);
	}
	@Test
	@Order(5)
	void testMovie() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
        js.executeScript("window.scrollBy(0,500)");
	  	Thread.sleep(2000);
	      webDriver.findElement(By.xpath("/html/body/section/div/div/div[3]/div[1]/div[1]/a/img")).click();
	  	String url = webDriver.getCurrentUrl();
	  	assertEquals("https://www.blitz-cinestar-bh.ba/najave-filmova-5333/1", url);
	  	Thread.sleep(1000);
	}
	
	@Test
	@Order(6)
	void testmonth() throws InterruptedException {
		webDriver.get("https://www.blitz-cinestar-bh.ba/najave-filmova-5333/1");
	  	Thread.sleep(1500);
	    String months[] = { "Januar","Februar","Mart","April","Maj"};
	    for (String i : months) {
	        webDriver.findElement(By.linkText(i)).click();
		  	Thread.sleep(1500);
	    }
	}

}
