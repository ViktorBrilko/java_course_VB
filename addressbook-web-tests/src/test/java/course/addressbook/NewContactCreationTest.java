package course.addressbook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class NewContactCreationTest {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testNewContactCreation() throws Exception {
    wd.get("http://localhost/addressbook/");
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys("admin");
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys("secret");
    wd.findElement(By.xpath("//input[@value='Login']")).click();
    wd.findElement(By.linkText("add new")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys("name");
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys("middle name");
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys("last name");
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys("nickname");
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys("title");
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys("company");
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys("address");
    wd.findElement(By.name("home")).clear();
    wd.findElement(By.name("home")).sendKeys("home");
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys("mobile");
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys("work");
    wd.findElement(By.name("fax")).clear();
    wd.findElement(By.name("fax")).sendKeys("fax");
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys("email1");
    wd.findElement(By.name("email2")).clear();
    wd.findElement(By.name("email2")).sendKeys("email2");
    wd.findElement(By.name("email3")).clear();
    wd.findElement(By.name("email3")).sendKeys("email3");
    wd.findElement(By.name("homepage")).clear();
    wd.findElement(By.name("homepage")).sendKeys("homepage");
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys("address2");
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys("home2");
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys("notes");
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    wd.findElement(By.linkText("home")).click();
    wd.findElement(By.linkText("Logout")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
    }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
