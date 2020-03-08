package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("rawtypes")
public class fundWallet {

    AndroidDriver driver;

    @FindBy (id ="com.lenddo.mobile.paylater.staging:id/fundWalletButton") MobileElement walletButton;

    @FindBy (id = "com.lenddo.mobile.paylater.staging:id/fundWalletCard") MobileElement walletCard;

    @FindBy(id ="com.lenddo.mobile.paylater.staging:id/pin_view") MobileElement pinView;

    @FindBy(id ="com.lenddo.mobile.paylater.staging:id/walletAmountToFund") MobileElement amount;

    @FindBy(id ="com.lenddo.mobile.paylater.staging:id/proceedWalletFunding") MobileElement proceed;

    @FindBy (id ="com.lenddo.mobile.paylater.staging:id/card_item") MobileElement selectACard;

    @FindBy ( id = "com.lenddo.mobile.paylater.staging:id/button_confirm_payment") MobileElement confirmPayment;

    @FindBy ( id = "com.lenddo.mobile.paylater.staging:id/button_confirm_payment") MobileElement securepay;

    @FindBy ( id = "com.lenddo.mobile.paylater.staging:id/form_fields") MobileElement topupAmount;

    public fundWallet(AndroidDriver driver) {

        this.driver = driver;

        PageFactory.initElements ( new AppiumFieldDecorator (driver ) ,this);

    }


    public void setSelectACard ( String pin){

        walletButton.click ();

        walletCard.click ();


    }

    public void sendAmount(String Amount){

        amount.sendKeys (Amount);

        proceed.click ();

        selectACard.click ();

    }

    public String confirmation() {

        confirmPayment.click ();

        securepay.click ();

        return topupAmount.getText ();

    }










}
