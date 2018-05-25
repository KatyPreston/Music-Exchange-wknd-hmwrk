import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReedTest {
    Reed reed;

    @Before
    public void before(){
        reed = new Reed(2.5, 5, 7);
    }

    @Test
    public void canGetThickness(){
        assertEquals(2.5, reed.getThickness(), 0.1);
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(5, reed.getPriceBought(), 0.1);
    }

    @Test
    public void canGetPriceSell(){
        assertEquals(7, reed.getPriceSell(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2, reed.calculateMarkup(), 0.1);
    }
}

