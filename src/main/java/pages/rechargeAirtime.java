package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("ALL")
public class rechargeAirtime {

    AndroidDriver driver;


    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/fab") MobileElement transactions;

    @FindBy(id ="com.lenddo.mobile.paylater.staging:id/top_sheet_button_top_up") MobileElement recharge;

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/biller_logo") MobileElement selectnumber;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/card_mobile_network") MobileElement selectNetwork;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/button_next") MobileElement Next;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/walletRadioButton") MobileElement radioButton;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/button_confirm_payment") MobileElement comfirmPayment;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/button_text_secure_pay") MobileElement securepay;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/pin_view") MobileElement enterPin;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/successMessageText") MobileElement sucessMessage;

    public rechargeAirtime(AndroidDriver driver) {

        this.driver = driver; 

        PageFactory.initElements ( new AppiumFieldDecorator (driver ) ,this );

    }


    public void initTransaction() {

        transactions.click ();

        recharge.click();

    }

    public void setAvailableOption (){

        selectnumber.click ();

        selectNetwork.click ();

        Next.click ();

    }

    public void setComfirmPayment () {

        radioButton.click ();

        comfirmPayment.click ();

        securepay.click ();
    }

    public String enterPin (String pin) {

        enterPin.sendKeys (pin);

        return sucessMessage.getText ();

    }
}


