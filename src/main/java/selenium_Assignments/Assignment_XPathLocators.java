package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_XPathLocators {
	
	String url = "https://www.amazon.in/s?k=iphone&crid=STAOB424I4NW&sprefix=iphone%2Caps%2C294&ref=nb_sb_noss_2";
	
	WebDriver driver =  new ChromeDriver();
	
	
	WebElement Iphone15_Black_Image = driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (128 GB) - Black']"));
	WebElement IPhone15_Black_Prime = driver.findElement(By.xpath("//h2[@aria-label='Apple iPhone 15 (128 GB) - Black']/ancestor::div[@data-cy='title-recipe']/following-sibling::div//i[contains(@aria-label,'Prime')]"));
	WebElement Iphone15_Black_AddToCart = driver.findElement(By.xpath("//h2[@aria-label='Apple iPhone 15 (128 GB) - Black']/ancestor::div[@data-cy='title-recipe']/following-sibling::div//button[text()='Add to cart']"));
	WebElement IPhone16_128GB_Ultramarine= driver.findElement(By.xpath("//h2[contains(@aria-label,'iPhone 16 128 GB: 5G Mobile Phone') and contains(@aria-label,'Ultramarine')]/ancestor::div[@data-cy='title-recipe']/following-sibling::div[@class='puisg-row']//span[@class='a-price']//span[@class='a-offscreen']"));
	WebElement IPhone16_128GB_Ultramarine_PurpleColor= driver.findElement(By.xpath("//h2[contains(@aria-label,'iPhone 16 128 GB: 5G Mobile Phone') and contains(@aria-label,'Ultramarine')]/ancestor::div[@data-cy='title-recipe']/following-sibling::div[@class='puisg-row']//div//span[contains(@style,'DE98C4')]"));
	WebElement IPhone16_128GB_Ultramarine_Image= driver.findElement(By.xpath("//img[contains(@alt,'iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Ultra...')]"));
	
	

}
