package getirSelenium;
import org.junit.Test;

public class Test2 extends BaseTest{

    @Test
    public void caseAccess2() throws InterruptedException{

        TestElements acc = new TestElements(wdriver);

        acc.accBtn();
        acc.accMail("150201214@kocaeli.edu.tr");
        acc.accPsswrd("kbKC4A8eXGvm");
        acc.accLogin();
        acc.accDetail();
        Thread.sleep(2000);

        acc.accName("Getir", "Test");
        acc.crrPassword("kbKC4A8eXGvm");
        acc.newPassword("Get123456");
        acc.confirmPassword("Get123456");
        Thread.sleep(2000);
        acc.saveChange();
    }
}
