public class Endereço {
    String rua;
    String bairro;
    int numero;
    String cidade;
    String estado;
    String pais;
    int cep;

    void altera_rua(String rua, String bairro, int numero, int cep){
        this.rua=rua;
        this.bairro=bairro;
        this.numero=numero;
        this.cep=cep;
    }

    void altera_cidade(String rua, String bairro, int numero, int cep, String cidade){
        this.altera_rua(rua, bairro, numero, cep);
        this.cidade=cidade;
    }

    void altera_estado(String rua, String bairro, int numero, int cep, String cidade, String estado){
        this.altera_cidade(rua, bairro, numero, cep, cidade);
        this.estado=estado;
    }
    void altera_pais(String rua, String bairro, int numero, int cep, String cidade, String estado, String pais){
        this.altera_estado(rua, bairro, numero, cep, cidade, estado);
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereço{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", cep=" + cep +
                '}';
    }
}
