package assesment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Feedback {

	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://ditaxpresso.com/#/contactus");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//a[contains(text(),'Contact Us ')")).click();
     
     WebElement Fname=driver.findElement(By.xpath("//input[@name='First Name']"));
     Fname.clear();
     Fname.sendKeys("Akshata");
     WebElement Lname=driver.findElement(By.xpath("//input[@name='Last Name']"));
     Lname.clear();
     Lname.sendKeys("Mali");
     List<WebElement>Countrycode=driver.findElements(By.xpath("//select[@name]"));
    	for (WebElement code:Countrycode) {
    		if (code.getText().equalsIgnoreCase("India (+91)")) {
    			code.click();
    			
    		}
     }
     WebElement phoneNo=driver.findElement(By.xpath("//input[@name='Phone']"));
     phoneNo.clear();
     phoneNo.sendKeys("7040080820");
     WebElement Email=driver.findElement(By.xpath("//input[@name='Email']"));
     Email.clear();
     Email.sendKeys("akshatamali80mail.com");
     WebElement Subject=driver.findElement(By.xpath("//input[@name='Title']"));
     Subject.clear();
     Subject.sendKeys("Assesment");
     WebElement Requriment=driver.findElement(By.xpath("//textarea[@name='Description']"));
     Requriment.clear();
     Requriment.sendKeys("For QA Role");
     WebElement SubmitBtn=driver.findElement(By.xpath("//input[@id='formsubmit']"));
     SubmitBtn.click();
     
     
     
     
	}

}
