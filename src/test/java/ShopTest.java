import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    ISell piano;
    Mouthpiece mouthpiece;
    Reed reed;

    @Before
    public void before(){
        piano = new Piano("Piano", "Pink", 300, 400, "Studio");
        ArrayList<ISell> stock = new ArrayList<>();

        shop = new Shop(stock, 1000);
    }

    @Test
    public void canGetStockCount(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canGetFunds(){
        assertEquals(1000, shop.getFunds(), 0.1);
    }

    @Test
    public void canAddToStock(){
        shop.addItemToStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItemToStock(piano);
        shop.removeItemFromStock(piano);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canBuyItem(){
        shop.buy(piano);
        assertEquals(1, shop.getStockCount());
        assertEquals(700, shop.getFunds(), 0.1);
    }

    @Test
    public void canSellItem(){
        shop.addItemToStock(piano);
        shop.addItemToStock(piano);
        shop.sell(piano);
        assertEquals(1, shop.getStockCount());
        assertEquals(1400, shop.getFunds(), 0.1);
    }

    @Test
    public void canCalculateTotalPossibleProfits(){
        Mouthpiece mouthpiece = new Mouthpiece("B12", 20, 30);
        Reed reed = new Reed(3.5, 5, 6);
        Clarinet clarinet = new Clarinet("Woodwind", "Black", 200, 300, mouthpiece, reed);
        shop.addItemToStock(piano);
        shop.addItemToStock(clarinet);
        shop.addItemToStock(reed);
        shop.addItemToStock(mouthpiece);

        assertEquals(211, shop.maxTotalProfits(), 0.1);

    }
}
