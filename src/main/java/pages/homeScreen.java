package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("ALL")
public class homeScreen {

    AndroidDriver driver;


    public homeScreen(AndroidDriver driver) {

        this.driver = driver;

        PageFactory.initElements (new AppiumFieldDecorator ( driver ) , this );

    }

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/tutorial_skip") MobileElement Skip;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/user_type_existing" ) MobileElement Sign_in;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/sign_in_phone" ) MobileElement inputPhoneNo;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/sign_in_pin" ) MobileElement inputPin;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/sign_in_next" ) MobileElement signInButton;

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/otpMaskedText") MobileElement veriCode;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/tvRightNow") MobileElement Proceed;




    public void setLogin (String PhoneNo, String Pin)  {

//        WebDriverWait wait = new WebDriverWait (driver, 6);
        Skip.click ();

//        wait.until( ExpectedConditions.alertIsPresent());

//        Alert alert = driver.switchTo().alert();

//        alert.accept();


        Sign_in.click ();

        inputPhoneNo.sendKeys ( PhoneNo );

        inputPin.sendKeys ( Pin );

    }

    public dashBoard login (String code)  {

        signInButton.click ();

        veriCode.sendKeys ( code );

        Proceed.click ();

        return new dashBoard( driver);

    }




}
