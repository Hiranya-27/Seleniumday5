package com.example.dayfour.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {
	public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"Mod114\"]/div/div/div/div/div[1]/div/div[1]/a/img")).click();
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(50000);
        driver.navigate().refresh();
    }
}
