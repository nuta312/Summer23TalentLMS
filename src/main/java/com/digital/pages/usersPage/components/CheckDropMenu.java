package com.digital.pages.usersPage.components;

import com.digital.pages.usersPage.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckDropMenu extends UserHomePage {

    /**
     * Поиск всех локаторов.
     */

    @FindBy(xpath = "//tr[@class='odd'][1]")
    public WebElement firstTableRow;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public WebElement checkBoxClick;

    @FindBy(xpath = "//div[@id='checkbox-items']")
    public WebElement clickMassAction;

    @FindBy(xpath = "//a[@data-mode='activate']")
    public WebElement activate;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement activateText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Activate')]/../a[2]")
    public WebElement activateModalBtn;

    @FindBy(xpath = "//a[@data-mode='deactivate']")
    public WebElement deactivate;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement deactivateText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Deactivate')]/../a[2]")
    public WebElement deactivateModalBtn;

    @FindBy(xpath = "//a[@data-mode='delete']")
    public WebElement delete;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement deleteText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Delete')]/../a[2]")
    public WebElement deleteModalBtn;

    @FindBy(xpath = "//a[@data-mode='branch-add']")
    public WebElement branchAdd;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement branchAddText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Add')]/../a[2]")
    public WebElement branchAddModalBtn;

    @FindBy(xpath = "//a[@data-mode='branch-remove']")
    public WebElement branchRemove;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement branchRemoveText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Remove')]/../a[2]")
    public WebElement branchRemoveModalBtn;

    @FindBy(xpath = "//a[@data-mode='group-add']")
    public WebElement addGroup;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement addGroupText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Add')]/../a[2]")
    public WebElement addGroupModalBtn;

    @FindBy(xpath = "//a[@data-mode='group-remove']")
    public WebElement removeGroup;

    @FindBy(xpath = "//div[@id='tl-users-mass-action-modal']/div/h3")
    public WebElement removeGroupText;

    @FindBy(xpath = "//a[@id='submit-mass-action'][contains(text(),'Remove')]/../a[2]")
    public WebElement removeGroupModalBtn;

    @FindBy(xpath = "//a[@data-mode='message']")
    public WebElement clickMessage;

    @FindBy (id="input-append tl-countdown")
    public WebElement sendSubjectText;

    @FindBy(xpath = "//div[@class='note-editable tl-message-editor span9']")
    public WebElement sendMessageText;

    @FindBy(id="submit_send_message")
    public WebElement cleckSendMessage;

    /**
     * переход на checkbox пользователя для вызова dropMenu
     */
    public CheckDropMenu checkMenu() {
        elementActions.moveToElement(firstTableRow);
        elementActions.clickElement(checkBoxClick);
        return this;
    }
    /**
     * переход в dropMenu и вызов вкладок по порядку каждого элемента
     * вывод текста в всплывающем окне для дальнейшего сравнения
     */

    public String actualTextActivate;
    public CheckDropMenu clickActivate() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(activate);
        actualTextActivate = (activateText.getAttribute("innerText"));
        elementActions.clickElement(activateModalBtn);
        return this;
    }
    public String actualTextDeactivate;
    public CheckDropMenu clickDeactivate() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(deactivate);
        actualTextDeactivate =(deactivateText.getAttribute("innerText"));
        elementActions.clickElement(deactivateModalBtn);

        return this;
    }
    public String actualTextDelete;
    public CheckDropMenu clickDelete() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(delete);
        actualTextDelete =(deleteText.getAttribute("innerText"));
        elementActions.clickElement(deleteModalBtn);
        return this;
    }
    public String actualTextAddBranch;
    public CheckDropMenu clickBranchAdd() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(branchAdd);
        actualTextAddBranch=(branchAddText.getAttribute("innerText"));
        elementActions.clickElement(branchAddModalBtn);
        return this;
    }
    public String actualTextRemoveBranch;
    public CheckDropMenu clickBranchRemove() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(branchRemove);
        actualTextRemoveBranch =(branchRemoveText.getAttribute("innerText"));
        elementActions.clickElement(branchRemoveModalBtn);
        return this;
    }
    public String actualTextAddGroup;
    public CheckDropMenu clickAddGroup() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(addGroup);
        actualTextAddGroup=(addGroupText.getAttribute("innerText"));
        elementActions.clickElement(addGroupModalBtn);
        return this;
    }
    public String actualTextRemoveGroup;
    public CheckDropMenu clickRemoveGroup() {
        elementActions.clickElement(clickMassAction);
        elementActions.clickElement(removeGroup);
        actualTextRemoveGroup = (removeGroupText.getAttribute("innerText"));
        elementActions.clickElement(removeGroupModalBtn);

        return this;
    }

}
