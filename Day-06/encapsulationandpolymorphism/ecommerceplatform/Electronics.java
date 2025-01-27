package encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product implements Taxable{
   private double discount;
   private double taxRate;
   //onstructor
    public Electronics(int productId, String name, double price, double discount, double taxRate){
        super(productId, name, price);
        this.discount = discount;
        this.taxRate = taxRate;
    }

    //override calculate discount method
    @Override
    public double calculateDiscount(){
        return getPrice() * discount;
    }
    // override calculate tax method
    @Override
    public double calculateTax(){
        return getPrice() * taxRate;
    }
    //override get tax details method
    @Override
    public String getTaxDetails(){
        return "Tax rate is:" + taxRate * 100 + " %";
    }

}
