package course.addressbook.tests;

import course.addressbook.models.ContactData;
import org.testng.annotations.*;

public class NewContactCreationTest extends TestBase{

  @Test
  public void testNewContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("name", "middle name", "last name", "nickname", "title", "company", "address", "home", "mobile", "work", "fax", "email1", "email2", "email3", "homepage", "address2", "home2", "notes"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToHomePage();
  }

}
