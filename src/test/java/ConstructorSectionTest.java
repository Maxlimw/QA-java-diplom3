import browser.Browser;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

import static org.junit.Assert.*;

public class ConstructorSectionTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp() {
        driver = Browser.createWebDriver();
        mainPage = new MainPage(driver);
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
        mainPage.selectSaucesSection();
        assertTrue("Секция 'Соусы' активна", mainPage.isSaucesSectionActive());
    }

    @Test
    @DisplayName("Переход к разделу 'Начинки'")
    @Description("Проверка перехода к разделу 'Начинки' в конструкторе")
    public void switchToFillingsSectionTest() {
        driver.get("https://stellarburgers.nomoreparties.site/");
        mainPage.selectFillingsSection();
        assertTrue("Секция 'Начинки' активна", mainPage.isFillingsSectionActive());
    }

    @Test
    @DisplayName("Переход к разделу 'Булки'")
    @Description("Проверка перехода к разделу 'Булки' в конструкторе")
    public void switchToBunsSectionTest() {
        driver.get("https://stellarburgers.nomoreparties.site/");
        mainPage.selectFillingsSection();
        mainPage.selectBunsSection();
        assertTrue("Секция 'Булки' активна", mainPage.isBunsSectionActive());
    }
}
