package proj1;


	
	
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.Capabilities;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;
	public class BrwIncognt{
	   public static void main(String[] args) {
	      //System.setProperty("webdriver.chrome.driver",
	     // "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		  
	      // configure options parameter to Chrome driver
	      ChromeOptions o= new ChromeOptions();
	      // add Incognito parameter
	      o.addArguments("--incognito");
	      
	      // DesiredCapabilities object
	      DesiredCapabilities c = DesiredCapabilities.chrome();
	      //set capability to browser
	      c.setCapability(ChromeOptions.CAPABILITY, o);
	      WebDriver driver = new ChromeDriver(o);
	      driver.get("https://www.tutorialspoint.com/index.htm ");
	   }
	}


