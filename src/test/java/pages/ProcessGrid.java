package pages;

import support.DriverQA;

public class ProcessGrid extends BasePage {
    public ProcessGrid(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void clickNewProcess() {
        driver.click("#btn-novo","css");
    }


}
