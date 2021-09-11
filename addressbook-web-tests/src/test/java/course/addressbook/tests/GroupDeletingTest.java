package course.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase{

  @Test
  public void testGroupDeleting() throws Exception {
    app.goToGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.goToGroupPage();
  }
}
