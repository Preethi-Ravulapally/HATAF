package HA.TestAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AboutUs {
	public static void Management(String datafile, String dataset, String dataset2, String dataset3, String dataset4,String dataset5) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Chairman = CMRLogin.getData(datafile, dataset3);
		String Vice_Chairman = CMRLogin.getData(datafile, dataset4);
		String Secretary = CMRLogin.getData(datafile, dataset5);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("About Us Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[1]/ul/li/div/div[1]/ul/li[1]/a[text()='"+Option+"']")).click();
		Driver.info("Management Clicked Successfully");
		String val = CMRLogin.driver.findElement(By.xpath("//div[1]/div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Chairman - Actual Value: "+val);
		Driver.info("Chairman - Expected Value: "+Chairman);
		if(val.equals(Chairman))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
		String val1 = CMRLogin.driver.findElement(By.xpath("//div[2]/div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Vice-Chairman - Actual Value: "+val1);
		Driver.info("Vice-Chairman - Expected Value: "+Vice_Chairman);
		if(val1.equals(Vice_Chairman))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
		String val2 = CMRLogin.driver.findElement(By.xpath("//div[3]/div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Secretary & Correspondent - Actual Value: "+val2);
		Driver.info("Secretary & Correspondent - Expected Value: "+Secretary);
		if(val2.equals(Secretary))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
	public static void Facilities(String datafile, String dataset, String dataset2, String dataset3, String dataset4,String dataset5,String dataset6) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Hostel = CMRLogin.getData(datafile, dataset3);
		String Canteen = CMRLogin.getData(datafile, dataset4);
		String ATM = CMRLogin.getData(datafile, dataset5);
		String Post_Office = CMRLogin.getData(datafile, dataset6);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("About Us Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[1]/ul/li/div/div[1]/ul/li[6]/a[text()='"+Option+"']")).click();
		Driver.info("Facilities Clicked Successfully");
		String host = CMRLogin.driver.findElement(By.xpath("//article[1]/div[@class='details col-md-10 col-sm-9 col-xs-8']/h3")).getText();
		Driver.info("Actual Value: "+host);
		Driver.info("Expected Value: "+Hostel);
		if(host.equals(Hostel))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
		String can = CMRLogin.driver.findElement(By.xpath("//article[2]/div[@class='details col-md-10 col-sm-9 col-xs-8']/h3")).getText();
		Driver.info("Actual Value: "+can);
		Driver.info("Expected Value: "+Canteen);
		if(can.equals(Canteen))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
		String atm = CMRLogin.driver.findElement(By.xpath("//article[3]/div[@class='details col-md-10 col-sm-9 col-xs-8']/h3")).getText();
		Driver.info("Actual Value: "+atm);
		Driver.info("Expected Value: "+ATM);
		if(atm.equals(ATM))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
		String post = CMRLogin.driver.findElement(By.xpath("//article[4]/div[@class='details col-md-10 col-sm-9 col-xs-8']/h3")).getText();
		Driver.info("Actual Value: "+post);
		Driver.info("Expected Value: "+Post_Office);
		if(post.equals(Post_Office))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
	public static void AccountsAuditReports(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Year = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("About Us Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[1]/ul/li/div/div[1]/ul/li[4]/a[text()='"+Option+"']")).click();
		Driver.info("Accounts Audit Reports Clicked Successfully");
		switch(Year)
		{
			case "2016-17":
				CMRLogin.driver.findElement(By.xpath("//article[@class='welcome col-md-8 col-sm-7']/font/a[@ href='assets/appp/ab/bs 16-17.pdf']")).click();
				Driver.info("Balance Sheet Financial Year 2016-17 Selected Successfully");
				break;
			case "2015-16":
				CMRLogin.driver.findElement(By.xpath("//article[@class='welcome col-md-8 col-sm-7']/font/a[@ href='assets/appp/ab/BS  FY 2015-16.pdf']")).click();
				Driver.info("Balance Sheet Financial Year 2015-16 Selected Successfully");
				break;
			case "2014-15":
				CMRLogin.driver.findElement(By.xpath("//article[@class='welcome col-md-8 col-sm-7']/font/a[@ href='assets/appp/ab/bs  2014-15.pdf']")).click();
				Driver.info("Balance Sheet Financial Year 2014-15 Selected Successfully");
				break;
			default :
				Driver.info("No year Selected");
		}
    }
}
