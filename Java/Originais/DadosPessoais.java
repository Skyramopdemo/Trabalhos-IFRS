public class DadosPessoais {
    String nome;
    Endereço endereço;
    String nacionalidade;


    void altera_rua(String rua, String bairro, int numero, int cep){
        this.endereço.altera_rua(rua, bairro, numero, cep);
    }
    void altera_cidade(String rua, String bairro, int numero, int cep, String cidade){
        this.endereço.altera_cidade(rua, bairro, numero, cep, cidade);
    }
    void altera_estado(String rua, String bairro, int numero, int cep, String cidade, String estado) {
        this.altera_estado(rua, bairro, numero, cep, cidade, estado);

    }
    void altera_pais(String rua, String bairro, int numero, int cep, String cidade, String estado, String pais){
        this.altera_pais(rua, bairro, numero, cep, cidade, estado, pais);
    }

    @Override
    public String toString() {
        return "DadosPessoais{" +
                "nome='" + nome + '\'' +
                ", endereço=" + endereço +
                ", nacionalidade='" + nacionalidade + '\'' +
                '}';
    }
}
