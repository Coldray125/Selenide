package ru.yandex.scooter.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.scooter.model.InformationForOrder;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$$;

public class OrderPage {

    //Локаторы полей заказа
    @FindBy(how = How.XPATH, using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Имя']")
    private SelenideElement firstNameInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Фамилия']")
    private SelenideElement lastNameInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@class='Input_Input__1iN_Z Input_Responsible__1jDKN'][@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement addressInOrder;

    @FindBy(how = How.XPATH, using = ".//input[@class='select-search__input'][@placeholder='* Станция метро']")
    private SelenideElement dropDownMetroStationInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@placeholder='* Телефон: на него позвонит курьер'][@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement telephoneInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonNextInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@placeholder='* Когда привезти самокат'][@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement dateInOrder;

    @FindBy(how = How.XPATH, using = ".//*[@class='react-datepicker__day react-datepicker__day--001']")
    private SelenideElement selectFirstDayInDateInOrder;

    @FindBy(how = How.XPATH, using = ".//*[contains(text(),'* Срок аренды')][@class='Dropdown-placeholder']")
    private SelenideElement selectRentDurationInOrder;

    @FindBy(how = How.XPATH, using = "//*[@placeholder='Комментарий для курьера'][@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement commentsFieldInOrder;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'чёрный жемчуг')][@class='Checkbox_Label__3wxSf']")
    private SelenideElement colorCheckBox1InOrder;

    //локатор списка всех станций
    private ElementsCollection listOfMetroStations = $$(byXpath(".//*[@class='select-search__select']"));

    //Локаторы выбора срока аренды в днях
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'сутки')][@class='Dropdown-option']")
    private SelenideElement rentOneDay;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'двое суток')][@class='Dropdown-option']")
    private SelenideElement rentTwoDays;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'трое суток')][@class='Dropdown-option']")
    private SelenideElement rentThreeDays;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'четверо суток')][@class='Dropdown-option']")
    private SelenideElement rentFourDays;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'пятеро суток')][@class='Dropdown-option']")
    private SelenideElement rentFiveDays;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'шестеро суток')][@class='Dropdown-option']")
    private SelenideElement rentSixDays;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'семеро суток')][@class='Dropdown-option']")
    private SelenideElement rentSevenDays;

    //Локаторы завершения заказа
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Заказать')][@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonOrderInOrder;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Да')][@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement buttonYesInOrder;

    @FindBy(how = How.XPATH, using = "//*[@class='Order_ModalHeader__3FDaJ'][text()='Заказ оформлен']")
    private SelenideElement orderCompleteWindow;

    public void addFirstNameInOrder(String firstname) {
        firstNameInOrder.sendKeys(firstname);
    }

    public void addLastNameInOrder(String lastname) {
        lastNameInOrder.sendKeys(lastname);
    }

    public void addAddressNameInOrder(String address) {
        addressInOrder.sendKeys(address);
    }

    public void addTelephoneInOrder(String telephone) {
        telephoneInOrder.sendKeys(telephone);
    }

    public void fillUserData(String firstname, String lastname, String address, String telephone, String station) {
        addFirstNameInOrder(firstname);
        addLastNameInOrder(lastname);
        addAddressNameInOrder(address);
        addTelephoneInOrder(telephone);
        clickAndSelectMetroInOrder(station);
    }

    public void clickNextButtonInOrder() {
        buttonNextInOrder.click();
    }

    public void clickDateInOrder() {
        dateInOrder.click();
    }

    public void clickFirstDayInOrder() {
        selectFirstDayInDateInOrder.click();
    }

    public void clickCheckBox1InOrder() {
        colorCheckBox1InOrder.click();
    }

    public void clickOrderButtonInOrder() {
        buttonOrderInOrder.click();
    }

    public void clickYesButtonInOrder() {
        buttonYesInOrder.click();
    }

    public void setDaysInOrder(int days) {
        if (days <= 1) {
            rentOneDay.click();
        }
        if (days <= 2) {
            rentTwoDays.click();
        }

        if (days <= 3) {
            rentThreeDays.click();
        }

        if (days <= 4) {
            rentFourDays.click();
        }

        if (days <= 5) {
            rentFiveDays.click();
        }

        if (days <= 6) {
            rentSixDays.click();
        }

        if (days <= 7) {
            rentSevenDays.click();
        } else {
            System.out.println("Value outside of possible rental days");
        }
    }

    public void clickRentDurationInOrder() {
        selectRentDurationInOrder.click();
    }

    public void setCommentsInOrder(String comments) {
        commentsFieldInOrder.sendKeys(comments);
    }

    public void clickAndSelectMetroInOrder(String station) {
        dropDownMetroStationInOrder.click();
        dropDownMetroStationInOrder.sendKeys(station);
        listOfMetroStations.get(0).should(Condition.visible).click();
    }

    public boolean isOrderCompleteWindowDisplayed() {
        return orderCompleteWindow.isDisplayed();
    }

}