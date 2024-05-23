public class Employee {
    private String nome;
    private String sobrenome;
    private double salario_mensal;

    public Employee(String nome, String sobrenome, double salario_mensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void SetSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public double getSalario_mensal(){
        return salario_mensal;
    }
    public void setSalario_mensal(double salario_mensal){
        if(salario_mensal>0){
        this.salario_mensal = salario_mensal;
    }
    }
    public double salario_anual(){
        double salario_anual = salario_mensal * 12;
        return salario_anual;
    }
    public double aumento__com_salario_anual(int porcentagem){
        this.salario_mensal = (this.salario_mensal + (this.salario_mensal * porcentagem) / 100)*12;
        return this.salario_mensal;
    }
    
    public boolean equals(Object x){
        if(x==this){
            return true;
        }
        if (!(x instanceof Employee)||x==null){
            return false;
        }
        Employee em = (Employee) x;
        return this.nome == em.nome;
    }

    public String toString(){
        return("O/A,"+nome+" "+sobrenome+"Recebe:"+salario_mensal);
    }
}
