package method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	
	WebDriver driver;
	

	public Methods(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement emailTextBox()
	{
		return driver.findElement(By.name("email"));
	}
	

	public WebElement passwordTextBox()
	{
		return driver.findElement(By.id("pass"));
	}
	public WebElement signinButton()
	{
		return driver.findElement(By.id("loginbutton"));
	}
		 public void enterTextEmailTextBox(String arg1)
	 {
		 emailTextBox().sendKeys(arg1);
	 }
	 public void clearEmailTextBox()
	 {
		 emailTextBox().clear();
	 }
	 public void enterTextpasswordTextBox(String arg2)
	 {
		 passwordTextBox().sendKeys(arg2);
	 }
	 public void clearpasswordTextBox()
	 {
		 passwordTextBox().clear();
	 }
	/* public void alerthandler() {
		 Alert alt=driver.switchTo().alert();
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	
		 alt.accept();
		
		 
	 }*/
	 
	 public WebElement searchFriend()
	 {driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //WebDriverWait wait=new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.visibilityOf(searchFriend()));
		 return driver.findElement(By.xpath("//input[contains(@role,'combobox')and(@data-testid='search_input')]"));	 
	 }
	 public void EnterFriend(String arg1)
	 {
		 WebDriverWait wait =new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(searchFriend()));
		 searchFriend().sendKeys(arg1);
		 }
	 public WebElement me()
	 { 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 return driver.findElement(By.xpath(".//*[@id='xt_uniq_3']/div/div[1]/a/div"));
		 
	 }

	 public WebElement message()
	 {
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  return driver.findElement(By.xpath("//a[text()='Message']"));
	 }
	 
	 public WebElement Entermessage()
	 { //WebDriverWait wait =new WebDriverWait(driver, 20);
	 //wait.until(ExpectedConditions.visibilityOf(message()));
		  return driver.findElement(By.xpath("//div[contains(@role,'combobox')]"));
	 }
	 public void enterEnterMessage(String value)
	 {
		 WebDriverWait wait =new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(Entermessage()));
	Entermessage().sendKeys(value);
	
	 }
	public void sendmessage()
	{
		Entermessage().sendKeys(Keys.ENTER);
	}
