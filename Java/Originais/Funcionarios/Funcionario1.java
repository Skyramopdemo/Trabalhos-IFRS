public class Funcionario {
    DadosPessoais dados;
    String turno;
    String cargo;

    void modifica_cargo(String cargo){
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "dados=" + dados +
                ", turno='" + turno + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
