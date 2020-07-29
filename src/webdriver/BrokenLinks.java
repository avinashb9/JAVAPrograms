package webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		//Naviates to google home page and identifies all links
		//validates the links status code
		
		String sChromeDriverPath = System.getProperty("user.dir")+"//BrowserDrivers//chromedriver_win32_V84//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", sChromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> linkEle = driver.findElements(By.tagName("a"));
		for(WebElement ele:linkEle){
			String url = ele.getAttribute("href");
			System.out.println("URL: "+url);
			System.out.println("TEXT:"+ele.getText());
			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responseCode = huc.getResponseCode();
				if(responseCode > 400){
					System.out.println("URL IS BROKEN");
				}else
					System.out.println("URL IS VALID");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.close();
	}

}
