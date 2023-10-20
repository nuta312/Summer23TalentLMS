package com.digital.userCategoryTest;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserTableTest extends UserHomePageTest{

    @Test(priority = 1)
    void checkOpenModal(){
        userTable.clickToDeleteBtn();
        Assert.assertTrue(userTable.deleteModal.isEnabled());
    }

    @Test(priority = 2)
    void checkTextInModal(){
        Assert.assertTrue(userTable.modalHeaderTitle.getText().contains("Delete User?"));
        Assert.assertTrue(userTable.modalBodyText.getText().contains("Are you sure you want to delete the user "));
        Assert.assertTrue(userTable.deleteModalBtn.getText().contains("Delete"));
        Assert.assertTrue(userTable.cancelModalBtn.getText().contains("Cancel"));
    }
    @Test(priority = 3, description = "this test checks if the user is deleted from the table or if the delete button works.")
    void checkForAddingUserToTable() {
        userTable.deleteModalBtn.click();
        String expectedString = userTable.userFirstName;
        boolean isContained = false;
        for (String user : userTable.getAllUsersInTable()) {
            if (user.toLowerCase().contains(expectedString)) {
                isContained = true;
                break;
            }
        }
        Assert.assertFalse(isContained);
    }


}
