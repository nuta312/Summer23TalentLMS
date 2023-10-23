package com.digital.userCategoryTest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class FilesPageTest extends UserHomePageTest {
    @BeforeClass
    void navigateToFilePage() {
        filePage.clickPersonBtn()
                .clickFileBtn();
    }

    @Test(priority = 2)
    void checkFilesTableOptions() {
        filePage.clickTable1();
        filePage.clickPreview();
        Assert.assertEquals(filePage.pictureNameText, "as.jpg");
        filePage.pause();
        Assert.assertTrue(filePage.editModalHeader.getText().contains("Edit file"));

    }

    @Test(priority = 1, description = "this test checks if the uploaded file appears in the table")
    void checkToUploadFile() {
        filePage.clickCloudBtn();
        filePage.pause();
        List<String> allFilesText = new ArrayList<>();
        for (WebElement el : filePage.allFilesInTable) {
            allFilesText.add(el.getText());
        }
        Assert.assertTrue(allFilesText.contains("as.jpg"));
    }


    @Test(priority = 3, description = "this test checks whether the edited file appears in the table")
    void checkEditFileInput() {
        filePage.clickToRenameInputAndEdit();
        filePage.pause();
        List<String> allFilesText = new ArrayList<>();
        for (WebElement el : filePage.allFilesInTable) {
            allFilesText.add(el.getText());
        }
        Assert.assertTrue(allFilesText.contains("kitty.jpg"));
    }


}
