public class Piano extends Instrument{
    private String size;

    public Piano(String type, String colour, double priceBought, double priceSell, String size){
        super(type, colour, priceBought, priceSell);
        this.size = size;
    }


    public String getSize(){
        return this.size;
    }

    public String play(){
        return "Smooth Melody";
    }

}
