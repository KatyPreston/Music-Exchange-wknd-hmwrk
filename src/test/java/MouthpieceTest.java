import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouthpieceTest {
    Mouthpiece mouthpiece;

    @Before
    public void before(){
        mouthpiece = new Mouthpiece("B12", 20, 30);
    }

    @Test
    public void canGetType(){
        assertEquals("B12", mouthpiece.getType());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(20, mouthpiece.getPriceBought(), 0.1);
    }

    @Test
    public void canGetPriceSell(){
        assertEquals(30, mouthpiece.getPriceSell(), 0.1);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10, mouthpiece.calculateMarkup(), 0.1);
    }
}