public void clicksignin()
{
	signinButton().click();
	
}
public void clickme() throws InterruptedException
{WebDriverWait wait =new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(me()));
	Thread.sleep(10000);
	me().click();
}
public void clickmessage()
{
	WebDriverWait wait =new WebDriverWait(driver, 20);
	 wait.until(ExpectedConditions.visibilityOf(message()));
			
	message().click();
	
}
public void entersearchFriend()
{
	searchFriend().sendKeys(Keys.ENTER);
}
public void loginpagevalidation()
{
	 WebElement email=driver.findElement(By.xpath("//label[@for='email']"));
		String label=email.getText();
		String actuallabel="Email or Phone";
		WebElement emailAdress=driver.findElement(By.name("email"));
		//System.out.println(emailAdress.isDisplayed());
		Boolean dispemail=email.isDisplayed();
		Boolean enabemail=email.isEnabled();
		if((label.equals(actuallabel))&&(dispemail=true)&&(enabemail=true))
		{
			System.out.println("username field is displayed");
		}
		else
		{
			System.out.println("erroer in usernamefield");
		}
		 WebElement pass=driver.findElement(By.xpath("//label[@for='pass']"));
			String passlabel=pass.getText();
			String actuallabel2="Password";
			WebElement password=driver.findElement(By.id("pass"));
			//System.out.println(password.isDisplayed());
			Boolean disppass=password.isDisplayed();
			Boolean enabpass=password.isEnabled();
			if((passlabel.equals(actuallabel2))&&(disppass=true)&&(enabpass=true))
			{
				System.out.println("password  field is displayed");
			}
			else
			{
				System.out.println("error in passwordfield");
			}
}
			public void loginvalidation()
			{
				WebElement login=driver.findElement(By.id("loginbutton"));
				Boolean logindisp=login.isDisplayed();
				System.out.println(logindisp);
				Boolean enablogin=login.isEnabled();
				if((logindisp=true)&&(enablogin=true))
				{
					System.out.println("login button is working");
				}
				else
				{
					System.out.println("login button is not working");
				}
			}
			public void homepagevalidation()
			{
				
				WebElement homeval=driver.findElement(By.xpath("//div[@id='u_0_c']/child::a"));
				String homemes=homeval.getText();
				Boolean homedisp=homeval.isDisplayed();
				Boolean homeenab=homeval.isEnabled();
				System.out.println(homemes);
				String ehomemes="Home";
				if((homemes.equals(ehomemes))&&(homedisp=true)&&(homeenab=true))
						{
					System.out.println("home button is working");
						}
				else {
					System.out.println("home button is not working");
				}

				WebElement findfrndval=driver.findElement(By.xpath("//a[@id='findFriendsNav']"));
				String findfrndmes=findfrndval.getText();
				System.out.println(findfrndmes);
				String efindfrndmes ="Find Friends";
				Boolean findfrnddisp=findfrndval.isDisplayed();
				Boolean findfrndenab=findfrndval.isEnabled();
				if((findfrndmes.equals(efindfrndmes))&&(findfrnddisp=true)&&(findfrndenab=true))
				{
			System.out.println("findfriend button is working");
				}
		else {
			System.out.println("findfriend button is not working");
		}
				
				WebElement messengerval=driver.findElement(By.xpath("//a[@title='Messenger']/child::div"));
				String messengermes=messengerval.getText();
				System.out.println(messengermes);
				String emessenger ="Messenger";
				Boolean messengerdisp=messengerval.isDisplayed();
				Boolean messengerenab=messengerval.isEnabled();
				if((messengermes.equals(emessenger))&&(messengerdisp=true)&&(messengerenab=true))
				{
			System.out.println("messenger  is working");
				}
		else {
			System.out.println("messenger is not working");
		}
			}
		public void searchfriendvalidation() {
			WebDriverWait wait=new WebDriverWait(driver,20);
			WebElement dispnameval=driver.findElement(By.xpath("//div[text()='Meghana Jonnada' ]"));
			wait.until(ExpectedConditions.visibilityOf(dispnameval));
			String foundfrnd=dispnameval.getText();
			System.out.println(foundfrnd);
			
				if(foundfrnd.equals("Meghana Jonnada"))
				{
					System.out.println("searched profile displayed");
				}
				else {
					System.out.println("profile not found");
				}
			
		}
	
		public WebElement settings() 
		{
			return driver.findElement(By.xpath(".//*[@id='userNavigationLabel']/parent::a"));}
		public void clicksettings() throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(settings()));
			Thread.sleep(7000);
			settings().click();
			
		}
		public WebElement activitylog()
		{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 return driver.findElement(By.xpath("//div[text()='Activity log']"));
	//wait.until.(ExpectedConditions.visibilityOf(activitylog()));
		 }
		public void clickactivitylog() throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(activitylog()));
			System.out.println("Activitylog found:"+activitylog().isDisplayed());
			Thread.sleep(10000);
			activitylog().click();
		}
		public WebElement logo()
		{
		 return driver.findElement(By.xpath("//h2[@class='uiHeaderTitle' and text()='Activity log']"));}
		public void Activitylogvalidation() {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOf(logo()));
			
			
		 String actuallogo=logo().getText();
		 String expectedlogo="Activity log";
		 if(actuallogo.equals(expectedlogo))
		 {
			 System.out.println("Activity log page opened");
		 }
		 else
		 {
			 System.out.println("Activity log page not opened");
		 }
		}
		public WebElement home()
		{
			return driver.findElement(By.id("u_0_c"));
			
		}
		public void clickhome() {
			home().click();
			
		}
		 public WebElement logout()
		 {
		return driver.findElement(By.xpath("//*[text()='Log Out']")) ;
		 }
		public void clickLogout()
		{
			WebDriverWait wait=new WebDriverWait(driver,20);
			logout().click();
			
			
		}
		public void logoutvalidation() {
			String text=logout().getText();
			if(text.equals("Log Out")&&(logout().isDisplayed())&&(logout().isEnabled()))
			{
				System.out.println("logout is working");
			}
		}
		
		}




