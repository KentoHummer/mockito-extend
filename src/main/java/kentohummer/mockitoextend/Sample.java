package kentohummer.mockitoextend;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Sample class.
 */
public class Sample {

    Logger logger = Logger.getGlobal();

    public void method1() {
        logger.log(Level.INFO, "method1");
    }
}
