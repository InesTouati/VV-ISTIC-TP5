import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WikipediaWalker {

    public static void main(String[] args) throws IOException {
       System.setProperty("webdriver.chrome.driver", "/home/ness/Documents/VV/tp5/VV-ISTIC-TP5/code/ex1/chromedriver_111");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

        List<String> visitedPages = new ArrayList<String>();
        File screenFile;

        for (int i = 0; i < 10; i++) {
            List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));

            WebElement randomLink = links.get(new Random().nextInt(links.size()));
            driver.get(randomLink.getAttribute("href"));

            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            visitedPages.add(driver.getCurrentUrl());

            screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenFile, new File("screens/screenshot_"+ i +".png"));
        }

        driver.quit();
    }

}
