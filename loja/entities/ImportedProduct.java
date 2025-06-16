package loja.entities;

public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct(Double customFee) {
        this.customFee = customFee;
    }
    public ImportedProduct(String name, Double price, Double customFee) {
        this.setName(name);
        this.setPrice(price);
        this.customFee = customFee;

    }

    public String priceTag() {
    return null;
    }
    public Double totalPrice(){
        return null;
    }
}
