package pages;

import org.openqa.selenium.Keys;
import support.DriverQA;
import support.ProcessoDados;

public class ProcessGrid extends BasePage {
    public ProcessGrid(DriverQA stepsDriver){
        super(stepsDriver);
    }
    public void clickNewProcess() {
        driver.click("#btn-novo","css");
    }
    public void clickGetProcess(String numProcesso){
        String url = "//*[@id=\"btn-show_" + numProcesso + "\"]/a";
        driver.click(url, "xpath");
    }


    public void clickUpdateProcess(String numProcesso) {
        String url = "//*[@id=\"btn-edit_" + numProcesso + "\"]/a";
        driver.click(url, "xpath");
    }

    public void clickDeleteProcess(String numProcesso){
        driver.click("#btn-delete_" + numProcesso, "css");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.ChooseOkOnNextConfirmation();

    }
}
