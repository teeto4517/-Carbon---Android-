package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("ALL")
public class dashBoard {

    AndroidDriver driver;

    public dashBoard(AndroidDriver driver) {

        this.driver = driver;

        PageFactory.initElements ( new AppiumFieldDecorator (driver ) ,this );
    }

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/title_text") MobileElement assertHome;


    public String validateLogin () {

        return assertHome.getText ();

    }

    public rechargeAirtime recharge () {

        return new rechargeAirtime (driver);

    }

    public fundWallet walletFunding () {

        return new fundWallet (driver);
    }

    public filterTransactions transactionFilter () {

        return new filterTransactions ( driver );
    }


}
