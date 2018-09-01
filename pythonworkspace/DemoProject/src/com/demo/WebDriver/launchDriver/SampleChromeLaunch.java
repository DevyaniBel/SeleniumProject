package com.demo.WebDriver.launchDriver;

import org.openqa.selenium.By;


public class SampleChromeLaunch {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chromeDriver","\\Grid\\chromedriver\\" );
		driver = new chromeDriver();
	}
}
