import java.util.Date;

public class RetiradaLivro {
    Livro livro;
    Date data_Retirada;
    Date data_Retorno;
    Funcionario bibliotecario;
    Aluno aluno;
    Professor professor;

    boolean possivel(){
        if (livro.midia_livro.toLowerCase().equals("físico") || livro.midia_livro.toLowerCase().equals("fisico")){
            data_Retirada = new Date();
            int dia = data_Retirada.getDay() + 7;
            data_Retorno = new Date(data_Retirada.getYear(), data_Retirada.getMonth(), dia);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "RetiradaLivro{" +
                "livro=" + livro +
                ", data_Retirada=" + data_Retirada +
                ", data_Retorno=" + data_Retorno +
                ", bibliotecario=" + bibliotecario +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
