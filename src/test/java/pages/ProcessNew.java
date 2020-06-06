package pages;

import support.DriverQA;

public class ProcessNew extends BasePage{
    public ProcessNew(DriverQA stepsDriver){
        super(stepsDriver);
    }

    public void clickBtnSave() {
        driver.click("#btn-save", "css");
    }
}
