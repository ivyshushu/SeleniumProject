package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	public String username;
	public String password;
	
	LoginPage(WebDriver d, String u, String p){
		this.driver = d;
		this.username = u;
		this.password = p;
	}
	
	public void login(){
		String url = "http://xxx.techexcel.net/cwassetwise/AWLogin.aspx";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

}
