package course.addressbook.tests;

import course.addressbook.models.GroupData;
import org.testng.annotations.*;

public class NewGroupCreationTest extends TestBase{

  @Test
  public void testNewGroupCreate() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
  }

}
