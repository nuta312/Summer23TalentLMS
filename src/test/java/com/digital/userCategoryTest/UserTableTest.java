package com.digital.userCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class UserTableTest extends UserHomePageTest {

    @Test(priority = 1)
    void checkOpenModal() {
        userTable.clickToDeleteBtn();
        Assert.assertTrue(userTable.deleteModal.isEnabled());
    }

    @Test(priority = 2)
    void checkTextInModal() {
        Assert.assertTrue(userTable.modalHeaderTitle.getText().contains("Delete User?"));
        Assert.assertTrue(userTable.modalBodyText.getText().contains("Are you sure you want to delete the user "));
        Assert.assertTrue(userTable.deleteModalBtn.getText().contains("Delete"));
        Assert.assertTrue(userTable.cancelModalBtn.getText().contains("Cancel"));
    }

    @Test(priority = 3, description = "this test checks if the user is deleted from the table or if the delete button works.")
    void checkForDeleteUserToTable() {
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


    @Test(priority = 4, description = "This test checks if user data is sorted by email after clicking on the email tab.")
    void testSortUserEmailAfterClickToEmailTab() {
        userTable.clickToEmailTab();
        List<String> expectedSortedList = new ArrayList<>(userTable.listOfUserEmailText);
        Collections.sort(expectedSortedList);
        Assert.assertEquals(expectedSortedList, userTable.listOfUserEmailText);
    }

    @Test
    void testUserTypeSorting() {
        userTable.clickToUserTypeTab();
        HashSet<String> expectedOrder = new HashSet<>(userTable.listOfUserTypeText);
        System.out.println(expectedOrder);
        System.out.println(userTable.listOfUserTypeText);
        Assert.assertEquals(expectedOrder, userTable.listOfUserTypeText, "The list is not sorted correctly");
    }


}
