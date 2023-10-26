package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class CheckDropMenu extends UserHomePage {

    /**
     * Поиск всех локаторов.
     */

    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTableRow;

    @FindBy(xpath = "//tr[@class='odd'][2]")
    public WebElement firstTableRow2;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public WebElement checkBoxClick;


    @FindBy(xpath = "//div[@id='checkbox-items']")
    public WebElement clickMassAction;

    @FindBy(xpath = "//a[@data-mode='activate']")
    public WebElement activate;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement activateText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Activate')]/../a[2]")
    public WebElement activateCanselBtn;

    @FindBy(xpath = "//a[@data-mode='deactivate']")
    public WebElement deactivate;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement deactivateText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Deactivate')]/../a[2]")
    public WebElement deactivateCanselBtn;

    @FindBy(xpath = "//a[@data-mode='delete']")
    public WebElement delete;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement deleteText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Delete')]/../a[2]")
    public WebElement deleteCanselBtn;

    @FindBy(xpath = "//a[@data-mode='branch-add']")
    public WebElement branchAdd;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement branchAddText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Add')]/../a[2]")
    public WebElement branchAddCanselBtn;

    @FindBy(xpath = "//a[@data-mode='branch-remove']")
    public WebElement branchRemove;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement branchRemoveText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Remove')]/../a[2]")
    public WebElement branchRemoveCanselBtn;

    @FindBy(xpath = "//a[@data-mode='group-add']")
    public WebElement addGroup;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement addGroupText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Add')]/../a[2]")
    public WebElement addGroupCanselBtn;

    @FindBy(xpath = "//a[@data-mode='group-remove']")
    public WebElement removeGroup;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement removeGroupText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Remove')]/../a[2]")
    public WebElement removeGroupCanselBtn;

    @FindBy(xpath = "//a[@data-mode='message']")
    public WebElement clickMessage;

    @FindBy(xpath = "//h3[text()='Send message']")
    public WebElement sendMessageText;

    @FindBy(xpath = "//div[@id='tl-users-send-message-modal']/div/h3/../a")
    public WebElement clickSendMessageCanselBtn;

    /**
     * переход на checkbox пользователя для вызова dropMenu
     */
    @FindBy(xpath = "//td/input[@type='checkbox']")
    public List<WebElement> allCheckBoxClick;
    /**
     * переход в dropMenu и вызов вкладок по порядку каждого элемента
     * вывод текста в всплывающем окне для дальнейшего сравнения
     */

    public String actualTextActivate;
    public String actualTextDeactivate;
    public String actualTextDelete;
    public String actualTextAddBranch;
    public String actualTextRemoveBranch;
    public String actualTextAddGroup;
    public String actualTextRemoveGroup;
    public String actualTextSendMessage;
    /**
     * проверяет на кликабельность по очереди все checkBox
     */
    public boolean isCheckt;
    /**
     * проверяет все элементы содержашиеся в Mass action
     */
    @FindBy(xpath = "//a[@class='massaction']")
    public List<WebElement> allListMassAction;
    public String visiblText = "[Activate, Deactivate, Delete, Add to branch, " +
            "Remove from branch, Add to group, Remove from group, Send message]";
    public List<String> actualTextList = new ArrayList<>();

    public CheckDropMenu checkMenu() {
        elementActions.moveToElement(firstTableRow);
        elementActions.clickElement(checkBoxClick);
        return this;
    }

    public CheckDropMenu clickActivate() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(activate);
        actualTextActivate = (activateText.getAttribute("innerText"));
        elementActions.clickElement(activateCanselBtn);
        return this;
    }

    public CheckDropMenu clickDeactivate() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(deactivate);
        actualTextDeactivate = (deactivateText.getAttribute("innerText"));
        elementActions.clickElement(deactivateCanselBtn);

        return this;
    }

    public CheckDropMenu clickDelete() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(delete);
        actualTextDelete = (deleteText.getAttribute("innerText"));
        elementActions.clickElement(deleteCanselBtn);
        return this;
    }

    public CheckDropMenu clickBranchAdd() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(branchAdd);
        actualTextAddBranch = (branchAddText.getAttribute("innerText"));
        elementActions.clickElement(branchAddCanselBtn);
        return this;
    }

    public CheckDropMenu clickBranchRemove() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(branchRemove);
        actualTextRemoveBranch = (branchRemoveText.getAttribute("innerText"));
        elementActions.clickElement(branchRemoveCanselBtn);
        return this;
    }

    public CheckDropMenu clickAddGroup() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(addGroup);
        actualTextAddGroup = (addGroupText.getAttribute("innerText"));
        elementActions.clickElement(addGroupCanselBtn);
        return this;
    }

    public CheckDropMenu clickRemoveGroup() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(removeGroup);
        actualTextRemoveGroup = (removeGroupText.getAttribute("innerText"));
        elementActions.clickElement(removeGroupCanselBtn);
        return this;
    }

    public CheckDropMenu clickMessage() {
        elementActions.pause(500);
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(clickMessage);
        actualTextSendMessage = (sendMessageText.getAttribute("innerText"));
        elementActions.clickElement(clickSendMessageCanselBtn);
        return this;

    }

    public CheckDropMenu clickAllChecBox() {
        elementActions.moveToElement(firstTableRow);
        for (WebElement check : allCheckBoxClick) {
            if (check != null) {
                elementActions.clickElement(check);
                isCheckt = check.isSelected();
            }
        }
        return this;
    }

    public CheckDropMenu massActionsList() {
        elementActions.clickElement(clickMassAction);
        List<String> inputCase = new ArrayList<>();
        for (WebElement massAction : allListMassAction) {
            if (massAction != null) {
                String text = massAction.getText();
                inputCase.add(text);
                actualTextList = inputCase;
            }
        }
        elementActions.clickElement(activate);
        elementActions.clickElement(activateCanselBtn);
        return this;
    }

    @FindBy(xpath = "//i[@class='icon-filter']")
    public WebElement clickFilterButton;

    @FindBy(xpath = "//a[@class='tl-cursor-pointer']")
    public WebElement clickActiveToFilter;

    @FindBy(xpath = "(//i[@class='icon-filter'])[1]")
    public WebElement onClickToActiveFilter;

    public CheckDropMenu activeUserFilter() {
        elementActions.pause(500);
        elementActions.clickElement(clickFilterButton);
        elementActions.clickElement(clickActiveToFilter);
        return this;
    }

    public CheckDropMenu onClickActivFilter() {
        elementActions.clickElement(onClickToActiveFilter);
        return this;
    }

    /**
     * Выводит список всех  Activ User в основной таблице
     */

    @FindBy(xpath = "//div[@id='tl-users-grid_wrapper']//tbody/tr/td[2]")
    public List<WebElement> allUsersInTable;

    public List<String> usersListInTable;

    public List<String> getAllUsersInTable() {
        usersListInTable = new ArrayList<>();
        for (WebElement el : allUsersInTable) {
            String userText = el.getText();
            if (!userText.contains("INACTIVE")) {
                usersListInTable.add(userText);
                {
                }
            }
        }
        return usersListInTable;
    }

    /**
     * Выводит список всех   User в таблице ActivFiltr
     */

    @FindBy(xpath = "//div[@id='tl-users-grid_wrapper']//tbody/tr/td[2]")
    public List<WebElement> allUsersInTableToActiv;

    public List<String> usersInTableToActive;

    public List<String> getFilterUsersInTable() {
        usersInTableToActive = new ArrayList<>();
        for (WebElement el : allUsersInTableToActiv) {
            String userText = el.getText();
            usersInTableToActive.add(userText);
        }
        return usersListInTable;
    }
}
