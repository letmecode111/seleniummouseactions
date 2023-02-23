package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import utils.Apputils;

public class Mouseoperations  extends Apputils{

	public static void main(String[] args) {
		
	 utils.Apputils.launchapp("http://snapdeal.com");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.className("catText")));
		ac.build().perform();
		
		
		
	

	}

}
