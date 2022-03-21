package SelmaVreto;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
@TestMethodOrder(OrderAnnotation.class)

class MoviesSelection {

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
	void testOdaberiKino() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
     	WebElement ok = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[2]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-sarajevo", true);
    	Thread.sleep(1000);
    	
     	WebElement ok1 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok1.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[3]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-mostar", true);
    	Thread.sleep(1000);
    	
     	WebElement ok2 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok2.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[4]")).click();
		assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bihac", true);
    	Thread.sleep(1000);
    	
     	WebElement ok3 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok3.click();
     	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[5]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-tuzla", true);
    	Thread.sleep(1000);
    	
     	WebElement ok4 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok4.click();
     	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[6]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-banja-luka", true);
    	Thread.sleep(1000);
    	
     	WebElement ok5 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok5.click();
     	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[7]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-zenica", true);
    	Thread.sleep(1000);
    	
     	WebElement ok6 = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	ok6.click();
     	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[8]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-prijedor", true);
    	Thread.sleep(1000);
	}
	@Test
	@Order(2)
	void testOdaberiFilm() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
     	WebElement of = webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]"));
     	of.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]/option[2]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bih/100-vuk-sink/7740/20220102", true);
    	Thread.sleep(1000);
    	
     	WebElement of1 = webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]"));
     	of1.click();
    	Thread.sleep(1000);
    	webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]/option[3]")).click();
     	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bih/ainbo-dobri-duh-amazone-sink/7561/20220102", true);
    	Thread.sleep(1000);

     	WebElement of2 = webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]"));
     	of2.click();
    	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]/option[4]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bih/avanture-obitelji-bigfoot-sink/7288/20220102", true);
    	Thread.sleep(1000);
	}
	@Test
	@Order(3)
	void testTrazilica() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();  
     	Thread.sleep(1000);
     	webDriver.findElement(By.id("pojam")).click();
     	webDriver.findElement(By.id("pojam")).sendKeys("Nebesa");
     	Thread.sleep(2000);
     	webDriver.findElement(By.cssSelector(".searchbutton")).click();
     	Thread.sleep(2000);
	}
	@Test
	@Order(4)
	void testMoreSelections() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
	    Thread.sleep(2000);
     	WebElement okina = webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]"));
     	okina.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[2]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-sarajevo", true);
    	Thread.sleep(2000);
     	WebElement ofilma = webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]"));
     	ofilma.click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirfilmaselect\"]/option[2]")).click();
    	assertTrue("https://www.blitz-cinestar-bh.ba/cinestar-bih/100-vuk-sink/7740/20220102", true);
    	Thread.sleep(1000);
	}
	@Test
	@Order(5)
	void testFormatting() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
     	webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]")).click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"odabirkinaselect\"]/option[2]")).click();
	    String links[] = { "NED", "PON","UTO","MOJA CINE SRIJEDA","ÈET","PET","SUB"};
	    for (String i : links) {
	    	webDriver.findElement(By.linkText(i)).click();
	    }
		webDriver.findElement(By.xpath("//*[@id=\"formsort\"]/a[1]")).click();
		webDriver.findElement(By.xpath("//*[@id=\"formsort\"]/a[2]")).click();
	  	Thread.sleep(1000);
    	}

}