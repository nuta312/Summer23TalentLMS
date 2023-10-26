package com.digital.pages.usersPage;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage {

    @FindBy(xpath = "//tr[@class='odd']")
    public WebElement clickTableRowInFile;
    @FindBy(xpath = "//tr[.//span[@title='as.jpg']]//i[@title='Edit']")
    public WebElement clickPreviewInTableFile;


    @FindBy(xpath = "//tr[.//span[@title='as.jpg']]")
    public WebElement asFile;

    @FindBy(xpath = "//span[@title='as.jpg']")
    public WebElement resultPictureName;
    public String pictureNameText;


    @FindBy(xpath = "//div[@class='modal-header']//h3")
    public WebElement editModalHeader;

    @FindBy(xpath = "(//span[text()='J. Torphy'])[2]")
    public WebElement clickPerson;
    //aida
    @FindBy(xpath = "//li/a[contains(text(),'Files')]")
    public WebElement clickFiles;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement inputForUploadPicture;

    public String newUploadFile;

    @FindBy(xpath = "//span[@class='tl-filename']//span")
    public List<WebElement> allFilesInTable;

    @FindBy(xpath = "//input[@id='renameFileName']")
    public WebElement renameFileName;

    @FindBy(xpath = "//input[@value='Update']")
    public WebElement updateInput;


    public FilesPage clickPersonBtn() {
        elementActions.clickElement(clickPerson);
        return this;
    }

    public FilesPage clickFileBtn() {
        elementActions.clickElement(clickFiles);
        return this;
    }

    public FilesPage clickCloudBtn() {
        elementActions.pause(2000);
        newUploadFile = "C:\\Users\\Asus\\Pictures\\as.jpg";
        elementActions.makeElementVisible(inputForUploadPicture);
        elementActions.writeText(inputForUploadPicture, newUploadFile);
        return this;
    }

    public FilesPage clickTable1() {
        elementActions.moveToElement(clickTableRowInFile).clickByJS(clickTableRowInFile);
        return this;
    }

    public FilesPage clickPreview() {
        pause();
        elementActions.moveToElement(asFile).clickElement(clickPreviewInTableFile);
        pictureNameText = resultPictureName.getAttribute("innerText");
        return this;
    }

    public FilesPage pause() {
        elementActions.pause(3000);
        return this;
    }

    public FilesPage clickToRenameInputAndEdit() {
        elementActions.clickElement(renameFileName);
        renameFileName.clear();
        elementActions.writeText(renameFileName, "kitty.jpg");
        elementActions.clickElement(updateInput);
        return this;
    }


}
