package course.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTest extends TestBase{

    @Test
    public void testContactDeleting() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getNavigationHelper().goToHomePage();
    }
}
