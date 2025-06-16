package loja.entities;

import java.util.Date;

public class UsedProduct extends Product{
    private Date manufatureDate;

    public UsedProduct(String name, Double price,Date manufatureDate) {
        this.setName(name);
        this.setPrice(price);
        this.manufatureDate = manufatureDate;
    }
    public String priceTag(){
        return null;
    }

    public Date getManufatureDate() {
        return manufatureDate;
    }

}
