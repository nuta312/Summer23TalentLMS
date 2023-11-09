package com.digital.userCategoryTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class UserTableTest extends UserHomePageTest {

    @Test(priority = 1,groups = "RegressionTests")
    void checkOpenModal() {
        userTable.clickToDeleteBtn();
        Assert.assertTrue(userTable.deleteModal.isEnabled());
    }

    @Test(priority = 2,groups = "SmokeTests")
    void checkTextInModal() {
        if(userTable.choosingUserToDelete.size() != 0){
        elementActions.pause(2000);
        Assert.assertTrue(userTable.modalHeaderTitle.getText().contains("Delete User?"));
        Assert.assertTrue(userTable.modalBodyText.getText().contains("Are you sure you want to delete the user "));
        Assert.assertTrue(userTable.cancelModalBtn.getText().contains("Cancel"));}
    }

    @Test(priority = 3, description = "this test checks if the user is deleted from the table or if the delete button works.",groups = "SmokeTests")
    void checkForDeleteUserToTable() {
        if (userTable.choosingUserToDelete.size() != 0){
        userTable.deleteModalBtn.click();
        String expectedString = userTable.userEmail;
        boolean isContained = false;
        for (String user : userTable.getAllUsersInTable()) {
            if (user.toLowerCase().contains(expectedString)) {
                isContained = true;
                break;
            }
        }
        Assert.assertFalse(isContained);};
    }


    @Test(priority = 4, description = "This test checks if user data is sorted by email after clicking on the email tab.",groups = "RegressionTests")
    void testSortUserEmailAfterClickToEmailTab() {
        userTable.clickToEmailTab();
        elementActions.pause(3000);
        List<String> expectedSort = new LinkedList<>(userTable.listOfUserEmailText);
        Collections.sort(expectedSort);
        List<String> actual = new ArrayList<>();
        for (WebElement el : userTable.listOfUserEmail) {
            actual.add(el.getText());
        }
        elementActions.pause(3000);
        Assert.assertEquals(expectedSort, actual);
    }

    @Test(priority = 5, description = "This test checks if user data is sorted by user type after clicking on the usertype tab.",groups = "RegressionTests")
    void testUserTypeSorting() {
        userTable.clickToUserTypeTab();
        elementActions.pause(3000);
        Comparator<String> userTypeComparator = (s1, s2) -> {
            if (s1.equals("SuperAdmin")) {
                return -1; // "SuperAdmin" всегда впереди
            } else if (s2.equals("SuperAdmin")) {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        };
        elementActions.pause(3000);
        List<String> expectedOrder = new ArrayList<>(userTable.listOfUserTypeText);
        Collections.sort(expectedOrder, userTypeComparator);
        List<String> actual = new ArrayList<>();
        for (WebElement el : userTable.listOfUserType) {
            actual.add(el.getText());
        }
        Assert.assertEquals(expectedOrder, actual, "The list is not sorted correctly");
    }

    @Test(priority = 6, description = "This test checks reports btn in user table",groups = "RegressionTests")
    void checkTable() {
        if(userTable.choosingUserToDelete.size()!=0){
        userTable.clickToReportsBtn();
        Assert.assertEquals(userTable.textSuperAdmin.getAttribute("innerText"), "SUPERADMIN");
        userTable.elementActions.navigateBack();};
    }


}
