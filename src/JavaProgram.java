public class JavaProgram {


    public static void main(String[] args) {

        Product product = new Product( " SomeProduct ", 11000,  200);
        System.out.println(product.getInfo());


        Chocolate chocolade = new Chocolate( " Milka ", 11000,   100,  0.80 );
        System.out.println(chocolade.getInfo());


        Wine wine = new Wine (" Vino ", 11100,  1000, 1.7);
        System.out.println(wine.getInfo());

    }
}
