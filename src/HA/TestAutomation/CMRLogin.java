package HA.TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.BasicConfigurator;
import org.dom4j.io.SAXReader;


public class CMRLogin{
	public static HATF_properties _properties = new HATF_properties();
	public static WebDriver driver = null;
	public static void main(String[] args) throws Exception{
	}
	public static void signIn() throws Exception {
		BasicConfigurator.configure();
		System.setProperty("webdriver.chrome.driver", "D:\\MajorProject\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		Driver.info("chrome is opened");
		
		driver.get(_properties.getProperty(HATF_properties.BASEURL));
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//div[@class='col-12']//a[text()='LOGIN']")).click();
//		driver.findElement(By.id("emailInput")).sendKeys(_properties.getProperty(HATF_properties.EMAIL));
//		Driver.info("Email is entered");
//		driver.findElement(By.id("passwordLogin")).sendKeys(_properties.getProperty(HATF_properties.PASSWORD));
//		Driver.info("Password is entered");
//		
//		driver.findElement(By.id("saveForm")).click();
//		Driver.info("Login button is clicked");
//		String title = driver.getCurrentUrl();
//		if(title.contains(_properties.getProperty(HATF_properties.PASSWORD))){
//			Driver.info("Login is done successfully");
//		}
//		else{
//			Driver.info("Please check your credentails");
//			Assert.fail();
//		}
	}
	

	public static void close(){
		driver.quit();
	}
	
	public static String getData(String datafile,String dataset) throws Exception{
		org.dom4j.Document doc1;
	    String fileName=System.getProperty("user.dir")+"\\src\\HA\\TestData\\input\\"+datafile;
		SAXReader reader = new SAXReader();
		doc1 = reader.read(fileName);
		if(doc1==null){
			return null;
		}
		String data =  doc1.selectSingleNode("//" + dataset.replace('.', '/')).getText(); 
		return data;
	}
	
}

