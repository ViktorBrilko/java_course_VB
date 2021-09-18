package course.addressbook.tests;

import course.addressbook.models.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification(){
        app.getContactHelper().goIntoContact();
        app.getContactHelper().fillContactForm(new ContactData("test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test"));
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
