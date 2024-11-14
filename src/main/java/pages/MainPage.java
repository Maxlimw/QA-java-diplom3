package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriverWait wait;
    private WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    private By loginButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private By personalCabinetButton = By.xpath(".//p[text()='Личный Кабинет']");
    private By constructorButton = By.xpath(".//p[text()='Конструктор']");
    private By logo = By.className("AppHeader_header__logo__2D0X2");
    private By bunsSection = By.xpath("//div[span[text()='Булки']]");
    private By saucesSection = By.xpath("//div[span[text()='Соусы']]");
    private By fillingsSection = By.xpath("//div[span[text()='Начинки']]");

    public void clickLoginButton() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }

    public void clickPersonalCabinetButton() {
        WebElement cabinetBtn = wait.until(ExpectedConditions.elementToBeClickable(personalCabinetButton));
        cabinetBtn.click();
    }

    public void clickConstructorButton() {
        WebElement constructorBtn = wait.until(ExpectedConditions.elementToBeClickable(constructorButton));
        constructorBtn.click();
    }

    public void clickLogo() {
        WebElement logoElement = wait.until(ExpectedConditions.elementToBeClickable(logo));
        logoElement.click();
    }

    public void selectBunsSection() {
        WebElement buns = wait.until(ExpectedConditions.elementToBeClickable(bunsSection));
        buns.click();
    }

    public void selectSaucesSection() {
        WebElement sauces = wait.until(ExpectedConditions.elementToBeClickable(saucesSection));
        sauces.click();
    }

    public void selectFillingsSection() {
        WebElement fillings = wait.until(ExpectedConditions.elementToBeClickable(fillingsSection));
        fillings.click();
    }

    public boolean isBunsSectionActive() {
        WebElement buns = wait.until(ExpectedConditions.visibilityOfElementLocated(bunsSection));
        return buns.getAttribute("class").contains("tab_tab_type_current__");
    }

    public boolean isSaucesSectionActive() {
        WebElement sauces = wait.until(ExpectedConditions.visibilityOfElementLocated(saucesSection));
        return sauces.getAttribute("class").contains("tab_tab_type_current__");
    }

    public boolean isFillingsSectionActive() {
        WebElement fillings = wait.until(ExpectedConditions.visibilityOfElementLocated(fillingsSection));
        return fillings.getAttribute("class").contains("tab_tab_type_current__");
    }
}
