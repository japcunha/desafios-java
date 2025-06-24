package Estacionamento.model.entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    public Invoice(){
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBaiscPayment(Double baiscPayment) {
        this.basicPayment = baiscPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalPayment(){
        return getBasicPayment() - getTax();
    }
}
