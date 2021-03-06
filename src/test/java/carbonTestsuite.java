import frameWork.baseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

@SuppressWarnings("rawtypes")
public class carbonTestsuite {

    AndroidDriver driver;
    baseClass base;
    homeScreen home;
    dashBoard dash;
    rechargeAirtime recharge;
    fundWallet fund;
    filterTransactions filter;


    public carbonTestsuite() {
        base = PageFactory.initElements ( driver , baseClass.class );
    }


    @BeforeMethod
    public void login () {

        home = base.initializeDriver ();

        home.setLogin ( "08990001101", "1234" );

        dash = home.login ("123456");

        Assert.assertEquals ("Home", dash.validateLogin ());
    }

    @Test (priority=1)
    public void airtimeRecharge () {

       recharge = dash.recharge ();

       recharge.initTransaction ();

       recharge.setAvailableOption ();

       recharge.setComfirmPayment ();

       recharge.enterPin ( "1234" );

    }

    @Test (priority=2)
    public void walletFunding () {

        fund = dash.walletFunding ();

        fund.setSelectACard ( "1234" );

        fund.sendAmount ( "1000" );

        fund.confirmation ();
    }

    @Test (priority=3)
    public void transactionFiltering () {

        filter = dash.transactionFilter ();

        filter.setFilterbyWeek ();

        filter.setFilterbyMonth ();
    }

}
