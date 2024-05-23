public class Endereco {
    String Pais;
    String Estado;
    String Municipio;
    String Rua;
    int N_Casa;
    int CEP;

    void mudarEndereco(String NovoPais, String NovoEstado, String NovoMunicipio, String NovaRua, int Novo_N_Casa, int NovoCEP){
        this.Pais = NovoPais;
        this.Estado = NovoEstado;
        this.Municipio = NovoMunicipio;
        this.Rua = NovaRua;
        this.N_Casa = Novo_N_Casa;
        this.CEP = NovoCEP;
    }
}
