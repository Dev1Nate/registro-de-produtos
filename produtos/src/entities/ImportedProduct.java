package entities;

public class ImportedProduct extends Product{
    private double customFee;

    public ImportedProduct(double customFee) {
        this.customFee = customFee;
    }

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return super.getPrice() + customFee;
    }

    @Override
    public String priceTag(){
        return getName() + ", $" + totalPrice() + " (Custom Fee: $ " + customFee + ")";

    }
}
