package pe.promart.logic;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class CalculatePossibleDeathDateTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getPossibleDeathDate() {
        Date expectedValue = new Date(2075,01,27);
        Date input = new Date(2000,01,27);
        Date actualValue = CalculatePossibleDeathDate.getPossibleDeathDate(input);
        assertEquals(expectedValue, actualValue);
    }
}
