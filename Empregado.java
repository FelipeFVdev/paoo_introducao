public class Empregado{
    private String nome;
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;
    private int tipo;



    public void setTipo (int tipo){
        this.tipo = tipo;
    }

    public int getTipo (){
        return this.tipo;
    }
    
public void setSalario (double salaraio){
    this.salaraio = salaraio;
}

public void setComissao (double comissao){
    this.comissao = comissao;
}

public void setBonus (double bonus){
    this.bonus = bonus;
}

public void getSalario (){
    return this.salaraio;
}

public void getComissao (){
    return this.comissao;
}

public void getBonus (){
    return this.bonus;
}

    public double calculaSalario(){
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