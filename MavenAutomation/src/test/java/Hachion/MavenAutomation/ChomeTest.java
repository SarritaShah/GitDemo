package Hachion.MavenAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChomeTest {
	@Test
	public void chromeinvoke()
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\sarit\\OneDrive\\Desktop\\Hachion\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	}
}
