import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class searchnamegoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Malak Lataifeh");
       driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
       List<WebElement> the_result = driver.findElements(By.className("LC20lb"));
       System.out.println(the_result.size());
       for(int i=0;i<the_result.size();i++) 
       {
    	   System.out.println(the_result.get(i).getText());
    	   
    	   
       }
      
	}

}
