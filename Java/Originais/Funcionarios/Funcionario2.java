public class Funcionario {
    double Salario;
    String Cargo;
    int CPF;
    Endereco endereco;

    void Aumento(double Novo_Salario){
        this.Salario = Novo_Salario;
    }
    void Mudar_Cargo(String Novo_Cargo){
        this.Cargo = Novo_Cargo;
    }
}
