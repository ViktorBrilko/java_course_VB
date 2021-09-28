package course.addressbook.tests;

import course.addressbook.models.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{

    @Test
    public void testContactModification(){
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("name",
                    "middle name", "last name", "nickname", "title",
                    "company", "address", "home", "mobile", "work", "fax",
                    "email1", "email2", "email3", "homepage", "address2",
                    "home2", "notes", "test1"), true); }
        app.getContactHelper().goIntoContact();
        app.getContactHelper().fillContactForm(new ContactData("test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", "test", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().goToHomePage();
    }
}
