public class Product {
  String name;
  int barKod;
  double basePrice;

    public static final double TaxMultiplier = 20;

    public Product() {

    }

    {

    }
    public Product(String name, int barKod, double basePrice ) {
        this.name = name;
        this.barKod = barKod;
        this.basePrice = basePrice;

        }
        public  double calculateFinalPrice(){
        return (basePrice + ( basePrice * TaxMultiplier/100 ));
        }

public String getInfo(){
        return "Product name : " + name + "\n" +
                "Product bar - kod : " + barKod + "\n" +
                "Product base price: " + basePrice + " dinara " + "\n" +
                "Final price : " + calculateFinalPrice() + " dinara " + "\n"  ;
}

}