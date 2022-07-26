package ru.yandex.scooter.pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    public static final String HomePageScooterURL = "https://qa-scooter.praktikum-services.ru/";

    //Картинка-логотип самоката.
    @FindBy(how = How.XPATH, using = "//*[@src='/assets/blueprint.png']")
    private SelenideElement scooterLogoImage;

    //Логотип "Яндекс".
    @FindBy(how = How.XPATH, using = "//*[@class='Header_LogoYandex__3TSOI']")
    private SelenideElement yandexLogo;

    //Логотип "Самокат".
    @FindBy(how = How.XPATH, using = "//*[@class='Header_LogoScooter__3lsAR']")
    private SelenideElement scooterLogo;

    // Логотип "Учебный тренажер".
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    private SelenideElement trainingSimulatorLogo;

    //App Cookie Consent
    @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent__1yUIN")
    private SelenideElement cookieConsentBody;

    //Текст App Cookie Consent "И здесь куки! В общем, мы их используем."
    @FindBy(how = How.CLASS_NAME, using = "App_CookieText__1sbqp")
    private SelenideElement textAppCookieConsent;

    //Кнопка "да все привыкли"
    @FindBy(how = How.ID, using = "rcc-confirm-button")
    private SelenideElement cookieButton;

    //Заголовок "Самокат на пару дней".
    @FindBy(how = How.CLASS_NAME, using = "Home_Header__iJKdX")
    private SelenideElement textScooterForCoupleDays;

    //Подзаголовок "Привезём его прямо к вашей двери,а когда накатаетесь — заберём.
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Привезём его прямо к вашей двери')][@class='Home_SubHeader__zwi_E']")
    private SelenideElement subheaderLongText1;

    //Подзаголовок "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Он лёгкий и с мощными колёсами')][@class='Home_SubHeader__zwi_E']")
    private SelenideElement subheaderLongText2;

    //Кнопка "Заказать" в хедере страницы.
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement headerOrderButton;

    //Элемент "Статус заказа" в хедере страницы.
    @FindBy(how = How.XPATH, using = "//*[@class='Header_Link__1TAG7']")
    private SelenideElement orderStatusButton;

    //Поле ввода номера заказа - Появляется после клика по кнопке "Статус заказа"
    @FindBy(how = How.XPATH, using = "//*[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement orderStatusField;

    //Кнопка "Go" - Появляется после клика по кнопке "Статус заказа"
    @FindBy(how = How.XPATH, using = "//*[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement orderStatusGoButton;

    //Картинка "Самокат".
    @FindBy(how = How.XPATH, using = "//img[@src='/assets/scooter.png']")
    private SelenideElement scooterImage;

    //Элемент-блок с параметрами самоката (скорость, расстояние, вес).
    @FindBy(how = How.CLASS_NAME, using = "Home_Table__2kPxP")
    private SelenideElement scooterParameterBlock;

    //Модель Toxic PRO
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Модель Toxic PRO')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterModel;

    //Максимальная скорость
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Максимальная скорость')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterMaxSpeed;

    //40 км/ч
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'40 км/ч')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterMaxSpeedValue;

    //Проедет без подзарядки
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Проедет без подзарядки')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterWithoutRecharge;

    //80 км
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'80 км')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterWithoutRechargeDistance;

    //Выдерживает вес
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Выдерживает вес')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterWeight;

    //120 кг
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'120 кг')][@class='Home_Column__xlKDK']")
    private SelenideElement scooterWeightValue;

    //Подзаголовок "Как это работает"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Как это работает')][@class='Home_SubHeader__zwi_E']")
    private SelenideElement subheaderHowItWorks;

    //Элемент "Кружок с цифрой 1 внутри"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'1')][@class='Home_StatusCircle__3_aTp']")
    private SelenideElement cirlceWithNumber1;

    //Элемент "Кружок с цифрой 2 внутри"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'2')][@class='Home_StatusCircle__3_aTp']")
    private SelenideElement cirlceWithNumber2;

    //Элемент "Кружок с цифрой 3 внутри"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'3')][@class='Home_StatusCircle__3_aTp']")
    private SelenideElement cirlceWithNumber3;

    //Элемент "Кружок с цифрой 4 внутри"
    @FindBy(how = How.XPATH, using = "//*[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp']")
    private SelenideElement cirlceWithNumber4;

    //Шаг 1 "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Заказываете самокат')][@class='Home_Status__YkfmH']")
    private SelenideElement stepHeaderText1;

    //Описание Шага 1 "Выбираете, когда и куда привезти".
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Выбираете, когда')][@class='Home_StatusDescription__3WGl5']")
    private SelenideElement stepDescriptionText1;

    //Шаг 2 "Курьер привозит самокат".
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Курьер привозит самокат')][@class='Home_Status__YkfmH']")
    private SelenideElement stepHeaderText2;

    //Описание Шага 2 "А вы — оплачиваете аренду"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'А вы — оплачиваете аренду')][@class='Home_StatusDescription__3WGl5']")
    private SelenideElement stepDescriptionText2;

    //Шаг 3 "Катаетесь".
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Катаетесь')][@class='Home_Status__YkfmH']")
    private SelenideElement stepHeaderText3;

    //Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Сколько часов аренды осталось — видно на сайте')][@class='Home_StatusDescription__3WGl5']")
    private SelenideElement stepDescriptionText3;

    //Шаг 4 "Курьер забирает самокат".
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Курьер забирает самокат')][@class='Home_Status__YkfmH']")
    private SelenideElement stepHeaderText4;

    //Описание Шага 4 "Когда аренда заканчивается"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Когда аренда заканчивается')][@class='Home_StatusDescription__3WGl5']")
    private SelenideElement stepDescriptionText4;

    //Кнопка "Заказать" в нижней части страницы.
    @FindBy(how = How.XPATH, using = "//*[@class='Button_Button__ra12g Button_UltraBig__UU3Lp']")
    private SelenideElement middleOrderButton;

    //Вопросы о важном
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Вопросы о важном')][@class='Home_SubHeader__zwi_E']")
    private SelenideElement headerImportantQuestions;

    //Блок вопросов
    @FindBy(how = How.CLASS_NAME, using = "Home_FAQ__3uVm4")
    private SelenideElement FAQQuestionsSection;

    //Вопрос №1 "Сколько это стоит и как оплатить"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Сколько это стоит? И как оплатить?')]")
    private SelenideElement questionInFAQ1;

    //Ответ на вопрос №1 "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    @FindBy(how = How.ID, using = "accordion__panel-0")
    private SelenideElement answerInFAQ1;

    //Вопрос №2 "Хочу сразу несколько самокатов! Так можно?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Хочу сразу несколько самокатов! Так можно?')]")
    private SelenideElement questionInFAQ2;

    //Ответ на вопрос №2. "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    @FindBy(how = How.ID, using = "accordion__panel-1")
    private SelenideElement answerInFAQ2;

    //Вопрос №3 "Как рассчитывается время аренды?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Как рассчитывается время аренды?')]")
    private SelenideElement questionInFAQ3;

    //Ответ на вопрос №3. "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    @FindBy(how = How.ID, using = "accordion__panel-2")
    private SelenideElement answerInFAQ3;

    //Вопрос №4 "Можно ли заказать самокат прямо на сегодня?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Можно ли заказать самокат прямо на сегодня')]")
    private SelenideElement questionInFAQ4;

    //Ответ на вопрос №4. "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    @FindBy(how = How.ID, using = "accordion__panel-3")
    private SelenideElement answerInFAQ4;

    //Вопрос №5 "Можно ли продлить заказ или вернуть самокат раньше?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Можно ли продлить заказ или вернуть самокат раньше?')]")
    private SelenideElement questionInFAQ5;

    //Ответ на вопрос №5. "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    @FindBy(how = How.ID, using = "accordion__panel-4")
    private SelenideElement answerInFAQ5;

    //Вопрос №6 "Вы привозите зарядку вместе с самокатом?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Вы привозите зарядку вместе с самокатом?')]")
    private SelenideElement questionInFAQ6;

    //Ответ на вопрос №6. "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    @FindBy(how = How.ID, using = "accordion__panel-5")
    private SelenideElement answerInFAQ6;

    //Вопрос №7 "Можно ли отменить заказ?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Можно ли отменить заказ?')]")
    private SelenideElement questionInFAQ7;

    //Ответ на вопрос №7. "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    @FindBy(how = How.ID, using = "accordion__panel-6")
    private SelenideElement textInDropDown7;

    //Вопрос №8 "Я жизу за МКАДом, привезёте?"
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Я жизу за МКАДом, привезёте?')]")
    private SelenideElement questionInFAQ8;

    // Ответ на вопрос №8. "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    @FindBy(how = How.ID, using = "accordion__panel-7")
    private SelenideElement textInDropDown8;

    private ElementsCollection questionsFAQ = $$(By.className("accordion__item"));

    private ElementsCollection answersFAQ = $$(By.className("accordion__panel"));

    public void clickHeaderOrderButton() {
        headerOrderButton.click();
    }

    public void clickMiddleOrderButton() {
        middleOrderButton.click();
    }

    public String getAnswerFromFAQ(int number) {
        return answersFAQ.get(number).shouldBe(Condition.visible).getText();
    }

    public String actualAnswerText(int number) {
        return getAnswerFromFAQ(number);
    }

    public void clickQuestion(int number) {
        questionsFAQ.get(number).shouldBe(Condition.visible).click();
    }

    public void scrollToQuestionsList() {
        FAQQuestionsSection.scrollIntoView(true).shouldBe(Condition.visible);
    }

    public void clickCookie() {
        if ($(byText("И здесь куки! В общем, мы их используем.")).exists()) {
            cookieButton.click();
        }
    }

}
