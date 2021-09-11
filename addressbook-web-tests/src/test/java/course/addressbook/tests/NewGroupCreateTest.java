package course.addressbook.tests;

import course.addressbook.models.GroupData;
import org.testng.annotations.*;

public class NewGroupCreateTest extends TestBase{

  @Test
  public void testNewGroupCreate() throws Exception {
    app.goToGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.submitGroupCreation();
  }

}
