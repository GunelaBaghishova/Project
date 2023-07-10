package io.loop.step_definitions;
import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.loop.utilities.BrowserUtils;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {

    private static final Logger LOG = LogManager.getLogger();

    @Before
    public void setUp(){
        Driver.getDriver();
        LOG.info("...........START AUTOMATION.......LOOP ACADEMY......");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }
//       Driver.closeDriver();
//     LOG.info("...........END AUTOMATION.......LOOP ACADEMY.....");//
    }


}