package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.FilesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditFile extends FilesPage {
    //tanos
    @FindBy(xpath = "//*[@id=\"tl-admin-users\"]/div[1]/a")
    public WebElement clickUserFirst;
    @FindBy(xpath = "//tr[@class= 'odd']/td[2]/a")
    public WebElement UserNameClick;
    @FindBy(xpath = "//li/a[contains(text(),'Files')]")
    public WebElement findFilesWord;
    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement clickTableRowInFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//a[@title='Preview']" )
    public WebElement clickPreviewInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//a[@title='Download']" )
    public WebElement clickDownloadInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Edit']" )
    public WebElement clickEditInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Delete']" )
    public WebElement clickDeleteInTableFile;
    @FindBy(xpath = "//*[@id=preview_modal]/div[1]")
    public WebElement resultPictureName;
    @FindBy(xpath = "//*[@id=\"preview_modal\"]/div[1]/a")
    public WebElement close;
    @FindBy (id = "//*[@id=\"renameFileName\"]")
    public WebElement resultEditName;
    @FindBy(xpath = "//*[@id=\"show-tags\"]")
    public WebElement clickTagInSaidEdit;
    @FindBy(xpath = "//li[text()='Please enter 1 more character']")
    public WebElement someTagWriteInputEdit;
    @FindBy(id= "//*[@id=1319830802]")
    public WebElement clickUpdateBtmInputEdit;
    @FindBy(xpath = "//*[@id=\"tl-hide-rename-file-modal\"]")
    public WebElement clickCanselInputEdit;
    public  EditFile click1(){
        elementActions.clickElement(clickUserFirst);
        return this;
    }
    public EditFile clickName(){
        elementActions.clickElement(UserNameClick);
        return this;

    }
    public EditFile clickFile(){
        elementActions.clickElement(findFilesWord);
        return this;
    }
    public EditFile clickTable1() {
        elementActions.moveToElement(clickTableRowInFile).clickByJS(clickTableRowInFile);
        return this;
    }
    public String pictureNameText;
    public EditFile clickPreview() {
        elementActions.moveToElement(clickPreviewInTableFile).clickElement(clickPreviewInTableFile);
        pictureNameText = resultPictureName.getAttribute("kitty.jpg");
//        Assert.assertTrue(resultPictureName.getText().contains("kitty.jpg"));
        elementActions.clickElement(close);
        return this;
    }
    public EditFile clickDownload(){
        elementActions.clickElement(clickDownloadInTableFile).navigateBack();
        return this;
    }
    public EditFile clickEdit() throws InterruptedException {
        Thread.sleep (2000);
        elementActions.moveToElement(clickEditInTableFile).waitElementToBeClickable(clickEditInTableFile);
        return this;
    }

}
