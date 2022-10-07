package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.properties.FileReaderManager;

import Base_Class.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition", monochrome = true, dryRun = false, strict = true, tags = ("@Smoketest,@Sanitytest"), plugin = {
		"html:Reports/HtmlReport", "pretty", "json:Reports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"

})

public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void open_Browser() throws IOException {
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getBrowser(browser);

	}

	@AfterClass
	public static void close_Browser() {

		driver.close();

	}
}
