package HA.TestAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Academics {
	public static void ExamTimeTable(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Year = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Academics Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[3]/ul/li[7]/a[text()='"+Option+"']")).click();
		Driver.info("Rules And Regulations Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//a[text()='"+Year+"']")).click();
		Driver.info("B.TECH  IV SEM  SUPPLY EXAM TIME TABLE Selected Successfully");
//		mouseOver("//div[@id='buttons']");
//		CMRLogin.driver.findElement(By.id("download")).click();
		}
	public static void RulesAndRegulations(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Select = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Academics Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[3]/ul/li[3]/a[text()='"+Option+"']")).click();
		Driver.info("Rules And Regulations Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//a[text()='"+Select+"']")).click();
		Driver.info("CMRCET Autonomous CBCS Academic Rules Selected Successfully");
		}
	public static void CourseAndIntake(String datafile, String dataset, String dataset2, String dataset3) throws Exception {
		String Tab = CMRLogin.getData(datafile, dataset);
		String Option = CMRLogin.getData(datafile, dataset2);
		String Value = CMRLogin.getData(datafile, dataset3);
		Common.mouseOver("//div[@id='bluemenu']//a[text()='"+Tab+"']");
		Driver.info("Academics Clicked Successfully");
		CMRLogin.driver.findElement(By.xpath("//div[@id='bluemenu']/ul[1]/li[3]/ul/li[1]/a[text()='"+Option+"']")).click();
		Driver.info("Course And Intake Clicked Successfully");
		String val = CMRLogin.driver.findElement(By.xpath("//div[@class='row page-row']/article/p")).getText();
		if(val.equals(Value))
			Driver.info("Data Comparision Success");
		else
		{
			Driver.info("Data Comparision Mismatch");
			Assert.fail();
		}
    }
}
