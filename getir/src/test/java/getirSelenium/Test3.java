package getirSelenium;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test3 extends BaseTest{

    @Test
    public void caseAccess3() throws InterruptedException{

        TestElements shp = new TestElements(wdriver);
        shp.shopButton();
        shp.dressButton();
        shp.dressSelect();
        Thread.sleep(1500);
        shp.addChart();
        Thread.sleep(1500);
        shp.viewChart();
        Thread.sleep(1500);
        shp.checkOut();
        Thread.sleep(2000);
        shp.billingShop("Getir","Test", "Kadıköy, Turkey", "34000","Istanbul","123456789","getirtest@gmail.com");
        Thread.sleep(3500);
        shp.billingCheck();
        Thread.sleep(1500);
        shp.placeorder();
        Thread.sleep(2500);
        WebElement controltext=wdriver.findElement(new By.ByXPath("//*[@id=\'post-91\']/div/div/form[3]/div[1]/ul/li"));
        String text=controltext.getText();
        if(text == "Invalid payment method."){System.out.println("Test is successed");}
    }
}
