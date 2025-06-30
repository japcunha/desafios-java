package Contrato.model.services;

import Contrato.model.entities.Contract;
import Contrato.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
    public void processContract(Contract contract, int months){
        contract.getInstallments().add(new Installment(LocalDate.of(2018,7,25),206.04));
    }

}
