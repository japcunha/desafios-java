package Contrato.model.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    Double interest(Double amount, int months);



}
