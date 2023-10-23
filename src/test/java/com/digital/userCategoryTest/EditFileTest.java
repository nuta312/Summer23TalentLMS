package com.digital.userCategoryTest;

import com.digital.pages.usersPage.components.EditFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditFileTest extends UserHomePageTest {
    @Test(priority = 1)
    void test1() {
        editFile.clickName();
        editFile.clickFile();
        editFile.clickTable1();
        editFile.clickPreview();
        Assert.assertEquals(editFile.pictureNameText, "kittytt.jpg");
        editFile.clickTable1();
        editFile.clickDownload();
        Assert.assertNull(editFile.editTexte, "Update");
        editFile.clickFile();
        editFile.clickTable1();
        editFile.clickEdit();
        Assert.assertEquals(editFile.editTexte, "Edit file");
        editFile.clickTable1();
        editFile.deleteClick();
        Assert.assertEquals(editFile.textUpdate, "Delete file?");
        editFile.closeDelete();
    }
}
