public class Clarinet extends Instrument{
    private Mouthpiece mouthpiece;
    private Reed reed;

    public Clarinet(String type, String colour, double priceBought, double priceSell, Mouthpiece mouthpiece, Reed reed){
        super(type, colour, priceBought, priceSell);
        this.mouthpiece = mouthpiece;
        this.reed = reed;
    }

    public Mouthpiece getMouthpiece(){
        return this.mouthpiece;
    }

    public Reed getReed(){
        return this.reed;
    }

    public String play(){
        return "Jazzy Jazz";
    }

    public void setReed(Reed reed){
        this.reed = reed;
    }

    public void setMouthpiece(Mouthpiece mouthpiece){
        this.mouthpiece = mouthpiece;
    }
}
