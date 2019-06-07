import Utils.Browsersetup;
import org.junit.Test;

public class MyTestCase extends Hooks{

    Browsersetup browsersetup;

    @Test
    public void myFirstTest() {
        browsersetup = new Browsersetup();
        browsersetup.printmessage("My TEst1");
    }

    @Test
    public void mySecondTest() {
        browsersetup = new Browsersetup();
        browsersetup.printmessage("My TEst2");
    }

    @Test
    public void myThirdTest() {
        browsersetup = new Browsersetup();
        browsersetup.printmessage("My TEst3");
    }
}
