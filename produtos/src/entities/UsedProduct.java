package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufacture;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, LocalDate manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public LocalDate getManufacture() {
        return manufacture;
    }

    public void setManufacture(LocalDate manufacture) {
        this.manufacture = manufacture;
    }

    public String priceTag(){
        return getName() + "(Used) $ " + getPrice() + " (Manufacture Date: " + manufacture.format(formatter) + ")";
    }


}
