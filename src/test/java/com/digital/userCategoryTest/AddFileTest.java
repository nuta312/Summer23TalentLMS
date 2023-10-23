package com.digital.userCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFileTest extends UserHomePageTest{

    @Test
    void addFile(){
        addFile.clickPersonBtn();
        addFile.clickFileBtn();
        addFile.clickCloudBtn();
        addFile.loadImageBtn();
    }
}
