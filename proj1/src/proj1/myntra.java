package proj1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dresses");
		Thread.sleep(1000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='desktop-group']//child::*"));
		System.out.println(ele.size());
		
	   String sug = "Dresses Girls";
	   for(WebElement e:ele) {
		   String s = e.getText();
		   if(s.equals(sug)) {
			   e.click();
			   break;
			   
		   }
		   
	   }
	}
}
