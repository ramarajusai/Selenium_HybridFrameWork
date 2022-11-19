package com.inetBanking_v11.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetBanking_v11.utilities.ReadConfig;

public class BaseClass {

	ReadConfig rc = new ReadConfig();
	public String baseURL = rc.getApplicationUrl(); // "https://demo.guru99.com/v3/index.php";
	public String username = rc.getUsername();// "mngr455530";
	public String password = rc.getPassword();// "mygAjUz";
	public String browser = rc.getBrowser();
	public static WebDriver driver;

	public static Logger logger; // for the logs

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {//
		logger = Logger.getLogger("ebanking");// for the logs
		PropertyConfigurator.configure("Log4j.properties");// for the logs
		if (br.equals("chrome")) {

			// System.setProperty("weddriver.chrome.driver", rc.getChromepath()); // "//Drivers//chromedriver.exe will be
																				// added to config.props file"
			System.setProperty("webdriver.chrome.driver","C://Users//DELL//eclipse-workspace//inetBanking_v11//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

	}

		else if (br.equals("ie")) {

			System.out.println("******************EXCUTE TC ON THE IE BROWSER************************************");
		} else {

			System.out.println("******************EXCUTE TC ON THE FF BROWSER************************************");
		}

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
