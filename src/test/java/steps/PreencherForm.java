package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import managers.DriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FormsPage;
import pages.InicialPage;

public class PreencherForm {

    WebDriver driver;
    DriverManager dm = new DriverManager();
    InicialPage inicial;
    FormsPage forms;
    public TestName test = new TestName();

    private Select mes;
    private Select ano;


    @Before
    public void setUp() {
        driver = dm.selectBrowser("chrome");
        inicial = new InicialPage(driver);
        forms = new FormsPage(driver);
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();

    }
@Test
    /* Acessar Formulario */

    @Dado("que estou na tela inicial do sistema")
    public void que_estou_na_tela_inicial_do_sistema() {
    Assert.assertEquals(inicial.EnderecoLink(),"https://demoqa.com/");
    }

    @Quando("clico no menu Forms")
    public void clico_no_menu_Forms() {
        inicial.btnForms().click();
        Thread.sleep(3000);
    }

    @Então("tela de Forms é exibida")
    public void tela_de_Forms_é_exibida() {
        Assert.assertEquals(forms.textoForms(),"Forms");git
    }

    /* Preencher Formulario */

    @Dado("que estou na tela de formulário")
    public void que_estou_na_tela_de_formulário() {
        Assert.assertEquals(forms.txtFormulario(),"Student Registration Form");
    }

    @Quando("preencho com minhas informações {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void preencho_com_minhas_informações(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11) {
    }

    @Quando("clico no botão submit")
    public void clico_no_botão_submit() {
        forms.btnSubmit().click();
    }

    @Então("mensagem de confirmação de envio é exibida")
    public void mensagem_de_confirmação_de_envio_é_exibida() {
        Assert.assertEquals("Thanks for submitting the form", forms.validaMsg());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
