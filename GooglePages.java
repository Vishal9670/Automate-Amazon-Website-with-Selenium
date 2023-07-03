package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\S I P\\Desktop\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://amazon.in");
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Wrist Watches");
        driver.findElement(By.className("nav-search-submit-text")).click();
        
        WebElement displayFilter = driver.findElement(By.linkText("Analogue"));
        displayFilter.click();
        
        WebElement brandsFilter = driver.findElement(By.linkText("Leather"));
        brandsFilter.click();
        
        WebElement brandFilter = driver.findElement(By.linkText("Titan"));
        brandFilter.click();
        
        WebElement discountFilter = driver.findElement(By.linkText("25% Off or more"));
        discountFilter.click();
        
       
        WebElement fifthElement = driver.findElement(By.cssSelector("li.s-result-item:nth-child(5) h2 a"));
        String fifthElementText = fifthElement.getText();
        
        System.out.println("Fifth Element: " + fifthElementText);
        
     
        driver.quit();
		
	}
	
}

		
