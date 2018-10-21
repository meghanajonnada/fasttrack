package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch {
	public static WebDriver driver = null;
	public static  String url=null;
	public static  String browser=null;
    public static void launch1(String browser, String url)
	{
		System.out.println(browser);
		if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mulesoft12\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		
		
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Mulesoft12/Downloads/chromedriver_win32/chromedriver.exe"); 
		     driver = new ChromeDriver();
		    
		}
		
		else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mulesoft12\\Downloads\\IEDriverServer_x64_3.14.0/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
			driver.get(url);
			(new WebDriverWait(driver,10)).until(ExpectedConditions.
					presenceOfElementLocated(By.id("loginbutton")));
			driver.manage().window().maximize();
			String at=driver.getTitle();
			String et="Facebook – log in or sign up";
			if(at.equals(et)) {
				System.out.println("requested url opened");
				}
			else
			{
				System.out.println("url failed to open");
			}
		}
	}

