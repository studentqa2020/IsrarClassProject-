package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {  //Compile time Polymorphism, Method overloading, static binding 
	
	public void getcolor(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", element);

	}
	
	public void getcolor(WebDriver driver,WebElement element, String color) {
		JavascriptExecutor js = (JavascriptExecutor) driver; // type casting polymorphism
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border:6px solid "+color+";');", element);

	}
	
	public void getsalary() {

		// code
	}

	public static void getsalary(int a) {

		// code
	}
	
	

}
