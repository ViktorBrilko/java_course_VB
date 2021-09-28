package course.addressbook.tests;

import course.addressbook.models.GroupData;
import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase{

  @Test
  public void testGroupDeleting() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    if (! app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().goToGroupPage();
  }
}
