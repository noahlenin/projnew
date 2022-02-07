package proj1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dri=new ChromeDriver();
		dri.get("http://www.leafground.com/pages/Edit.html");
		String res=dri.findElement(By.xpath("//label[text()='Get default text enter"
				+ "ed']//following::input[1]")).getAttribute("value");
		System.out.println(res);
		
	}

}
