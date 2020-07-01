package action;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {

    public void selecionarData(WebElement objeto, Integer dia) {

        Select dropdown = new Select(objeto);
        dropdown.selectByIndex(dia);
    }

    // Metodo para preenchimento do campo Subject
    public void preencherSubjects(WebElement objeto, String texto1, String texto2, String texto3) {
        objeto.click();
        objeto.sendKeys(texto1);
        objeto.sendKeys(Keys.TAB);
        objeto.sendKeys(texto2);
        objeto.sendKeys(Keys.TAB);
        objeto.sendKeys(texto3);
        objeto.sendKeys(Keys.TAB);
    }

    // Metodo para selecionar um Estado e uma cidade dentro da lista
    public void preencherStateCity(WebElement listState, WebElement prencheListaState, WebElement listCity, WebElement prencheListaCity, String state, String city) {

        listState.click();

        if (state == "NCR") {
            prencheListaState.sendKeys(state);
            prencheListaState.sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity.sendKeys(city);
        }
        if (state == "Uttar Pradesh") {
            prencheListaState.sendKeys(state);
            prencheListaState.sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity.sendKeys(city);
        }
        if (state == "Rajasthan") {
            prencheListaState.sendKeys(state);
            prencheListaState.sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity.sendKeys(city);
        }
    }

    public boolean aguardaElemento(WebElement objeto, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOf(objeto));
            System.out.println("Elemento: " + objeto + " encontrado! =) ");
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            System.out.println("Elemento: " + objeto + " não encontrado! =( ");
            return false;
        }
    }

}
