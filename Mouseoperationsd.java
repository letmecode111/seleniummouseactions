package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.Apputils;

public class Mouseoperationsd  extends Apputils{

	public static void main(String[] args) {
		
	 utils.Apputils.launchapp("http://jqueryui.com");
	 driver.findElement(By.linkText("Droppable")).click();
	 
	 
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	 
		WebElement srcelement,trgetelement;
		srcelement=driver.findElement(By.id("draggable"));
		trgetelement= driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(srcelement, trgetelement);
		act.build().perform();
		
	

	}

}
