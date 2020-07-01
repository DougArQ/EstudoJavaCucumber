package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormsPage {

    public FormsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement txtForms;

    public WebElement txtForms() {
        return txtForms;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/h5[1]")
    WebElement txtFormulario;

    public WebElement txtFormulario() {
        return txtFormulario;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]")
    WebElement btnPraticeForms;

    public WebElement btnPraticeForms() {
        return btnPraticeForms;
    }

    @FindBy(id = "firstName")
    WebElement txtFirstName;

    public WebElement txtFirstName() {
        return txtFirstName;
    }

    @FindBy(id = "lastName")
    WebElement txtlastName;

    public WebElement txtlastName() {
        return txtlastName;
    }

    @FindBy(id = "userEmail")
    WebElement txtuserEmail;

    public WebElement txtuserEmail() {
        return txtuserEmail;
    }

    // Gender
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]")
    WebElement male;

    public WebElement male() {
        return male;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[2]/label[1]")
    WebElement female;

    public WebElement female() {
        return female;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[3]/div[2]/div[3]/label[1]")
    WebElement other;

    public WebElement other() {
        return other;
    }

    @FindBy(id = "userNumber")
    WebElement txtuserNumber;

    public WebElement txtuserNumber() {
        return txtuserNumber;
    }

    @FindBy(id = "dateOfBirthInput")
    WebElement txtdateOfBirth;

    public WebElement txtdateOfBirth() {
        return txtdateOfBirth;
    }

    @FindBy(className = "react-datepicker__month-select")
    WebElement listaMes;

    public WebElement listaMes() {
        return listaMes;
    }

    @FindBy(className = "react-datepicker__week")
    WebElement listaDias;

    public WebElement listaDias() {
        return listaDias;
    }

    @FindBy(className = "react-datepicker__year-select")
    WebElement listaAno;

    public WebElement listaAno() {
        return listaAno;
    }

    @FindBy(id = "subjectsInput")
    WebElement txtSubjects;

    public WebElement txtSubjects() {
        return txtSubjects;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[1]/label[1]")
    WebElement checkSports;

    public WebElement checkSports() {
        return checkSports;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[2]/label[1]")
    WebElement checkReading;

    public WebElement checkReading() {
        return checkReading;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[7]/div[2]/div[3]/label[1]")
    WebElement checkMusic;

    public WebElement checkMusic() {
        return checkMusic;
    }

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    public WebElement uploadPicture() {
        return uploadPicture;
    }

    @FindBy(id = "currentAddress")
    WebElement txtAddress;

    public WebElement txtAddress() {
        return txtAddress;
    }

    @FindBy(id = "state")
    WebElement listState;

    public WebElement listState() {
        return listState;
    }

    @FindBy(id = "react-select-3-input")
    WebElement prencheListaState;

    public WebElement prencheListaState() {
        return prencheListaState;
    }

    @FindBy(className = "css-yk16xz-control")
    WebElement listCity;

    public WebElement listCity() { return listCity; }

    @FindBy(id = "react-select-4-input")
    WebElement prencheListaCity;

    public WebElement prencheListaCity() {
        return prencheListaCity;
    }

    @FindBy(id = "submit")
    WebElement btnSubmit;

    public WebElement btnSubmit() {
        return btnSubmit;
    }

    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement msgSucesso;

    public WebElement msgSucesso() {
        return msgSucesso;
    }

    @FindBy(id = "closeLargeModal")
    WebElement btnClose;

    public WebElement btnClose() { return btnClose; }

}
