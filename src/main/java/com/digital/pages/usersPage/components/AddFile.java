package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.FilesPage;
import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFile extends UserHomePage {
    @FindBy(xpath = "//a[@href=\"https://nbu111.talentlms.com/user/create")
    public  WebElement clickUser;
    @FindBy(xpath="(//span[text()='J. Torphy'])[2]")
    public WebElement clickPerson;
   //aida
  @FindBy(xpath = "//li/a[contains(text(),'Files')]")
   public WebElement clickFiles;
   @FindBy(xpath = "//i[@class='icon-upload-cloud icon-grid']")
   public WebElement clickCloud;
   @FindBy(xpath = "// span[@title='images.jpeg']")
   public WebElement clickloadImage;

 public AddFile clickPersonBtn() {
     elementActions.clickElement(clickPerson);
     return this;
  }
  public AddFile clickFileBtn(){
      elementActions.clickElement(clickFiles);
      return this;
 }
 public AddFile clickCloudBtn(){
     elementActions.clickElement(clickCloud);
     return this;
 }
 public AddFile loadImageBtn(){
     elementActions.clickElement(clickloadImage);
     return this;
 }
}