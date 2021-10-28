package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rama {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DADY MOMMY\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().version("95.0.4638.54").setup();
       WebDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://demoqa.com/automation-practice-form");
		
		
		
		
		Thread.sleep(5000);
		chrome.close();
		chrome.quit();
		
		
	}

}
//chrome.manage().window().fullscreen();
//		String title = chrome.getTitle();
//		System.out.println(title);
//		String sourcecode = chrome.getPageSource();
//		System.out.println(sourcecode);
//		String url = chrome.getCurrentUrl();
//		System.out.println(url);
//		chrome.get("https://www.google.co.in/");
//		
//		chrome.navigate().back();
//		chrome.navigate().forward();
//		chrome.navigate().refresh();
//		
//		