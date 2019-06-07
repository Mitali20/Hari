import Utils.Browsersetup;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.BrokenBarrierException;

public class Hooks {

    Browsersetup browsersetup;

    String Url ="https://www.facebook.com";
    @Before
    public void openMyTestEnv(){
        browsersetup =new Browsersetup();
        browsersetup.openMyTestEnv(Url);
        browsersetup.printmessage("My Test Env is open now");

    }
    @After
    public void  closeMytestEnv (){
        browsersetup.closeBrowser();
        browsersetup.printmessage("My Test Env is closed");
    }

}
