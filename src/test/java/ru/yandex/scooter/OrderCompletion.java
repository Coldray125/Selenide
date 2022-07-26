package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.model.InformationForOrder;
import ru.yandex.scooter.pageobject.MainPage;
import ru.yandex.scooter.pageobject.OrderPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;
import static ru.yandex.scooter.model.InformationForOrder.getSimpleCustomer;

public class OrderCompletion {

    MainPage mainPage;
    OrderPage orderPage;
    InformationForOrder info = getSimpleCustomer();
    //InformationForOrder info2 = new InformationForOrder("Артем","Артемий","Киевская","Киевская","2312312313231","Test");

    @Before
    public void configurationSetup() {
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.screenshots = false;
        Configuration.startMaximized = true;
        //Configuration.browser = "chrome";
        Configuration.browser = "edge";
        mainPage = page(MainPage.class);
        orderPage = page(OrderPage.class);
        open(MainPage.HomePageScooterURL);
        mainPage.clickCookie();
    }

    @Test
    public void orderFromMiddleButton() {

        mainPage.scrollToQuestionsList();
        mainPage.clickMiddleOrderButton();
        orderPage.fillUserData(info.firstName, info.lastName, info.address, info.phoneNumber, info.station);
        orderPage.clickNextButtonInOrder();
        orderPage.clickDateInOrder();
        orderPage.clickFirstDayInOrder();
        orderPage.clickRentDurationInOrder();
        orderPage.setDaysInOrder(7);
        orderPage.clickCheckBox1InOrder();
        orderPage.setCommentsInOrder(info.comments);
        orderPage.clickOrderButtonInOrder();
        orderPage.clickYesButtonInOrder();
        assertTrue("Окно заказа не отображается", orderPage.isOrderCompleteWindowDisplayed());
    }

    @Test
    public void orderFromHeaderButton() {

        mainPage.clickHeaderOrderButton();
        orderPage.fillUserData(info.firstName, info.lastName, info.address, info.phoneNumber, info.station);
        orderPage.clickNextButtonInOrder();
        orderPage.clickDateInOrder();
        orderPage.clickFirstDayInOrder();
        orderPage.clickRentDurationInOrder();
        orderPage.setDaysInOrder(7);
        orderPage.clickCheckBox1InOrder();
        orderPage.setCommentsInOrder(info.comments);
        orderPage.clickOrderButtonInOrder();
        orderPage.clickYesButtonInOrder();
        assertTrue("Окно заказа не отображается", orderPage.isOrderCompleteWindowDisplayed());
    }
}