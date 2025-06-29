package Contrato.application.entities;

public class Contract {
        private Double juros;
        private Double taxa;

        public Contract(){
        }

    public Contract(Double juros, Double taxa) {
        this.juros = juros;
        this.taxa = taxa;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
}
