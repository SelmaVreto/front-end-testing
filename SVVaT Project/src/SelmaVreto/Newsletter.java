package SelmaVreto;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
@TestMethodOrder(OrderAnnotation.class)

class Newsletter {

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
	void testLetter() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
     	webDriver.findElement(By.xpath("/html/body/section/div/div/div[5]/a/img")).click();;
		assertTrue("https://www.blitz-cinestar-bh.ba/newsletter-prijava", true);
		Thread.sleep(1000);
	}
	
	@Test
	@Order(2)
	void testLetterLogin() throws InterruptedException {
	webDriver.get("https://www.blitz-cinestar-bh.ba/newsletter-prijava");
	webDriver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)webDriver; 
	js.executeScript("window.scrollBy(0,1000)");
		WebElement ime = webDriver.findElement(By.name("Ime"));
		WebElement prez = webDriver.findElement(By.name("Prezime"));
		WebElement email = webDriver.findElement(By.name("email"));

		assertEquals("input", ime.getTagName());
		assertEquals("input", prez.getTagName());
		assertEquals("input", email.getTagName());

		ime.sendKeys("Selma");
		prez.sendKeys("Vreto");
		email.sendKeys("selma.vreto@stu.ibu.edu.ba");

		WebElement zensko = webDriver.findElement(By.xpath("//*[@id=\"spol_ž\"]"));
		zensko.click();
		assertTrue(zensko.isSelected()); 
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)webDriver; 
		js1.executeScript("window.scrollBy(0,200)");
	  	webDriver.findElement(By.xpath("//*[@id=\"newsupis2\"]/table/tbody/tr[6]/td/label\r\n")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(45));
		Thread.sleep(10000);
		WebElement permission = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"newsupis2\"]/table/tbody/tr[8]/td/div/input")));
		permission.click();
		Thread.sleep(2000);
	}
	
	@Test
	@Order(3)
	void testLetterLogOut() throws InterruptedException {
	webDriver.get("https://www.blitz-cinestar-bh.ba/newsletter-prijava");
	webDriver.manage().window().maximize();
	JavascriptExecutor js = (JavascriptExecutor)webDriver; 
	js.executeScript("window.scrollBy(0,1000)");
  	webDriver.findElement(By.xpath("//*[@id=\"newsupis2\"]/table/tbody/tr[1]/td/label[2]")).click();
		WebElement email2 = webDriver.findElement(By.name("email"));
		assertEquals("input", email2.getTagName());
		email2.sendKeys("selma.vreto@stu.ibu.edu.ba");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(45));
		Thread.sleep(10000);
		WebElement permission2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"newsupis2\"]/table/tbody/tr[8]/td/div/input")));
		permission2.click();
		Thread.sleep(2000);
	}
	
	@Test
	@Order(4)
	void testPrivola() throws InterruptedException {
		webDriver.get("https://www.blitz-cinestar-bh.ba/newsletter-prijava");
	    Thread.sleep(2000);
		webDriver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,800)");
    	Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"newsupis2\"]/table/tbody/tr[7]/td/a")).click();
    	Thread.sleep(2000);
    	assertTrue("https://www.blitz-cinestar-bh.ba/pristanak-za-newsletter", true);
	}
}
