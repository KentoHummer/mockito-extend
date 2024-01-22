package kentohummer.mockitoextend;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.logging.Logger;

/**
 * Class to test the sample class.
 */
class SampleTest {
    @Mock
    Logger logger;
    @InjectMocks
    Sample sample;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMethod1() {
        sample.method1();
    }
}
