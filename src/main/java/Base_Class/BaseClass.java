package Base_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	public static String value;

	// Launch Browser
	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\suren\\eclipse-workspace\\MavenBd\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Chrome\\\\chromedriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;

	}

	// GetUrl
	public static WebDriver get(String url) {
		driver.get(url);
		return driver;
	}

	// Get Title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// Get CurrentUrl
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// Get Text
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// Get PageSource
	public static void getPageSource() {
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	// Get Attribute
	public static void getOnAttribute(WebElement getattribute, String attributevalue) {
		String attribute = getattribute.getAttribute(attributevalue);
		System.out.println(attribute);
	}

	// Get Options
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
	}

	// Get AllSelected Options
	public static void getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			System.out.println(allselected.getText());
		}
	}

	// Get FirstSelected Options
	public static void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	// Alert
	public static void alertFunctions(WebElement element, String type, String input) {
		if (type.equalsIgnoreCase("accept")) {
			element.click();
			driver.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			element.click();
			driver.switchTo().alert().dismiss();
		} else if (type.equalsIgnoreCase("sendkey")) {
			element.click();
			driver.switchTo().alert().sendKeys(input);
			driver.switchTo().alert().accept();
		}

	}

	// Is Enabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// Is Displayed
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	// Is Selected
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	// Is Multiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// Clear
	public static void clearOnText(WebElement element) {
		element.clear();
	}

	// Click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// Send keys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	// Drop Down
	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("selectByIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		} else if (type.equalsIgnoreCase("selectByVisibletext")) {
			s.selectByVisibleText(value);
		}
	}

	// Close
	public static WebDriver close() {
		driver.close();
		return driver;
	}

	// Quit
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

	// Take Screenshot
	public static WebDriver getScreenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);

		return driver;

	}

	// Actions
	public static void actionsOnElement(WebElement element, String type) {
		Actions act = new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			act.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			act.doubleClick().build().perform();
		} else if (type.equalsIgnoreCase("clickandhold")) {
			act.clickAndHold(element).build().perform();
		} else if (type.equalsIgnoreCase("moveToElement")) {
			act.moveToElement(element).build().perform();
		}

	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}

	// Robot
	public static void keyboard(WebElement element) throws AWTException {
		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// Frames
	// index
	public static void framesOnIndex(int index) {
		driver.switchTo().frame(index);
	}

	// id/name
	public static void FramesOnIdName(String frametype, String idornamevalue) {
		if (frametype.equalsIgnoreCase("id")) {
			driver.switchTo().frame(idornamevalue);
		} else if (frametype.equalsIgnoreCase("Name")) {
			driver.switchTo().frame(idornamevalue);
		}
	}

	public static void framesOnWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void closeTheFrame() {
		driver.switchTo().defaultContent();
	}

	// window Handling
	// Window Handle
	public static void getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);

	}

	// Window Handles
	public static void getWindowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(string);
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
	}

	// Get Count Number Of The Windows
	public void getSizeOfWindow() {
		int size = driver.getWindowHandles().size();
		System.out.println("Count Of Window:" + size);
	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	// Scroll Up and Down
	public static void scroll_Up_And_Down(String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value);
	}

	public static void scrollFunction(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// Navigate Methods
	// Navigate To
	public static WebDriver navigateTo(String value) {
		driver.navigate().to(value);
		return driver;
	}

	// Navigate Back
	public static void navigateBack() {
		driver.navigate().back();
	}

	// Navigate Forward
	public static void navigateForward() {
		driver.navigate().forward();
	}

	// Navigate Refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	// wait
	public static void implicit_Wait(int number) {
		driver.manage().timeouts().implicitlyWait(number, TimeUnit.SECONDS);
	}

	public static void explicit_Wait(WebElement element, int number) {
		WebDriverWait wait = new WebDriverWait(driver, number);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Data Driven
	public static String read_Data(String path,int sheet_Index, int row_Index, int cell_Index) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(sheet_Index);
		Row row = sheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			 value = cell.getStringCellValue();
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			 value = String.valueOf(data);
		}
		return value;
	}

}
