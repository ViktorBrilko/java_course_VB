package course.addressbook;

import org.testng.annotations.*;

public class NewGroupCreateTest extends TestBase{

  @Test
  public void testNewGroupCreate() throws Exception {
    goToGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
  }

}
