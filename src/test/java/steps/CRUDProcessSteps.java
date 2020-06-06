package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Home;
import pages.MenuProcess;
import support.BaseSteps;

public class CRUDProcessSteps extends BaseSteps {
    private Home home = new Home(driver);
    private MenuProcess menu = new MenuProcess(driver);
    //private ProcessGrid processGrid = new ProcessGrid(driver);
    //private ProcessNew processNew = new ProcessNew(driver);

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

    }

    @And("^the user fills vara equal \"([^\"]*)\"$")
    public void theUserFillsVaraEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills numero processo equal \"([^\"]*)\"$")
    public void theUserFillsNumeroProcessoEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills natureza equal \"([^\"]*)\"$")
    public void theUserFillsNaturezaEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills partes equal \"([^\"]*)\"$")
    public void theUserFillsPartesEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills urgente equal \"([^\"]*)\"$")
    public void theUserFillsUrgenteEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills arbitragem equal \"([^\"]*)\"$")
    public void theUserFillsArbitragemEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills assistente social equal \"([^\"]*)\"$")
    public void theUserFillsAssistenteSocialEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills data entrada equal \"([^\"]*)\"$")
    public void theUserFillsDataEntradaEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills data saida equal \"([^\"]*)\"$")
    public void theUserFillsDataSaidaEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills data agendamento equal \"([^\"]*)\"$")
    public void theUserFillsDataAgendamentoEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills status equal \"([^\"]*)\"$")
    public void theUserFillsStatusEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^the user fills observacao equal \"([^\"]*)\"$")
    public void theUserFillsObservacaoEqual(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the user clicks on Save button$")
    public void theUserClicksOnSaveButton() {
    }

    @Then("^the user should see \"([^\"]*)\" into success page$")
    public void theUserShouldSeeIntoSuccessPage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
