package com.digital.pages.usersPage.components;

import com.digital.driver.Driver;
import com.digital.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class UserTable extends BasePage {

    @FindBy(xpath = "//h3[@class='tl-modal-header']")
    public WebElement modalHeaderTitle;
    @FindBy(xpath = "//div[@id='tl-confirm']")
    public WebElement deleteModal;
    @FindBy(xpath = "//p[@id='tl-modal-body']")
    public WebElement modalBodyText;

    @FindBy(xpath = "//div[@id='tl-confirm']//a[@id='tl-confirm-submit']")
    public WebElement deleteModalBtn;
    @FindBy(xpath = "//span[contains(text(), 'Type')]/../../td[2]/a/span/../../../td[3]/span")
    public List<WebElement> choosingUserToDelete;

    public String userEmail;

    @FindBy(xpath = "//div[@id='tl-users-grid_wrapper']//tbody/tr")
    public List<WebElement> allUsersInTable;
    public List<String> usersListInTable;
    @FindBy(xpath = "//div[@id='tl-confirm']//a[text()='Cancel']")
    public WebElement cancelModalBtn;

    @FindBy(xpath = "//th[text()='Email']")
    public WebElement emailTabInUserTable;
    @FindBy(xpath = "//th[text()='User type']")
    public WebElement userTypeTabInUserTable;

    @FindBy(xpath = "//span[contains(text(), '.com')]")
    public List<WebElement> listOfUserEmail;
    public List<String> listOfUserEmailText;

    public List<String> listOfUserTypeText;
    @FindBy(xpath = "//span[contains(text(), 'Type') or contains(text(), 'Admin')]")
    public List<WebElement> listOfUserType;

    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTable;

    @FindBy(xpath = "(//span[contains(text(),'Torphy')])[2]")
    public WebElement moveToBtn;

    @FindBy(xpath = "//span[contains(text(),'SuperAdmin')]/../../td[7]/div/div/i[1]")
    public WebElement repBtn;

    @FindBy(xpath = "//*[text()='SuperAdmin']")
    public WebElement textSuperAdmin;


    public UserTable clickToDeleteBtn() {
        if(choosingUserToDelete.size() != 0){
        int randomIndex = new Random().nextInt(choosingUserToDelete.size());
        WebElement randomLabel = choosingUserToDelete.get(randomIndex);
        elementActions.moveToElement(randomLabel);
        System.out.println(randomLabel.getText());
        userEmail = randomLabel.getText();
        elementActions.moveToElement(randomLabel);
        WebElement deleteBtn = findDeleteModalBtn(userEmail);
        elementActions.clickElement(deleteBtn);
        elementActions.pause(3000);};
        return this;
    }

    private WebElement findDeleteModalBtn(String userEmail) {
        return Driver.getDriver().findElement(By.xpath("//span[contains(text(), 'Type')]/../../td[2]/a/span/../../../td[3]/span[text()='" + userEmail + "']/../..//i[@title='Delete']"));

    }


    public List<String> getAllUsersInTable() {
        elementActions.pause(2000);
        usersListInTable = new ArrayList<>();
        for (WebElement el : allUsersInTable) {
            String userText = el.getText();
            usersListInTable.add(userText);
        }
        return usersListInTable;
    }

    public UserTable clickToEmailTab() {
        elementActions.pause(2000);
        listOfUserEmailText = new ArrayList<>();
        for (WebElement el : listOfUserEmail) {
            listOfUserEmailText.add(el.getText());
        }
        elementActions.clickElement(emailTabInUserTable);
        elementActions.pause(2000);
        return this;
    }

    public UserTable clickToUserTypeTab() {
        listOfUserTypeText = new LinkedList<>();
        for (WebElement el : listOfUserType) {
            listOfUserTypeText.add(el.getText());
        }
        elementActions.clickElement(userTypeTabInUserTable);
        elementActions.pause(2000);
        return this;
    }

    public UserTable clickToReportsBtn() {
        elementActions.moveToElement(moveToBtn).clickElement(repBtn);
        return this;
    }

}