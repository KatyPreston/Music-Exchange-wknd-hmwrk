import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;
    private double funds;

    public Shop(ArrayList<ISell> stock, double funds){
        this.stock = stock;
        this.funds = funds;
    }



    public int getStockCount() {
        return this.stock.size();
    }

    public double getFunds() {
        return this.funds;
    }

    public void addItemToStock(ISell iSell){
        this.stock.add(iSell);
    }

    public void removeItemFromStock(ISell iSell){
        this.stock.remove(iSell);
    }

    public void buy(ISell iSell){
        this.funds -= iSell.getPriceBought();
        this.addItemToStock(iSell);
    }

    public void sell(ISell iSell){
        this.funds += iSell.getPriceSell();
        this.removeItemFromStock(iSell);
    }
}
