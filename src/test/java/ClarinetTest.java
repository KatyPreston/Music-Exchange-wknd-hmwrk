import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {
    Clarinet clarinet;
    Mouthpiece mouthpiece;
    Reed reed;

    @Before
    public void before(){
        mouthpiece = new Mouthpiece("B12", 20, 30);
        reed = new Reed(4, 5, 8);
        clarinet = new Clarinet("Woodwind", "Blue", 100, 150, mouthpiece, reed);
    }

    @Test
    public void canGetType(){
        assertEquals("Woodwind", clarinet.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("Blue", clarinet.getColour());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(100, clarinet.getPriceBought(), 0.1);
    }

    @Test
    public void canGetPriceSell(){
        assertEquals(150, clarinet.getPriceSell(), 0.1);
    }

    @Test
    public void canGetMouthpiece(){
        assertEquals(mouthpiece, clarinet.getMouthpiece());
    }

    @Test
    public void canGetReed(){
        assertEquals(reed, clarinet.getReed());
    }

    @Test
    public void canSetMouthpiece(){
        Mouthpiece mouthpiece2 = new Mouthpiece("B16", 25, 35);
        clarinet.setMouthpiece(mouthpiece2);
        assertEquals(mouthpiece2, clarinet.getMouthpiece());
    }

    @Test
    public void canSetReed(){
        Reed reed2 = new Reed(3.5, 6, 9);
        clarinet.setReed(reed2);
        assertEquals(reed2, clarinet.getReed());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, clarinet.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlaySound(){
        assertEquals("Jazzy Jazz", clarinet.play());
    }

}
