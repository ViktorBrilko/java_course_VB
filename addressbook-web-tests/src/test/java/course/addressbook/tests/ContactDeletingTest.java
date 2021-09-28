package course.addressbook.tests;

import course.addressbook.models.ContactData;
import org.testng.annotations.Test;

public class ContactDeletingTest extends TestBase {

    @Test
    public void testContactDeleting() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("name",
                    "middle name", "last name", "nickname", "title",
                    "company", "address", "home", "mobile", "work", "fax",
                    "email1", "email2", "email3", "homepage", "address2",
                    "home2", "notes", "test1"), true);
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().goToHomePage();
    }
}
