package course.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTest extends TestBase{

    @Test
    public void testContactDeleting() {
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.wd.switchTo().alert().accept();
        app.getNavigationHelper().goToHomePage();
    }
}
