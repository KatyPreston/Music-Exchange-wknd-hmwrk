public abstract class Instrument {
    private String type;
    private String colour;
    private double priceBought;
    private double priceSell;

    public Instrument(String type, String colour, double priceBought, double priceSell){
        this.type = type;
        this.colour = colour;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public abstract String play();

    public double calculateMarkup(){
        return this.priceSell - this.priceBought;
    }

}
