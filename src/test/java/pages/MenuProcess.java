package pages;

import com.sun.xml.internal.ws.resources.UtilMessages;
import support.DriverQA;

import java.util.Timer;

public class MenuProcess extends BasePage{
    public MenuProcess(DriverQA driver){
        super(driver);
    }

    public void clickProcess() {
        driver.click("#processos", "css");
    }

    public void clickProcessReturn() {
        driver.click("/html/body/main/div/a[2]", "xpath");
    }
}
