package course.addressbook.tests;

import course.addressbook.models.GroupData;
import org.testng.annotations.*;

public class NewGroupCreationTest extends TestBase{

  @Test
  public void testNewGroupCreate() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, null));
    app.getGroupHelper().submitGroupCreation();
  }

}
