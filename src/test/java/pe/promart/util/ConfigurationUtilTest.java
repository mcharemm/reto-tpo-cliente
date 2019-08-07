package pe.promart.util;

import static org.junit.Assert.*;

public class ConfigurationUtilTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.Test
    public void buildURL() {
        String expectedValue = "https://reto-intercorp-199e9.firebaseio.com";
        String input = "reto-intercorp-199e9";
        String actualValue = ConfigurationUtil.buildUrl(input);
        assertEquals(actualValue, expectedValue);
    }
}