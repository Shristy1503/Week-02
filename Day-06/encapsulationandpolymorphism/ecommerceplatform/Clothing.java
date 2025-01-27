package encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product implements Taxable{
    private double discount;
    private double taxRate;
    //constructor
    public Clothing(int productId, String name, double price, double discount, double taxRate){
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }
    //override calculate discount details

    @Override
    public double calculateDiscount() {
        return getPrice() * discount;
    }
    //override calculate tax method

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    //override get tax details method

    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate * 100 + "%";
    }
}
