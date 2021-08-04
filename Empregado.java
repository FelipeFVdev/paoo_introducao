public class Empregado{
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double cauculaSalario(){
        if (tipo == 1){
            return salaraio;
        }
        else if (tipo == 2){
            return salaraio + salaraio * comissao;
        }
        else if (tipo == 3){
            return salaraio + bonus;
        }
        return 0;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

}