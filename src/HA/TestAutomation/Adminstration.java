package HA.TestAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Adminstration {
	public static void Director(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Value = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Adminstration Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[2]/ul/li[1]/a[text()='"+Option+"']")).click();
		Driver.info("Director(Academics) Clicked Successfully");
		String val = CMRLogin.driver.findElement(By.xpath("//div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Actual Value: "+val);
		Driver.info("Expected Value: "+Value);
		if(val.equals(Value))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
	public static void Principal(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Value = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Adminstration Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[2]/ul/li[2]/a[text()='"+Option+"']")).click();
		Driver.info("Principal Clicked Successfully");
		String val = CMRLogin.driver.findElement(By.xpath("//div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Actual Value: "+val);
		Driver.info("Expected Value: "+Value);
		if(val.equals(Value))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
	public static void Admin_Officer(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Value = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Adminstration Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[2]/ul/li[7]/a[text()='"+Option+"']")).click();
		Driver.info("Adminstrative Officer Clicked Successfully");
		String val = CMRLogin.driver.findElement(By.xpath("//div[@class='details col-md-9 col-sm-8 col-xs-6']/h3")).getText();
		Driver.info("Actual Value: "+val);
		Driver.info("Expected Value: "+Value);
		if(val.equals(Value))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
}
