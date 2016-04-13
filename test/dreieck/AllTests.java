package dreieck;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ gleichSchenkeligTest.class, gleichSeitigTest.class, istDreieckTest.class, rechtWinkeligTest.class })
public class AllTests {

}
