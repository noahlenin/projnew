package proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bbb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/noahl/OneDrive/Desktop/Table.html");

		WebElement ele=driver.findElement(By.xpath("//span[text()='Name AA']/ancestor::tr"));
				String str=ele.getAttribute("rowindex");
				System.out.println(str);

	}

}
