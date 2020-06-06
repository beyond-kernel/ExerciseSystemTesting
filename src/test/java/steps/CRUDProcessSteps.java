package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import support.BaseSteps;
import support.ProcessoDados;
import support.RESTSupport;

public class CRUDProcessSteps extends BaseSteps {
    private Home home = new Home(driver);
    private MenuProcess menu = new MenuProcess(driver);
    private ProcessGrid processGrid = new ProcessGrid(driver);
    private ProcessNew processNew = new ProcessNew(driver);
    private ProcessoDados process = new ProcessoDados();

    @Given("^the user is on Agapito server page$")
    public void theUserIsOnAgapitoServerPage() {
        home.openPage();
    }

    @And("^the user clicks on  Process menu$")
    public void theUserClicksOnProcessMenu() {
        menu.clickProcess();
    }

    @And("^the user clicks on new Process button$")
    public void theUserClicksOnNewProcessButton() {
        processGrid.clickNewProcess();
    }

    @And("^the user fills vara equal \"([^\"]*)\"$")
    public void theUserFillsVaraEqual(String vara) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(vara,"#processo_vara", "css");
    }

    @And("^the user fills numero processo equal \"([^\"]*)\"$")
    public void theUserFillsNumeroProcessoEqual(String numero) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(numero,"#processo_numero_processo", "css");
    }

    @And("^the user fills natureza equal \"([^\"]*)\"$")
    public void theUserFillsNaturezaEqual(String natureza) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(natureza,"#processo_natureza", "css");

    }

    @And("^the user fills partes equal \"([^\"]*)\"$")
    public void theUserFillsPartesEqual(String partes) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(partes,"#processo_partes", "css");

    }

    @And("^the user fills urgente equal \"([^\"]*)\"$")
    public void theUserFillsUrgenteEqual(String urgente) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.sendKeys(urgente,"#processo_urgente", "css");

    }

    @And("^the user fills arbitragem equal \"([^\"]*)\"$")
    public void theUserFillsArbitragemEqual(String arbitragem) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.sendKeys(arbitragem,"#processo_arbitramento_s", "css");

    }

    @And("^the user fills assistente social equal \"([^\"]*)\"$")
    public void theUserFillsAssistenteSocialEqual(String assistente) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(assistente,"#processo_assistente_social", "css");
    }

    @And("^the user fills data entrada equal \"([^\"]*)\"$")
    public void theUserFillsDataEntradaEqual(String dataEntrada) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(dataEntrada,"#processo_data_entrada", "css");

    }

    @And("^the user fills data saida equal \"([^\"]*)\"$")
    public void theUserFillsDataSaidaEqual(String dataSaida) throws Throwable {
        driver.sendKeys(dataSaida,"#processo_data_saida", "css");

    }

    @And("^the user fills data agendamento equal \"([^\"]*)\"$")
    public void theUserFillsDataAgendamentoEqual(String agendamento) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(agendamento,"#processo_data_agendamento", "css");
    }

    @And("^the user fills status equal \"([^\"]*)\"$")
    public void theUserFillsStatusEqual(String status) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(status,"#processo_status", "css");
    }

    @And("^the user fills observacao equal \"([^\"]*)\"$")
    public void theUserFillsObservacaoEqual(String observacao) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.sendKeys(observacao,"#processo_observacao", "css");
    }

    @When("^the user clicks on Save button$")
    public void theUserClicksOnSaveButton() {
        processNew.clickBtnSave();
    }

    @Then("^the user should see \"([^\"]*)\" into success page$")
    public void theUserShouldSeeIntoSuccessPage(String message) throws Throwable {
        Assert.assertEquals(message, driver.getText("notice"));
        process.SetNumeroProcesso(driver.getText("//*[@id=\"codigo\"]", "xpath"));
    }

    @And("^the user clicks on Load Process button$")
    public void theUserClicksOnLoadProcessButton() {
        processGrid.clickGetProcess(process.GetNumeroProcesso());
    }

    @Then("^the user should see \"([^\"]*)\" into get page$")
    public void theUserShouldSeeIntoGetPage(String message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals(message, driver.getText("//*[@id=\"codigo\"]", "xpath"));
    }

    @And("^the user clicks on Update Process button$")
    public void theUserClicksOnUpdateProcessButton() {
        processGrid.clickUpdateProcess(process.GetNumeroProcesso());
    }

    @Then("^the user should see into get page$")
    public void theUserShouldSeeIntoGetPage() {
        Assert.assertEquals(process.GetNumeroProcesso(), driver.getText("//*[@id=\"codigo\"]", "xpath"));
    }

    @And("^the user clicks on  return button$")
    public void theUserClicksOnReturnButton() {
        menu.clickProcessReturn();
    }

    @And("^the user clicks on Delete Process button$")
    public void theUserClicksOnDeleteProcessButton(){

        processGrid.clickDeleteProcess(process.GetNumeroProcesso());
    }
}
