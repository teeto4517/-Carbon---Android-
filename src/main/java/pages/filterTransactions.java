package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings("ALL")
public class filterTransactions {

    AndroidDriver driver;


    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/viewWalletTransactionsButton") MobileElement transactions;

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/title_menu_item_other") MobileElement filter;

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/dateControlLastWeek") MobileElement filterbyWeek;

    @FindBy(id = "com.lenddo.mobile.paylater.staging:id/dateControlLastMonth") MobileElement filterbyMonth;


    public filterTransactions (AndroidDriver driver) {
        this.driver = driver;

        PageFactory.initElements ( new AppiumFieldDecorator (driver ) ,this );

    }

    public void setFilterbyWeek () {

        transactions.click ();

        filter.click ();

        filterbyWeek.click ();
    }

    public void setFilterbyMonth () {

        filter.click ();

        filterbyMonth.click ();
    }

}
