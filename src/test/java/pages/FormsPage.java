package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class FormsPage {

    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement txtForms;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/h5[1]")
    WebElement txtFormulario;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]")
    WebElement btnPraticeForms;

    @FindBy(id = "firstName")
    WebElement txtFirstName;

    @FindBy(id = "lastName")
    WebElement txtlastName;

    @FindBy(id = "userEmail")
    WebElement txtuserEmail;

    // Gender
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]")
    WebElement male;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/label[1]")
    WebElement female;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/label[1]")
    WebElement other;

    @FindBy(id = "userNumber")
    WebElement txtuserNumber;

    @FindBy(id = "dateOfBirthInput")
    WebElement txtdateOfBirth;

    @FindBy(className = "react-datepicker__month-select")
    WebElement listaMes;

    @FindBy(className = "react-datepicker__week")
    WebElement listaDias;

    @FindBy(className = "react-datepicker__year-select")
    WebElement listaAno;

    @FindBy(id = "subjectsInput")
    WebElement txtSubjects;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]")
    WebElement checkSports;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[2]/label[1]")
    WebElement checkReading;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[3]/label[1]")
    WebElement checkMusic;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    WebElement txtAddress;

    @FindBy(id = "state")
    WebElement listState;

    @FindBy(id = "react-select-3-input")
    WebElement prencheListaState;

    @FindBy(className = "css-yk16xz-control")
    WebElement listCity;

    @FindBy(id = "react-select-4-input")
    WebElement prencheListaCity;

    @FindBy(id = "submit")
    WebElement btnSubmit;

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement msgSucesso;

    @FindBy(id = "closeLargeModal")
    WebElement btnClose;

    public string textoForms(){
        TextoForms = txtForms.getText();
        return TextoForms;
    }

    public string txtFormulario(){
        TextoFormulario = txtFormulario.getText();
        return TextoFormulario;
    }



    public WebElement prencheListaState() {
        return prencheListaState;
    }

    public WebElement prencheListaCity() {
        return prencheListaCity;
    }

    public WebElement btnPraticeForms() {
        return btnPraticeForms;
    }

    public WebElement txtFirstName() {
        return txtFirstName;
    }

    public WebElement txtlastName() {
        return txtlastName;
    }

    public WebElement txtuserEmail() {
        return txtuserEmail;
    }

    public void selecionarSexo(String sexo) { // M�todo para preenchimento do campo Sexo

        if (sexo == "male") {
            male.click();
        } else if (sexo == "female") {
            female.click();
        } else {
            other.click();
        }
    }

    public void txtuserNumber(String telefone) { // M�todo para preenchimento do campo telefone.

        Integer QtdNumeros = telefone.length();

        if (QtdNumeros == 10) {
            txtuserNumber.sendKeys(telefone);
        } else if (QtdNumeros != 10) {
            System.out.println("Quantidade de digitos diferente de 10");
        }
    }

    public WebElement txtdateOfBirth() {
        return txtdateOfBirth;
    }

    public WebElement listaMes() {
        return listaMes;
    }

    public WebElement listaDias() {
        return listaDias;
    }

    public WebElement listaAno() {
        return listaAno;
    }

    public void selecionarData(Integer dia) { // M�todo para sele��o do DIA

        Select dropdown = new Select(listaDias);
        dropdown.selectByIndex(dia);

    }

    public void preencherSubjects(String texto1, String texto2, String texto3) { // Metodo para preenchimento do campo
        // Subject
        txtSubjects.click();
        txtSubjects.sendKeys(texto1);
        txtSubjects.sendKeys(Keys.TAB);
        txtSubjects.sendKeys(texto2);
        txtSubjects.sendKeys(Keys.TAB);
        txtSubjects.sendKeys(texto3);
        txtSubjects.sendKeys(Keys.TAB);

    }

    public void selecionarHobbie(String hobbie) { // Metodo para selecionar o checkbox Hobbie

        if (hobbie == "sports") {
            checkSports.click();
        } else if (hobbie == "reading") {
            checkReading.click();
        } else {
            checkMusic.click();
        }
    }

    public WebElement uploadPicture() {
        return uploadPicture;
    }

    public WebElement txtAddress() {
        return txtAddress;
    }

    public WebElement listState() {
        return listState;
    }

    public void preencherStateCity(String state, String city) { // Metodo para selecionar um Estado e uma cidade dentro da lista

        listState().click();

        if (state == "NCR") {
            prencheListaState().sendKeys(state);
            prencheListaState().sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity().sendKeys(city);
        } else if (state == "Uttar Pradesh") {
            prencheListaState().sendKeys(state);
            prencheListaState().sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity().sendKeys(city);
        } else if (state == "Rajasthan") {
            prencheListaState().sendKeys(state);
            prencheListaState().sendKeys(Keys.TAB);
            listCity.click();
            prencheListaCity().sendKeys(city);
        }
    }

//	public void preencherState(String state) {  //Metodo para selecionar um Estado dentro da lista
//
//		listState().click();
//
//		if (state == "NCR") {
//			prencheListaState().sendKeys("NCR");
//			prencheListaState().sendKeys(Keys.TAB);
//		} else if (state == "Uttar Pradesh") {
//			prencheListaState().sendKeys("Uttar Pradesh");
//			prencheListaState().sendKeys(Keys.TAB);
//			prencheListaState().sendKeys(Keys.TAB);
//		} else if (state == "Rajasthan") {
//			prencheListaState().sendKeys("Rajasthan");
//			prencheListaState().sendKeys(Keys.TAB);
//		}
//	}
//
//
//
//
//	public WebElement listCity() {
//		return listCity;
//	}
//
//	public void preencherCity(String city) {  //Metodo para selecionar uma cidade dentro da lista
//
//		listCity().click();
//
//
//		if (city == "Agra") {
//			prencheListaCity().sendKeys("Agra");
//			prencheListaCity().sendKeys(Keys.TAB);
//		} else if (city == "Lucknow") {
//			prencheListaCity().sendKeys("Lucknow");
//			prencheListaCity().sendKeys(Keys.TAB);
//		} else if (city == "Merrut") {
//			prencheListaCity().sendKeys("Merrut");
//			prencheListaCity().sendKeys(Keys.TAB);
//		}
//	}

    public WebElement btnSubmit() {
        return btnSubmit;
    }

    public WebElement msgSucesso() {
        return msgSucesso;
    }

    public String validaMsg() {
        String mensagem = msgSucesso().getText();

        return mensagem;
    }

    public WebElement btnClose() {
        return btnClose;
    }

//    /**
//     * Encontrar um elemento na tela
//     */
//    public boolean aguardaElemento(WebElement objeto, WebDriver driver) {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        try {
//            wait.until(ExpectedConditions.visibilityOf(objeto));
//            System.out.println("Elemento: " + objeto + " encontrado! =) ");
//            Thread.sleep(1000);
//            return true;
//        } catch (Exception e) {
//            System.out.println("Elemento: " + objeto + " não encontrado! =( ");
//            return false;
//        }
//    }
//
//
//    public void econtraElementoNaTela(WebElement objeto, WebDriver driver) throws InterruptedException {
//        boolean iconeVisivel = true;
//        while (iconeVisivel) {
//            if (aguardaElemento(objeto)) {
//                clicarElemento(objeto);
//                iconeVisivel = false;
//            } else {
//                scrollTela("up", 1);
//            }
//        }
//    }

}
