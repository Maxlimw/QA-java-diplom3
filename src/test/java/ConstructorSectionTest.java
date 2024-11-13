import browser.Browser;
import io.qameta.allure.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

import static org.junit.Assert.*;

public class ConstructorSectionTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = Browser.createWebDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @DisplayName("Переход к разделу 'Соусы'")
    @Description("Проверка перехода к разделу 'Соусы' в конструкторе")
    public void switchToSaucesSectionTest() {
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage mainPage = new MainPage(driver);
        mainPage.selectSaucesSection();
        assertTrue(mainPage.isSaucesSectionActive());
    }

    @Test
    @DisplayName("Переход к разделу 'Начинки'")
    @Description("Проверка перехода к разделу 'Начинки' в конструкторе")
    public void switchToFillingsSectionTest() {
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage mainPage = new MainPage(driver);
        mainPage.selectFillingsSection();
        assertTrue(mainPage.isFillingsSectionActive());
    }

    @Test
    @DisplayName("Переход к разделу 'Булки'")
    @Description("Проверка перехода к разделу 'Булки' в конструкторе")
    public void switchToBunsSectionTest() {
        driver.get("https://stellarburgers.nomoreparties.site/");
        MainPage mainPage = new MainPage(driver);
        mainPage.selectSaucesSection();
        mainPage.selectBunsSection();
        assertTrue(mainPage.isBunsSectionActive());
    }
}
