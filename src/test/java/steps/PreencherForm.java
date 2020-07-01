package steps;

import action.Action;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import managers.DriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.FormsPage;
import pages.InicialPage;

public class PreencherForm {

    WebDriver driver;
    DriverManager dm = new DriverManager();
    InicialPage inicial;
    FormsPage forms;
    Action a = new Action();

    private Select mes;
    private Select ano;

    @Before
    public void setUp() {
        driver = dm.selectBrowser("chrome_U");
        inicial = new InicialPage(driver);
        forms = new FormsPage(driver);
        driver.get("http://demoqa.com/");
        driver.manage().window().maximize();
    }

    @Dado("que estou na tela inicial do sistema")
    public void que_estou_na_tela_inicial_do_sistema() {
        String textoTelaInicial = inicial.telaInicial().getText();
        Assert.assertEquals("© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.", textoTelaInicial);
    }

    @Quando("clico no menu Forms")
    public void clico_no_menu_Forms() {
        inicial.btnForms().click();
    }

    @Então("tela de Forms é exibida")
    public void tela_de_Forms_é_exibida() {
        a.aguardaElemento(forms.txtForms(), driver);
        Assert.assertEquals("Forms", forms.txtForms().getText());
    }

    /* Preencher Formulario */

    @Dado("que estou na tela de formulário")
    public void que_estou_na_tela_de_formulário() {
    }

    @Quando("preencho com minhas informações {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void preencho_com_minhas_informações(String nome, String sobrenome, String email, String genero, String telefone, String string6, String subjects, String hobbies, String endereco, String estado, String cidade) {
    }

    @Quando("clico no botão submit")
    public void clico_no_botão_submit() {
    }

    @Então("mensagem de confirmação de envio é exibida")
    public void mensagem_de_confirmação_de_envio_é_exibida() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
