package course.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase{

  @Test
  public void testGroupDeleting() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getNavigationHelper().goToGroupPage();
  }
}
