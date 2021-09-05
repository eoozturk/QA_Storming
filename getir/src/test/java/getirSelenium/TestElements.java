package getirSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestElements {

    WebDriver driver;

    /*Case1:Register Web Elements*/
    By accBtn = new By.ById("menu-item-844");
    By regMail = new By.ById("reg_email");
    By regBtn = new By.ByName("register");

    /*Case2:Change Profil Web Elements*/
    By accMail = new By.ById("username");
    By accPss = new By.ById("password");
    By accBtn2 = new By.ByName("login");
    By accDetail = new By.ByLinkText("Account details");
    By accName = new By.ById("account_first_name");
    By accLastname = new By.ById("account_last_name");
    By crrPsswrd = new By.ById("password_current");
    By newPsswrd = new By.ById("password_1");
    By confPsswrd = new By.ById("password_2");
    By sChange = new By.ByName("save_account_details");

    /*Case3:Order Web Elements*/
    By shpBtn = new By.ById("menu-item-834");
    By drsBtn = new By.ByLinkText("Dresses");
    By drsBtn2 = new By.ByXPath("//*[@id=\'primary\']/ul/li[2]/a[1]/h2");
    By adChrt = new By.ByName("add-to-cart");
    By vwChrt = new By.ByLinkText("View cart");
    By chkout = new By.ByLinkText("Proceed to checkout");
    By billName = new By.ById("billing_first_name");
    By billLaName = new By.ById("billing_last_name");
    By billAdr = new By.ById("billing_address_1");
    By zpCode = new By.ById("billing_postcode");
    By cty = new By.ByXPath("//*[@id=\'billing_city\']");
    By phn = new By.ByXPath("//*[@id=\'billing_phone\']");
    By billMail = new By.ByXPath("//*[@id='billing_email']");
    By billChck = new By.ByXPath("//*[@id=\'mailpoet_woocommerce_checkout_optin\']");
    By plcOrdr = new By.ById("place_order");

    public TestElements(WebDriver wdriver)
    {
        this.driver=wdriver;
    }
    /*Case1*/
    public void accBtn() { driver.findElement(accBtn).click(); }

    public void regMail(String rm){ driver.findElement(regMail).sendKeys(rm); }

    public void regBtn(){ driver.findElement(regBtn).click(); }

    /*Case2*/
    public void accMail(String accm){ driver.findElement(accMail).sendKeys(accm); }

    public void accPsswrd(String accpss){ driver.findElement(accPss).sendKeys(accpss); }

    public void accLogin(){ driver.findElement(accBtn2).click(); }

    public void accDetail(){ driver.findElement(accDetail).click();}

    public void accName(String accfm, String acclm)
    {
        driver.findElement(accName).clear();
        driver.findElement(accName).sendKeys(accfm);
        driver.findElement(accLastname).clear();
        driver.findElement(accLastname).sendKeys(acclm);
    }

    public void crrPassword(String crppss){ driver.findElement(crrPsswrd).sendKeys(crppss); }

    public void newPassword(String npss){ driver.findElement(newPsswrd).sendKeys(npss); }

    public void confirmPassword(String cnpss){ driver.findElement(confPsswrd).sendKeys(cnpss); }

    public void saveChange(){ driver.findElement(sChange).click();}

    /*Case3*/
    public void shopButton(){ driver.findElement(shpBtn).click();}

    public void dressButton(){ driver.findElement(drsBtn).click();}

    public void dressSelect(){ driver.findElement(drsBtn2).click();}

    public void addChart(){ driver.findElement(adChrt).click();}

    public void viewChart(){ driver.findElement(vwChrt).click(); }

    public void checkOut(){ driver.findElement(chkout).click(); }

    public void billingShop(String bname, String blname, String badrss, String bcode, String bcty, String bphn, String bmail)
    {
        driver.findElement(billName).clear();
        driver.findElement(billName).sendKeys(bname);
        driver.findElement(billLaName).clear();
        driver.findElement(billLaName).sendKeys(blname);
        driver.findElement(billAdr).clear();
        driver.findElement(billAdr).sendKeys(badrss);
        driver.findElement(zpCode).clear();
        driver.findElement(zpCode).sendKeys(bcode);
        driver.findElement(cty).clear();
        driver.findElement(cty).sendKeys(bcty);
        driver.findElement(phn).clear();
        driver.findElement(phn).sendKeys(bphn);
        driver.findElement(billMail).clear();
        driver.findElement(billMail).sendKeys(bmail);
    }
    public void billingCheck(){ driver.findElement(billChck).click(); }
    public void placeorder(){ driver.findElement(plcOrdr).click(); }
}