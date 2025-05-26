package SistemaDeNotas.entity;

public class Aluno {

    public String nome;
    public double grade1;
    public double grade2;
    public double grade3;


    public double gradeFinal(){
        return grade1 + grade2 + grade3;
    }
    public double contagemPontos(){
        if ( gradeFinal() < 60.0){
            return 60.0 - gradeFinal();

        }else {
            return 0.0;
        }
    }
}
