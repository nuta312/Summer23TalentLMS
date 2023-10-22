package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.FilesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditFile extends FilesPage {
    //tanos

    /**
     * Поиск всех локаторов.
     */

    @FindBy(xpath = "//*[@id=\"tl-admin-users\"]/div[1]/a")
    public WebElement clickUserFirst;
    @FindBy(xpath = "(//span[text()='J. Torphy'])[2]")
    public WebElement UserNameClick;
    @FindBy(xpath = "//li/a[contains(text(),'Files')]")
    public WebElement findFilesWord;
    @FindBy(xpath = "//tr[@class='odd']")//tr[@class='odd']
    public WebElement clickTableRowInFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//a[@title='Preview']" )
    public WebElement clickPreviewInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//a[@title='Download']" ) //a[contains(@title,'Download')])[2]
    public WebElement clickDownloadInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Edit']" )
    public WebElement clickEditInTableFile;
    @FindBy(xpath ="//tr[@class='odd'][1]//i[@title='Delete']" )
    public WebElement clickDeleteInTableFile;
    @FindBy(xpath = "//*[@id=\"preview_modal\"]/div[1]/h3")
    public WebElement resultPictureName;
    @FindBy(xpath = "//*[@id=\"preview_modal\"]/div[1]/a")
    public WebElement close;
    @FindBy (id = "//*[@id=\"renameFileName\"]")
    public WebElement resultEditName;
    @FindBy (id = "/html/body/img")
    public WebElement downloadPicture;
    @FindBy(xpath = "//*[@id=\"show-tags\"]")
    public WebElement clickTagInSaidEdit;
    @FindBy(xpath = "//li[text()='Please enter 1 more character']")
    public WebElement someTagWriteInputEdit;
    @FindBy(xpath = "//*[@id=\"tl-rename-file-modal\"]/div[2]")
    public WebElement navigateOnEditeWindow;
    @FindBy(xpath= "//input[@name='submit_rename_file']")
    public WebElement clickUpdateBtmInputEdit;
    @FindBy(xpath = "//*[@id=\"tl-rename-file-form\"]/div[4]")
    public WebElement nextUpdateAndCansel;
    @FindBy(id = "//*[@id=\"tl-modal-body\"]")
    public WebElement textInDelete;
    @FindBy(xpath = "//*[@id=\"tl-hide-rename-file-modal\"]")
    public WebElement clickCanselInputEdit;
    @FindBy(xpath = "//*[@id=\"tl-confirm-submit\"]")
    public WebElement deleteBTM;
    @FindBy (xpath = "//*[text()='Cancel']")
    public WebElement canselInDelete;

    /**
     * методы для вызова.
     */

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
        pictureNameText = resultPictureName.getAttribute("innerText");
        elementActions.clickElement(close);
        return this;
    }
    public EditFile clickDownload(){
        elementActions.pause(1000);
        elementActions.moveToElement(clickDownloadInTableFile).clickElement(clickDownloadInTableFile);
        elementActions.navigateBack();
        return this;
    }
    public  String editTexte;
    public EditFile clickEdit() {
        elementActions.pause(2000);
        elementActions.moveToElement(clickEditInTableFile).clickElement(clickEditInTableFile);
        editTexte = nextUpdateAndCansel.getAttribute("innerText");
        elementActions.clickElement(navigateOnEditeWindow);
        elementActions.clickElement(clickUpdateBtmInputEdit);
        return this;
    }
    public  String textUpdate;
    public EditFile deleteClick() {
        elementActions.pause(1000);
        elementActions.clickElement(clickDeleteInTableFile).navigateBack();
        textUpdate = textInDelete.getAttribute("innerText");
        return this;
    }


}
