import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Piano", "Black", 500, 800, "Grand");
    }

    @Test
    public void canGetType(){
        assertEquals("Piano", piano.getType());
    }

    @Test
    public void canGetColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void canGetPriceBought(){
        assertEquals(500, piano.getPriceBought(), 0.1);
    }

    @Test
    public void canGetPriceSell(){
        assertEquals(800, piano.getPriceSell(), 0.1);
    }

    @Test
    public void canGetSize(){
        assertEquals("Grand", piano.getSize());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(300, piano.calculateMarkup(), 0.1);
    }

    @Test
    public void canPlaySound(){
        assertEquals("Smooth Melody", piano.play());
    }

}
