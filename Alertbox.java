package alert_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://echoecho.com/javascript4.htm#google_vignette");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		

	}

}
