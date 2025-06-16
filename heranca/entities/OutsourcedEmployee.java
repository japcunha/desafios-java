package heranca.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(Double valuePerHour, Integer hours, String name, Double additionalCharge) {
        super(valuePerHour, hours, name);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
