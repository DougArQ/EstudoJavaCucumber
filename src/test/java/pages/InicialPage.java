package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InicialPage {

    public InicialPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;

    @FindBy(xpath = "//span [text()='© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.']")
    WebElement telaInicial;

    public WebElement telaInicial() {
        return telaInicial;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    WebElement btnElements;

    public WebElement btnElements() {
        return btnElements;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
    WebElement btnForms;

    public WebElement btnForms() {
        return btnForms;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]")
    WebElement btnAlerts;

    public WebElement btnAlerts() {
        return btnAlerts;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]")
    WebElement btnWidgets;

    public WebElement btnWidgets() {
        return btnWidgets;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]")
    WebElement btnInteractions;

    public WebElement btnInteractions() {
        return btnInteractions;
    }

}
