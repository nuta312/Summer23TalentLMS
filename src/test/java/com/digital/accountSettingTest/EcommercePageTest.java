package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.EcommercePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.annotations.Test;

@Epic("EcommercePage")
public class EcommercePageTest extends AccountSettingsEnter {
    @Test(groups = "regression", priority = 1)
    @Description("Enter Ecommerce page")
    public void enterEcommerce() {
        ecommercePage = new EcommercePage();
        elementActions.clickElement(ecommercePage.enterEcommerce);
    }

    @Test(groups = "regression", priority = 2)
    @Description("Click and select options")
    public void openSelect(){
        elementActions.clickElement(ecommercePage.selectEcommerce);
    }

    @Test(groups = "regression", priority = 3)
    @Description("Show discount at Ecommerce page")
    public void selectEcommerce(){
        elementActions.clickToRandomElement(ecommercePage.allOptions);
        if(ecommercePage.selectEcommerce.getText().equals("PayPal")){
            elementActions.writeText(ecommercePage.payPal, "abdykadyrovna2001@gmail.com");
        }
        if(ecommercePage.selectEcommerce.getText().equals("Stripe")){
            elementActions.clickElement(ecommercePage.Stripe);
            elementActions.navigateBack();
        }
    }

    @Test(groups = "regression", priority = 4)
    @Description("Show discount at Ecommerce page")
    public void showSubscription(){
        elementActions.doubleClick(ecommercePage.showSubscription);
    }

    @Test(groups = "regression", priority = 5)
    @Description("Show discount at Ecommerce page")
    public void showDiscount() {
        ecommercePage = new EcommercePage();
        elementActions.waitElementToBeClickable(ecommercePage.showDiscount);
        elementActions.clickElement(ecommercePage.showDiscount);
    }

    @Test(groups = "regression", priority = 6)
    @Description("Show discount at Ecommerce page")
    public void checkDiscount(){
        ecommercePage = new EcommercePage();
        elementActions.waitElementToBeVisible(ecommercePage.checkedDiscount);
//        elementActions.waitElementToBeClickable(ecommercePage.checkedDiscount);
        elementActions.clickElement(ecommercePage.checkedDiscount);
    }

    @Test(groups = "regression", priority = 7)
    @Description("Show discount at Ecommerce page")
    public void discountPercentage(){
//        elementActions.waitElementToBeVisible(ecommercePage.discountPercentage);
//        elementActions.waitElementToBeClickable(ecommercePage.discountPercentage);
        elementActions.writeText(ecommercePage.discountPercentage, "23");
    }

    @Test(groups = "regression", priority = 8)
    @Description("Show discount at Ecommerce page")
    public void showInvoices(){
        elementActions.clickElement(ecommercePage.showInvoices);
    }

    @Test(groups = "regression", priority = 9)
    @Description("Show discount at Ecommerce page")
    public void checkboxInvoices(){
        elementActions.waitElementToBeVisible(ecommercePage.checkboxInvoices);
//        elementActions.waitElementToBeClickable(ecommercePage.checkboxInvoices);
        elementActions.clickElement(ecommercePage.checkboxInvoices);
    }

    @Test(groups = "regression", priority = 10)
    @Description("Show discount at Ecommerce page")
    public void invoicesSendMessage() {
//        elementActions.waitElementToBeVisible(ecommercePage.invoicesMessage);
//        elementActions.waitElementToBeClickable(ecommercePage.invoicesMessage);
        elementActions.writeText(ecommercePage.invoicesMessage, "Hello my name is Kanzada");
    }

    @Test(groups = "regression", priority = 11)
    @Description("Show discount at Ecommerce page")
    public void showCoupons(){
        elementActions.clickElement(ecommercePage.showInvoices);
    }

    @Test(groups = "regression", priority = 12)
    @Description("Show discount at Ecommerce page")
    public void addCouponButton(){
        if (ecommercePage.addCouponButton.isDisplayed() && ecommercePage.addCouponButton.isEnabled()) {
            ecommercePage.addCouponButton.click();
        }
//        elementActions.clickElement(ecommercePage.addCouponButton);
    }

    @Test(groups = "regression", priority = 13)
    @Description("Show discount at Ecommerce page")
    public void showCredits() {
        elementActions.waitElementToBeVisible(ecommercePage.showCredits);
        elementActions.waitElementToBeClickable(ecommercePage.showCredits);
        elementActions.clickElement(ecommercePage.showCredits);
        elementActions.clickElement(ecommercePage.creditsCheckbox);
        elementActions.clickElement(ecommercePage.creditsAdd);
        elementActions.clickElement(ecommercePage.radioBtnSpecificUsers);
        elementActions.clickElement(ecommercePage.radioBtnAllUsers);
    }

    @Test(groups = "regression", priority = 14)
    @Description("Show discount at Ecommerce page")
    public void saveEcommerce(){
        elementActions.waitElementToBeClickable(ecommercePage.saveEcommerce);
        elementActions.clickElement(ecommercePage.saveEcommerce);
    }

    @Test(groups = "regression", priority = 15)
    @Description("Show discount at Ecommerce page")
    public void timeLine() {
        elementActions.clickElement(ecommercePage.timeline);
    }

    @Test(groups = "regression", priority = 16)
    @Description("Show discount at Ecommerce page")
    public void openSelectDate(){
        elementActions.waitElementToBeClickable(ecommercePage.openDate);
        elementActions.clickElement(ecommercePage.openDate);
    }

    @Test(groups = "regression", priority = 17)
    @Description("Show discount at Ecommerce page")
    public void selectRandomDate(){
        ecommercePage.selectRandomDate();
    }
    @Test(groups = "regression", priority = 18)
    @Description("Show discount at Ecommerce page")
    public void openRandomFinishDate(){
        elementActions.clickElement(ecommercePage.openFinishDate);
    }

    @Test(groups = "regression", priority = 19)
    @Description("Show discount at Ecommerce page")
    public void selectRandomFinishDate(){
        ecommercePage.selectFinishDate();
    }

    @Test(groups = "regression", priority = 20)
    @Description("Show discount at Ecommerce page")
    public void openEventTime(){
        elementActions.clickElement(ecommercePage.openTimeLine);
    }

    @Test(groups = "regression", priority = 21)
    @Description("Show discount at Ecommerce page")
    public void writeEventTime(){
        elementActions.clickToRandomElement(ecommercePage.eventTimeLine);
    }

    @Test(groups = "regression", priority = 22)
    @Description("Show discount at Ecommerce page")
    public void openUsersInput(){
        elementActions.clickElement(ecommercePage.openUserInput);
    }

    @Test(groups = "regression", priority = 23)
    @Description("Show discount at Ecommerce page")
    public void chooseUserInput(){
        elementActions.clickToRandomElement(ecommercePage.chooseUser);
    }

    @Test(groups = "regression", priority = 24)
    @Description("Show discount at Ecommerce page")
    public void openCourseInput(){
        elementActions.clickElement(ecommercePage.openCourseInput);
    }

    @Test(groups = "regression", priority = 25)
    @Description("Show discount at Ecommerce page")
    public void chooseCourseInput(){
        elementActions.waitElementToBeVisible(ecommercePage.courseOption);
//        elementActions.clickElement(ecommercePage.courseOption);
        elementActions.navigateBack();
    }

}
