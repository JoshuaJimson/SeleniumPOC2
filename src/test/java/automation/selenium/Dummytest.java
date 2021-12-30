package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dummytest {
	
	@Test

	public void mainfun() {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\ChromeEXE96\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.cleartrip.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[contains(@class,'homeCalender')]")).click();
//		driver.findElement(By.xpath("//*[contains(text(),'January 2022')]/../..//div[contains(text(),10)]")).click();
		
		String[] names= {"Joshuaok","Jubyom","Jimsonok","Jiljoom"};
		String xpath="Joshua";
		String finalXpath=null;
		String[] target= {"o","u"};
		String[] replacement= {"c","x"};
		
		for(int i=0;i<target.length;i++)
		{
			finalXpath=xpath.replace(target[i], replacement[i]);
			xpath=finalXpath;
		}
		System.out.println(xpath);
		xpathfun(target,replacement,finalXpath,xpath);
	}
	
	@Test
	
	public void xpathfun(String[] target,String[]  replacement, String finalXpath, String xpath) {
		for(int i=0;i<target.length;i++)
		{
			finalXpath=xpath.replace(target[i], replacement[i]);
			xpath=finalXpath;
		}
		System.out.println(xpath);
		
	}
	

}
