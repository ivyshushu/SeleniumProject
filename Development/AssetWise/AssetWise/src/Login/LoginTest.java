package Login;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	public WebDriver driver;
	public LoginPage loginPage;
	@Before
	public void setUp() throws Exception {
		File path = new File("D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary binary = new FirefoxBinary(path);
		this.driver = new FirefoxDriver(binary, null);
	}

	@Test
	public void test() {
		this.loginPage = new LoginPage(driver, "terry-j", "terry-j");
		loginPage.login();
		fail("Not yet implemented");
	}

}
