package Curso.entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account(){
    }

    public Account(Integer number, String holder, Double balance){
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void withdraw(double amount){
        balance -= amount;

    }
    public void deposit(double amount){
        balance += amount;
    }
}
