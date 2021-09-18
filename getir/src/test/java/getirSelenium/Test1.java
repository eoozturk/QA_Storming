package getirSelenium;

import org.junit.Test;

public class Test1 extends BaseTest{

    @Test
    public void caseAccess1() throws InterruptedException {

        TestElements reg = new TestElements(wdriver);
        reg.accBtn();
        reg.regMail("deneme@deneme.com");
        reg.regBtn();
        Thread.sleep(1000);
    }
}
