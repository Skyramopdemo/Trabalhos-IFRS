public class Professor {
    Funcionario funcionario;
    String Materia;
    boolean Licensa;
    String Escola;



    void Situacao_Licensa(boolean SituacaoL){
        this.Licensa = SituacaoL;
    }
    void Mudar_Escola(String NovaEscola){
        this.Escola = NovaEscola;
    }

}
