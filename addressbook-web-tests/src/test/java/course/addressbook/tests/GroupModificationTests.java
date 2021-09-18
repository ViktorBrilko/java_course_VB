package course.addressbook.tests;

import course.addressbook.models.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test11", "test11", "test11"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGroupPage();
    }
}
