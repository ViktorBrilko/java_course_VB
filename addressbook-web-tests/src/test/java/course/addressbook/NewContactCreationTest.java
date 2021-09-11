package course.addressbook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;

public class NewContactCreationTest extends TestBase{

  @Test
  public void testNewContactCreation() throws Exception {
    initContactCreation();
    fillContactForm(new ContactData("name", "middle name", "last name", "nickname", "title", "company", "address", "home", "mobile", "work", "fax", "email1", "email2", "email3", "homepage", "address2", "home2", "notes"));
    submitContactCreation();
    goToHomePage();
  }

}
