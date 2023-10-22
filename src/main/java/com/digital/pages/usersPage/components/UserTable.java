package com.digital.pages.usersPage.components;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

public class UserTable extends BasePage {
    @FindBy(xpath = "//tr[2]/td[2]/a/span/../../..//i[@title='Delete']")
    public WebElement deleteBtn;
    @FindBy(xpath = "//h3[@class='tl-modal-header']")
    public WebElement modalHeaderTitle;
    @FindBy(xpath = "//div[@id='tl-confirm']")
    public WebElement deleteModal;
    @FindBy(xpath = "//p[@id='tl-modal-body']")
    public WebElement modalBodyText;

    @FindBy(xpath = "//span[contains(text(), 'Type')]/../../td[2]/a/span")
    public WebElement choosingUserToDelete;

    public String userFirstName;

    @FindBy(xpath = "//div[@id='tl-confirm']//a[@id='tl-confirm-submit']")
    public WebElement deleteModalBtn;
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

    public UserTable clickToDeleteBtn() {
        elementActions.moveToElement(choosingUserToDelete);
        userFirstName = choosingUserToDelete.getText();
        elementActions.clickElement(deleteBtn);
        elementActions.pause(3000);
        return this;
    }

    public List<String> getAllUsersInTable() {
        usersListInTable = new ArrayList<>();
        for (WebElement el : allUsersInTable) {
            String userText = el.getText();
            usersListInTable.add(userText);
        }
        return usersListInTable;
    }

    public UserTable clickToEmailTab() {
        listOfUserEmailText = new ArrayList<>();
        for (WebElement el : listOfUserEmail) {
            listOfUserEmailText.add(el.getText());
        }
        elementActions.clickElement(emailTabInUserTable);
        return this;
    }

    public UserTable clickToUserTypeTab() {
        listOfUserTypeText = new LinkedList<>();
        for (WebElement el : listOfUserType) {
            listOfUserTypeText.add(el.getText());
        }
        elementActions.clickElement(userTypeTabInUserTable);
        return this;
    }


}
