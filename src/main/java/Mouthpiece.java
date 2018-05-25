public class Mouthpiece implements ISell{
    private String type;
    private double priceBought;
    private double priceSell;

    public Mouthpiece(String type, double priceBought, double priceSell){
        this.type = type;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getType(){
        return this.type;
    }

    public double getPriceBought(){
        return this.priceBought;
    }

    public double getPriceSell() {
        return this.priceSell;
    }

    public double calculateMarkup(){
        return this.priceSell - this.priceBought;
    }
}
