package Contrato.model.entities;

import Contrato.model.services.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFee(double amount) {
        return amount * 2.0;
    }

    @Override
    public Double interest(Double amount, int months) {
        return amount * 0.01 * months;
    }
}
