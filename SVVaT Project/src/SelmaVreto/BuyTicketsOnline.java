package SelmaVreto;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
@TestMethodOrder(OrderAnnotation.class)

class BuyTicketsOnline {

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
	void testBuyButton() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
     	webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/a/img")).click();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,300)");
     	assertTrue("https://online.cinestarcinemas.ba/", true);
	  	Thread.sleep(1000);
    	}
	@Test
	@Order(2)
	void testCineLinks() throws InterruptedException {
		webDriver.get("https://online.cinestarcinemas.ba/");
		webDriver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
     	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[1]/a")).click();
     	assertTrue("https://karte.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[2]/a")).click();
     	assertTrue("https://karte.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[3]/a")).click();
     	assertTrue("https://karte2.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[4]/a")).click();
     	assertTrue("https://karte.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[5]/a")).click();
     	assertTrue("https://karte.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[6]/a")).click();
     	assertTrue("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back();
	  	
	  	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[7]/a")).click();
     	assertTrue("https://karte2.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx", true);
	  	Thread.sleep(1000);
	  	webDriver.navigate().back(); 
    	}     
     
	@Test
	@Order(3)
	void testReservation() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
     	webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/a/img")).click();
     	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[6]/a")).click();
	  	Thread.sleep(1000);	  	
	  	webDriver.findElement(By.xpath("/html/body/div[1]/form/div[4]/table/tbody/tr/td/div[1]/div[1]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/table[2]/tbody/tr/td[3]")).click();
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_cp1_PerformanceList1_grd_PagerBarT_cmbDateSelect_DDD_L_LBI6T0\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,300)");  
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.linkText("19:15")).click();
	  	Thread.sleep(2000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_rp2_rblAction_RB0_I_D\"]")).click();
	  	Thread.sleep(2000);
		  WebElement two = webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_rpTS_TicketSelector2_grdTS_cell0_1_seTicket_B-2Img\"]"));
	  two.click();
	  two.click();
	  	Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor)webDriver; 
		js1.executeScript("window.scrollBy(0,1000)");  
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_btnAddToShoppingCart_CD\"]/span")).click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_UserName_I\"]")).sendKeys("Selma_Vreto");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_Password_I\"]")).sendKeys("testing123");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_LoginButton_CD\"]/span")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		WebElement waitt = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_lblContentTitle\"]")));	
	  	Thread.sleep(5000);
     	assertTrue("https://karte3.cinestarcinemas.ba/WebTicketNet/shoppingcart.aspx", true);
	  	Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_Logout_btnLogout1\"]")).click();
    	}      
	
	@Test
	@Order(4)
	void testKupovina() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
     	webDriver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/a/img")).click();
     	webDriver.findElement(By.xpath("/html/body/section/div/div/table/tbody/tr/td/table/tbody/tr[1]/td[3]/ul/li[6]/a")).click();
	  	Thread.sleep(1000);	  	
	  	webDriver.findElement(By.xpath("/html/body/div[1]/form/div[4]/table/tbody/tr/td/div[1]/div[1]/table/tbody/tr/td[3]/table/tbody/tr/td[2]/table[2]/tbody/tr/td[3]")).click();
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_cp1_PerformanceList1_grd_PagerBarT_cmbDateSelect_DDD_L_LBI6T0\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor)webDriver; 
		js.executeScript("window.scrollBy(0,300)");  
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_cp1_PerformanceList1_grd_DXDataRow1\"]/td[2]/div/div[2]/a")).click();
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_rpTS_TicketSelector2_grdTS_cell0_1_seTicket_B-2Img\"]")).click();
	  	Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor)webDriver; 
		js1.executeScript("window.scrollBy(0,1000)");  
	  	Thread.sleep(1000);
	  	webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_btnAddToShoppingCart_CD\"]/span")).click();
	  	Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_UserName_I\"]")).sendKeys("Selma_Vreto");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_Password_I\"]")).sendKeys("testing123");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Login2_rpLogin_LoginButton_CD\"]/span")).click();
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		WebElement waitt = wait.until(
				ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_lblContentTitle\"]")));	
	  	Thread.sleep(5000);
     	assertTrue("https://karte3.cinestarcinemas.ba/webticketnet/shoppingcart.aspx", true);
	  	Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_Logout_btnLogout1_CD\"]/span")).click();
    	}     
}
