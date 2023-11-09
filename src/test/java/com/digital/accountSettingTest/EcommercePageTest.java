package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.EcommercePage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("EcommercePage")
public class EcommercePageTest extends AccountSettingsEnter {
    @Test(groups = "regression", priority = 1)
    @Description("Enter Ecommerce page")
    public void enterEcommerce() {
        ecommercePage = new EcommercePage();
        elementActions.clickElement(ecommercePage.enterEcommerce);
        Assert.assertTrue(ecommercePage.enterEcommerce.isEnabled());
        Assert.assertEquals(driver.getCurrentUrl(), "https://nbu111.talentlms.com/account/ecommerce_index");
    }


    @Test(groups = "regression", priority = 2)
    @Description("Click and select options")
    public void openSelect(){
        elementActions.clickElement(ecommercePage.selectEcommerce);
        // Assuming you want to assert that an option is selected
    }


    @Test(groups = "regression", priority = 3)
    @Description("Random choosing some option")
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
    @Description("Open and close subscription")
    public void showSubscription(){
        elementActions.doubleClick(ecommercePage.showSubscription);
    }

    @Test(groups = "regression", priority = 5)
    @Description("Show discount at Ecommerce page")
    public void showDiscount() {
        ecommercePage = new EcommercePage();
        elementActions.clickElement(ecommercePage.showDiscount);
        elementActions.waitElementToBeClickable(ecommercePage.checkedDiscount);
        elementActions.clickElement(ecommercePage.checkedDiscount);
        elementActions.waitElementToBeVisible(ecommercePage.discountPercentage);
        elementActions.writeText(ecommercePage.discountPercentage, "23");
    }

//    opp 4 conselp
//      for lopp 4
//    acsess modefires
//    linkedList ArrayList


//    @Test(groups = "regression", priority = 6)
//    @Description("Checkbox in discount")
//    public void checkDiscount(){
//
//    }

//    @Test(groups = "regression", priority = 7)
//    @Description("Writing present of discount")
//    public void discountPercentage(){
//
//    }

    @Test(groups = "regression", priority = 8)
    @Description("Show Invoices at Ecommerce page")
    public void showInvoices(){

        elementActions.clickElement(ecommercePage.showInvoices);
        elementActions.clickElement(ecommercePage.checkboxInvoices);
        elementActions.writeText(ecommercePage.invoicesMessage, "Hello my name is Kanzada");
    }

//    Abdykadyrovna.2001!

//    @Test(groups = "regression", priority = 9)
//    @Description("Checkbox in Invoices")
//    public void checkboxInvoices(){
//
//    }

//    @Test(groups = "regression", priority = 10)
//    @Description("After checking there are open the place for text, here we are writing there")
//    public void invoicesSendMessage() {
////        elementActions.waitElementToBeVisible(ecommercePage.invoicesMessage);
//
//    }

    @Test(groups = "regression", priority = 11)
    @Description("Coupons at E-commerce page")
    public void showCoupons(){
        elementActions.clickElement(ecommercePage.showCoupons);
//        elementActions.clickElement(ecommercePage.addCouponButton);
    }

//    @Test(groups = "regression", priority = 12)
//    @Description("Adding coupons")
//    public void addCouponButton(){
//        elementActions.waitElementToBeVisible(ecommercePage.couponInputCode);
//        elementActions.writeText(ecommercePage.couponInputCode, "123!");
//        ecommercePage.selectStartDate();
//        elementActions.writeText(ecommercePage.couponInputPercentage, "100");
//        elementActions.writeText(ecommercePage.couponInputRedemptions,"100");
//        elementActions.clickElement(ecommercePage.couponValidCourse);
//        elementActions.clickToRandomElement(ecommercePage.courseOptions);
//        elementActions.setTextAndEnterElement(ecommercePage.couponValidGroups, "Summer 2023");
//        elementActions.setTextAndEnterElement(ecommercePage.couponValidCategories, "The best of categories");
//        elementActions.clickElement(ecommercePage.submitCoupon);
//    }

    @Test(groups = "regression", priority = 13)
    @Description("Show discount at Ecommerce page")
    public void showCredits() {
        elementActions.clickElement(ecommercePage.showCredits);
        elementActions.waitElementToBeClickable(ecommercePage.creditsCheckbox);
        elementActions.clickElement(ecommercePage.creditsCheckbox);
        elementActions.clickByJS(ecommercePage.creditsAdd);
        elementActions.clickElement(ecommercePage.creditsAdd);
        elementActions.clickElement(ecommercePage.radioBtnSpecificUsers);
        elementActions.clickElement(ecommercePage.radioBtnAllUsers);
    }

    @Test(groups = "regression", priority = 14)
    @Description("Show discount at Ecommerce page")
    public void saveEcommerce(){
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
