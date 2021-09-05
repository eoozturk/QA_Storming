package getirSelenium;

import org.junit.Test;

public class Test1 extends BaseTest{

    @Test
    public void caseAccess1() throws InterruptedException {

        TestElements reg = new TestElements(wdriver);
        reg.accBtn();
        reg.regMail("150201214@kocaeli.edu.tr");
        reg.regBtn();
        Thread.sleep(1000);
    }
}
