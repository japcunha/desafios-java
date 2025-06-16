package Curso.entities;

public class BusinessAccount extends Account{
    private Double loanLimit;


    public BusinessAccount(int number,String holder, Double balance, Double loanLimit) {
        super(number,holder,balance);
        this.loanLimit = loanLimit;
    }
    public Double getLoanLimit(){
        return loanLimit;
    }

    public void loan(double v) {

    }
}
