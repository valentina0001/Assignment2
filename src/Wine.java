public class Wine extends Product {

   private double bottleVolume;

    public static final double calculateExtraTax =  10;
    public Wine( String name, int barKod, int basePrice, double bottleVolume) {
        super (name, barKod, basePrice );
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String getInfo(){
        return super.getInfo() +
        "Wine bottle volume: " + bottleVolume + " ml" + "\n" ;
    }
    @Override
    public double calculateFinalPrice(){
        return super.calculateFinalPrice() + super.calculateFinalPrice() * calculateExtraTax/100 ;
    }
     }


