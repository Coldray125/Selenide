package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertEquals;

public class FAQQuestionsCheck {

    MainPage mainPage;

    public String[] expectedAnswers = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };


    @Before
    public void configurationSetup() {
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;
        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        //Configuration.browser = "firefox";
        mainPage = page(MainPage.class);
        open(MainPage.HomePageScooterURL);
        mainPage.clickCookie();
    }


    @Test
    public void checkFAQAnswerInDropDown1() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(0);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[0], mainPage.actualAnswerText(0));

    }

    @Test
    public void checkFAQAnswerInDropDown2() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(1);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[1],mainPage.actualAnswerText(1));
    }

    @Test
    public void checkFAQAnswerInDropDown3() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(2);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[2],mainPage.actualAnswerText(2));
    }


    @Test
    public void checkFAQAnswerInDropDown4() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(3);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[3],mainPage.actualAnswerText(3));
    }

    @Test
    public void checkFAQAnswerInDropDown5() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(4);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[4],mainPage.actualAnswerText(4));
    }


    @Test
    public void checkFAQAnswerInDropDown6() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(5);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[5],mainPage.actualAnswerText(5));
    }

    @Test
    public void checkFAQAnswerInDropDown7() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(6);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[6],mainPage.actualAnswerText(6));
    }

    @Test
    public void checkFAQAnswerInDropDown8() {
        mainPage.scrollToQuestionsList();
        mainPage.clickQuestion(7);
        assertEquals("Неправильный текст ответа на вопрос", expectedAnswers[7],mainPage.actualAnswerText(7));
    }

}
