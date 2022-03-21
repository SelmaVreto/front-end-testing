package SelmaVreto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@TestMethodOrder(OrderAnnotation.class)

class UserProfile {
	
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
	void testRegistration() throws InterruptedException {
	webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
	webDriver.manage().window().maximize();
	Thread.sleep(1000);
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_lklRegister']")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtBenutzername_I']")).sendKeys("Selma_Vrreto");
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtPassword_I']")).sendKeys("testing123");
		webDriver.findElement(By.xpath("//*[@id='ctl00_ctl00_cp1_rp_cp1_Register1_txtPasswordWdh_I']")).sendKeys("testing123");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_cbAGB_S_D\"]")).click();
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtVorname_I\"]")).sendKeys("Selma");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtNachname_I\"]")).sendKeys("Vreto");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtOrt_I\"]")).sendKeys("Sarajevo");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtEmail_I\"]")).sendKeys("v.selmaaaa@gmail.com");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_txtEmailConfirm_I\"]")).sendKeys("v.selmaaaa@gmail.com");
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_deGeburtstag_I\"]")).sendKeys("17.02.2000.");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cp1_rp_cp1_Register1_btnRegistrieren_CD\"]/span")).click();
		Thread.sleep(2000);
	}
	
	@Test
	@Order(2)
	void testLogIn() throws InterruptedException {
	webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
	webDriver.manage().window().maximize();
	Thread.sleep(1000);
	webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_UserName_I']")).sendKeys("Selma_Vreto");
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_Password_I']")).sendKeys("testing123");
		Thread.sleep(2000);
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_cbRememberMe_S_D']")).click();
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_LoginButton_CD']/span")).click();
		Thread.sleep(2000);
	}
	
	@Test
	@Order(3)
	void testLogOut() throws InterruptedException {
		webDriver.get("https://karte3.cinestarcinemas.ba/WebTicketNet/Performancelist.aspx");
		webDriver.manage().window().maximize();
		Thread.sleep(1000);
		webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_btnLoginPop_CD']/span")).click();
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_UserName_I']")).sendKeys("Selma_Vreto");
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_Password_I']")).sendKeys("testing123");
			webDriver.findElement(By.xpath("//*[@id='ctl00_LoginPopup1_cpLoginPopup_Login1_rpLogin_LoginButton_CD']/span")).click();
			Thread.sleep(2000);
		    webDriver.findElement(By.xpath("//*[@id=\"ctl00_Logout_btnLogout1_CD\"]")).click();		
		    Thread.sleep(2000);
	}	

}
