import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.JavascriptExecutor;

public class scalableChallenge {
public static boolean album1, album2, album3, album4, album5, album6;
	public static void main(String[] args) throws InterruptedException {
    wikiPediaTestCase();

	}

public static void wikiPediaTestCase() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\julioc6x\\Documents\\Selenium\\Apps for Selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver objBrowser=new ChromeDriver();
Actions mouseActions=new Actions(objBrowser);
WebElement dropdownMonth, scrollUntilElement, hoverAlbum;
JavascriptExecutor jsExecute=(JavascriptExecutor) objBrowser;
objBrowser.manage().window().maximize();
objBrowser.get("http://wikipedia.org/");
dropdownMonth=objBrowser.findElementById("searchLanguage");
Select month=new Select(dropdownMonth);	
month.selectByVisibleText("English");
objBrowser.findElementById("searchInput").sendKeys("Taylor Swift");
objBrowser.findElementByXPath("//*[@id=\"search-form\"]/fieldset/button").click();
Thread.sleep(3000);
scrollUntilElement=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/th");
jsExecute.executeScript("arguments[0].scrollIntoView();", scrollUntilElement);
album1=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[1]/i/a").isDisplayed();
album2=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[2]/i/a").isDisplayed();
album3=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[3]/i/a").isDisplayed();
album4=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[4]/i/a").isDisplayed();
album5=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[5]/i/a").isDisplayed();
album6=objBrowser.findElementByXPath("//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[6]/i/a").isDisplayed();
validateAlbums();
hoverAlbum=objBrowser.findElementByLinkText("Reputation");
mouseActions.moveToElement(hoverAlbum);
Thread.sleep(10000);
objBrowser.close();
}

public static void validateAlbums() {
if(album1){
System.out.println("The album Taylor Swift exists PASS");	
}else {
System.out.println("The album Taylor Swift does not exist");
}	
if(album2){
System.out.println("The album Fearless exists PASS");	
}else {
System.out.println("The album Fearless does not exist");
}
if(album3){
System.out.println("The album Speak Now exists PASS");	
}else {
System.out.println("The album Speak Now does not exist");
}
if(album4){
System.out.println("The album Red exists PASS");	
}else {
System.out.println("The album Red does not exist");
}
if(album5){
System.out.println("The album 1989 exists PASS");	
}else {
System.out.println("The album 1989 Swift does not exist");
}
if(album6){
System.out.println("The album Reputation Swift exists PASS");	
}else {
System.out.println("The album Reputation Swift does not exist");
}

	
}


}
