package TestCase_StepDefs;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;



public class BaseClass {
	
	static ReadConfig readConfig = new ReadConfig();
	public  String baseURL = readConfig.getApplicationURL();
	public  String username = readConfig.getUserName();
	public  String password = readConfig.getPassword();
	public static WebDriver driver = null;
	public static Logger testLogger;
	
	public static long startTime = 0;
	public static long endTime = 0;
	

	
	
//	@Parameters("browser")
//	@BeforeMethod
//	public void setup(String sbrowser) {
//		if(sbrowser.equalsIgnoreCase("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsh\\Documents\\Driver_Dependancies\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		}
////		}else if(sbrowser.equalsIgnoreCase("edge")) {
////			System.setProperty("webdriver.edge.driver", readConfig.getEdgePath());
////			driver = new EdgeDriver();
////			driver.manage().window().maximize();
////			}
//		
//		testLogger = LogManager.getLogger(getClass().getSimpleName());
//		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\log4j2.properties");	
//		
//		startTime = System.currentTimeMillis();
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		testLogger.info("time taken for test "+totalTime);
		
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
	
	public String takeScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot take = (TakesScreenshot) driver;
		File src = take.getScreenshotAs(OutputType.FILE);
		String dateFormat = new SimpleDateFormat("yyyy.MMddHHmmss").format(new Date());
		String pathOfFile = System.getProperty("user.dir")+"\\Screenshots\\"+dateFormat+"_sfdcscreenshot.png";
		File dest = new File(pathOfFile);
		FileUtils.copyFile(src, dest);
		return pathOfFile;
	}
	
//	@BeforeMethod
@BeforeClass
public void setup() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsh\\Documents\\Driver_Dependancies\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
//	System.getProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
//	driver = new FirefoxDriver();
//	driver.manage().window().maximize();
	
//	System.setProperty("webdriver.edge.driver", readConfig.getEdgePath());
//	driver = new EdgeDriver();
//	driver.manage().window().maximize();

	testLogger = LogManager.getLogger(getClass().getSimpleName());
	PropertyConfigurator.configure(System.getProperty("user.dir")+"\\CucumberLogs.properties");	
	
	startTime = System.currentTimeMillis();
	
}

}
