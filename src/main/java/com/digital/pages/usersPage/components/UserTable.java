package com.digital.pages.usersPage.components;

import com.digital.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class UserTable extends BasePage {
    @FindBy(xpath = "//tr[2]/td[2]/a/span/../../..//i[@title='Delete']")
    public WebElement deleteBtn;
    @FindBy(xpath = "//h3[@class='tl-modal-header']")
    public WebElement modalHeaderTitle;
    @FindBy(xpath = "//div[@id='tl-confirm']")
    public WebElement deleteModal;
    @FindBy(xpath = "//p[@id='tl-modal-body']")
    public WebElement modalBodyText;

    @FindBy(xpath = "//tr[2]/td[2]/a/span")
    public WebElement choosingUserToDelete;

    public String userFirstName;

    @FindBy(xpath = "//div[@id='tl-confirm']//a[@id='tl-confirm-submit']")
    public WebElement deleteModalBtn;
    @FindBy(xpath = "//div[@id='tl-users-grid_wrapper']//tbody/tr")
    public List<WebElement> allUsersInTable;
    public List<String> usersListInTable;
    @FindBy(xpath = "//div[@id='tl-confirm']//a[text()='Cancel']")
    public WebElement cancelModalBtn;
    public UserTable clickToDeleteBtn(){
        elementActions.moveToElement(choosingUserToDelete);
        userFirstName = choosingUserToDelete.getText();
        elementActions.clickElement(deleteBtn);
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

}
