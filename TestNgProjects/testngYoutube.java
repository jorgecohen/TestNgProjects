package testngTraining.TestNgProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
public class testngYoutube {
    SeleniumBaseForTestngProjects base = new SeleniumBaseForTestngProjects();
    @Test
    public void login() throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.youtube.com/");
        WebElement loginBtn = driver.findElement(By.cssSelector("a[href*='ServiceLogin']"));
        loginBtn.click();
        WebElement userName = driver.findElement(By.name("identifier"));
        userName.click();
        userName.clear();
        userName.sendKeys("saharcohen1992");
        WebElement nextBtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        nextBtn.click();
        WebElement pw = driver.findElement(By.name("Passwd"));
        pw.click();
        pw.clear();
        pw.sendKeys("Sc1992!!");
        WebElement showPw = driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
        showPw.click();
        WebElement nextBtn2 = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        nextBtn2.click();
        sleep(3000); //To see the login result
        base.seleniumClose(driver);
    }
    @Test
    public void FirstSearch() throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.youtube.com/");
        WebElement searchField = driver.findElement(By.name("search_query"));
        WebElement searchBtn = driver.findElement(By.id("search-icon-legacy"));
            searchField.click();
            searchField.clear();
            searchField.sendKeys("תיק קטן");
            searchBtn.click();
            sleep(3000);//To see the login result
            base.seleniumClose(driver);
    }
    @Test
    public void PlayVideo () throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.youtube.com/");
        WebElement firstVideo = driver.findElement(By.id("video-title"));
        firstVideo.click();
        sleep(3000);//To see the login result
        base.seleniumClose(driver);
    }
    @Test
    public void SecondSearch() throws InterruptedException {
        ChromeDriver driver =  base.SeleniumInIt("https://www.youtube.com/");
        WebElement searchField = driver.findElement(By.name("search_query"));
        WebElement searchBtn = driver.findElement(By.id("search-icon-legacyyyyyy")); //To crush the test
        searchField.click();
        searchField.clear();
        searchField.sendKeys("עולם משוגע");
        searchBtn.click();
        sleep(3000);//To see the login result
        base.seleniumClose(driver);
    }
}
