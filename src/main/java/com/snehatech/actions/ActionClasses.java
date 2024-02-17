package com.snehatech.actions;

import org.openqa.selenium.WebElement;

public class ActionClasses {
	
		public static void clickbutton(WebElement ele) {
			ele.click();
		}
		
		public static void sendtext(WebElement ele,String text) {
			ele.sendKeys(text);
		}
		public void waitTime(int time) {
			try {
				Thread.sleep(time*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


