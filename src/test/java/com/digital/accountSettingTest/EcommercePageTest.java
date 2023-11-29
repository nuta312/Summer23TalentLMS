package com.digital.accountSettingTest;

import com.digital.pages.accountSettingsPage.EcommercePage;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.openqa.selenium.JavascriptExecutor;
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://kanzada.talentlms.com/account/ecommerce_index");
    }


    @Test(groups = "regression", priority = 2)
    @Description("Click and select options")
    public void openSelect(){
        elementActions.clickElement(ecommercePage.selectEcommerce);
        Assert.assertTrue(ecommercePage.selectEcommerce.isEnabled());
    }

    @Test(groups = "regression", priority = 3)
    @Description("Random choosing some option")
    public void selectEcommerce(){
        ecommercePage = new EcommercePage();
        elementActions.clickToRandomElement(ecommercePage.allOptions);

        if(ecommercePage.selectEcommerce.getText().equals("PayPal")){
            elementActions.writeText(ecommercePage.payPal, "abdykadyrovna2001@gmail.com");
            Assert.assertTrue(ecommercePage.payPal.isDisplayed(), "PayPal input field is not displayed");
        }
        if(ecommercePage.selectEcommerce.getText().equals("Stripe")){
            elementActions.clickElement(ecommercePage.Stripe);
            elementActions.navigateBack();
            Assert.assertTrue(ecommercePage.Stripe.isSelected(), "Stripe option is not selected");
        }
    }

    @Test(groups = "regression", priority = 4)
    @Description("Open and close subscription")
    public void showSubscription(){
        elementActions.doubleClick(ecommercePage.showSubscription);
        Assert.assertTrue(ecommercePage.showSubscription.isDisplayed(), "Subscription is not displayed after double click");
//        Assert.assertFalse(ecommercePage.showSubscription.isDisplayed(), "Subscription is still displayed after closing");
    }

    @Test(groups = "regression", priority = 5)
    @Description("Show discount at Ecommerce page")
    public void showDiscount() {
        elementActions.clickElement(ecommercePage.showDiscount);
        boolean isDiscountVisible = ecommercePage.checkedDiscount.isEnabled();
        Assert.assertTrue(isDiscountVisible, "The discount element is not visible after clicking 'Show Discount'");

        elementActions.waitElementToBeClickable(ecommercePage.checkedDiscount);
        elementActions.clickByJS(ecommercePage.checkedDiscount);
        boolean isChecked = (boolean) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].checked;", ecommercePage.checkedDiscount);
        Assert.assertTrue(isChecked, "The element should be checked");


        ecommercePage.discountPercentage.sendKeys( "10");
        String enteredDiscount = ecommercePage.discountPercentage.getAttribute("value");
        Assert.assertEquals(enteredDiscount, "10", "Entered discount percentage is incorrect");

    }

    @Test(groups = "regression", priority = 8)
    @Description("Show Invoices at Ecommerce page")
    public void showInvoices(){
        elementActions.clickElement(ecommercePage.showInvoices);
        Assert.assertTrue(ecommercePage.showInvoices.isEnabled(),"Inices checkbox is not displayed");

        String expectedMessage = "Hello my name is Kanzada";
        elementActions.waitElementToBeVisible(ecommercePage.invoicesMessage);
        elementActions.writeText(ecommercePage.invoicesMessage, expectedMessage);
        String actualMessage = ecommercePage.invoicesMessage.getAttribute("value");
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = "regression", priority = 11)
    @Description("Coupons at E-commerce page")
    public void showCoupons(){
        elementActions.clickElement(ecommercePage.showCoupons);
        Assert.assertTrue(ecommercePage.addCouponButton.isDisplayed(), "Coupon element is not displayed after clicking 'Show Coupons'");
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
        boolean isCreditVisible = ecommercePage.creditsCheckbox.isEnabled();
        Assert.assertTrue(isCreditVisible, "The discount element is not visible after clicking 'Show Discount'");

        elementActions.waitElementToBeClickable(ecommercePage.creditsCheckbox);
        elementActions.clickByJS(ecommercePage.creditsCheckbox);
        boolean isChecked = (boolean) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].checked;", ecommercePage.creditsCheckbox);
        Assert.assertTrue(isChecked, "The element should be checked");

        ecommercePage.creditsAdd.sendKeys("2");
        boolean isCreditsEntered = ecommercePage.creditsAdd.isDisplayed();
        String actualEnteredValue = ecommercePage.creditsAdd.getAttribute("value");

        // Assert that the entered value is displayed correctly
        Assert.assertTrue(isCreditsEntered, "The entered credits element is not displayed after entering value");
        Assert.assertEquals(actualEnteredValue, "2", "The entered value is incorrect");


        elementActions.clickElement(ecommercePage.radioBtnSpecificUsers);
        elementActions.waitElementToBeVisible(ecommercePage.radioBtnAllUsers);
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
//        Assert.assertTrue(ecommercePage.savedConfirmation.isDisplayed(), "Save confirmation message is not displayed");
    }

    @Test(groups = "regression", priority = 16)
    @Description("Show discount at Ecommerce page")
    public void openSelectDate(){
        elementActions.waitElementToBeClickable(ecommercePage.openDate);
        elementActions.clickElement(ecommercePage.openDate);
        Assert.assertTrue(true, "Assertion message indicating that the 'openDate' element was clicked successfully");
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
        elementActions.waitElementToBeClickable(ecommercePage.openUserInput);
        elementActions.clickByJS(ecommercePage.openUserInput);
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
