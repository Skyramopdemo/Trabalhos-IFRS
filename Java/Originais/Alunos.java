public class Alunos{

    String Curso;
    int Sementre_Ano;
    int Matricula;
    int Idade;
    int CPF;
    Endereco endereco;


    void NovoCuros(String Novo_Curso){
        this.Curso = Novo_Curso;
    }
    void NovoSemestre_Ano(int Novo_Semestre_Ano){
        this.Sementre_Ano = Novo_Semestre_Ano;
    }
    void Envelheceu(int Velho){
        this.Idade = Velho;
    }

}