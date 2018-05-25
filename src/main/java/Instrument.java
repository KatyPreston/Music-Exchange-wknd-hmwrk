public abstract class Instrument implements IPlay, ISell {
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

    public String getType(){
        return this.type;
    }

    public String getColour(){
        return this.colour;
    }

    public double getPriceBought() {
        return this.priceBought;
    }

    public double getPriceSell() {
        return this.priceSell;
    }
}
