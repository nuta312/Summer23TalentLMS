package com.digital.userCategoryTest;

import com.digital.pages.usersPage.components.AddFile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFileTest extends UserHomePageTest{

    @Test
    void addFile(){
        AddFile addFile=new AddFile();
        addFile.clickPersonBtn();
        addFile.clickFileBtn();
        addFile.clickCloudBtn();
        addFile.loadImageBtn();
    }
}
