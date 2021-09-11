package course.addressbook;

import org.testng.annotations.Test;

public class GroupDeletingTest extends TestBase{

  @Test
  public void testGroupDeleting() throws Exception {
    goToGroupPage();
    selectGroup();
    deleteSelectedGroups();
    goToGroupPage();
  }
}
