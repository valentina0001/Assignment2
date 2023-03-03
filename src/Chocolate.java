 public class Chocolate extends Product {

    double  weight;

    public Chocolate(String name, int barKod, double basePrice, double weight ){
         super( name, barKod, basePrice);
         this.weight= weight;
     }

     @Override
     public String getInfo() {
         return super.getInfo()+
                 "Chocolade weight: " + weight +" kg"  + "\n";
     }
 }
