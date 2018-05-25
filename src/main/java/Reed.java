public class Reed implements ISell{
    private double thickness;
    private double priceBought;
    private double priceSell;

    public Reed(double thickness, double priceBought, double priceSell){
        this.thickness = thickness;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }


    public double getThickness() {
        return this.thickness;
    }

    public double getPriceBought() {
        return this.priceBought;
    }

    public double getPriceSell() {
        return this.priceSell;
    }

    public double calculateMarkup(){
        return this.priceSell - this.priceBought;
    }
}
