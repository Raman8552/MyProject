package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.TimeUtils;

public class BaseHRMClass {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	//Step 1
	public BaseHRMClass() {
		try {
		FileInputStream file =new FileInputStream("C:\\Users\\kaurr\\OneDrive\\Documents\\HRmanagement\\src\\test\\java\\environmentvariables\\Config.properties");
	prop.load(file);
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}}
	
	//Step 2
	public static void initiation() {
		//if browser= chrome webdriver.chrome.driver
		//elseif(browser=firefox){
		//webdriver.gecko.driver
		
	String browsername=	prop.getProperty("browser");
		if (browsername.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();}
			else if (browsername.equals("chrome")) {
				WebDriverManager.chromedriver();
				driver=new ChromeDriver();
				
			}	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtils.timepage,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		}
	}
		
	
		


