import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.elad.pages.*;
import org.apache.commons.io.FileUtils;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MainTestRun {
    private static WebDriver driver;
    private static final ExtentReports extent = new ExtentReports();
    private static ExtentTest test;
    private Object MethodSorters;


    @BeforeClass
    public static void runOnceBeforeClass() throws Exception {
        String browser = ReadFromXML.getData("browserType");
        String testUrl = ReadFromXML.getData("testUrl");
        //String browser = "Chrome";


        System.setProperty("webdriver.gecko.driver", "/Users/eladyerushalmi/QA Experts/Drivers/geckodriver");
        driver = WebDriverSingleton.getInstance(browser);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    /*    ExtentObserver htmlReporter = null;
        extent.attachReporter(htmlReporter);
        test = extent.createTest("Buyme", "ff");


        extent.setSystemInfo("Envirmant", "production");
        test.log(Status.INFO, "connecting driver");
*/

        //driver.get(ReadFromXML.getData("URL"));
        driver.get(testUrl);

    }


    //@Test
    public void Test01_OpenRegistration() throws IOException {
        RegistrationScreen.Open_Registration(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());


    }

    //@Test
    public void Test02_FillRegistrationForm() throws IOException {
        RegistrationScreen.Fill_Registration_form(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());

    }

    //create another test that calls RegistrationScreen.loginWithExistingUser

    //@Test
    public void TestLogin() {
        RegistrationScreen.loginWithExistingUser(driver);
    }

    @Test
    public void Test03_DropMenuChoosing() throws IOException {
        HomeScreen.Drop_Menu_Choosing(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());


    }


    @Test
    public void Test04_ChooseGift() throws IOException {
        ChooseGift.webPageChangeCheck(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());
        ChooseGift.pickBuisness(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());

    }

    @Test
    public void Test05_SenderReceiverInfo() throws IOException {
        //SenderReceiverInfo.senderReceiverForm(driver);
        //SenderReceiverInfo.pictureUpload(driver);
        //SenderReceiverInfo.emailSelection(driver);
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("/Users/eladyerushalmi/BuyMe-website/ScreenShot")).build());

    }

    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath + ".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath + ".png";
    }


    //@AfterClass
    public static void AfterClass() {
        driver.quit();
        extent.flush();

    }
}






