import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import org.openqa.selenium.JavascriptExecutor;

public class scalableChallenge {
public static boolean album1, album2, album3, album4, album5, album6, message;
	public static void main(String[] args) throws InterruptedException {
    wikiPediaTestCase();

	}
@Test
public static void wikiPediaTestCase() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\julioc6x\\Documents\\Selenium\\Apps for Selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver objBrowser=new ChromeDriver();
Actions mouseActions=new Actions(objBrowser);
WebElement dropdownMonth, scrollUntilElement, hoverAlbum, hoverMessage;
JavascriptExecutor jsExecute=(JavascriptExecutor) objBrowser;
objBrowser.manage().window().maximize();
objBrowser.get("http://wikipedia.org/");
dropdownMonth=objBrowser.findElementById("searchLanguage");
Select month=new Select(dropdownMonth);	
month.selectByVisibleText("English");
objBrowser.findElementById("searchInput").sendKeys("Taylor Swift");
objBrowser.findElementByXPath("//*[@id=\"search-form\"]/fieldset/button").click();
Thread.sleep(2000);
scrollUntilElement=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/th");
jsExecute.executeScript("arguments[0].scrollIntoView();", scrollUntilElement);
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[1]/i/a").isDisplayed(), true);
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[2]/i/a").isDisplayed(), true);
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[3]/i/a").isDisplayed(), true);
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[4]/i/a").isDisplayed(), true);
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[5]/i/a").isDisplayed(), true);
hoverAlbum=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[6]/i/a");
Assert.assertEquals(objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[6]/i/a").isDisplayed(), true);
mouseActions.moveToElement(hoverAlbum).build().perform();
Thread.sleep(5000);
WebElement me=objBrowser.findElementByXPath("/html/body/div[8]/div/a/p");
String message=me.getText();
Assert.assertEquals(message, "Reputation is the sixth studio album by American singer and songwriter Taylor Swift. It was released on November 10, 2017, through Big Machine Records. The record was primarily produced by Jack Antonoff, Max Martin, Shellback and Swift herself, who also serves as the executive producer. Featured artists included on the album are English singer-songwriter Ed Sheeran and American rapper Future.");
Thread.sleep(4000);
objBrowser.close();
}


	
}


