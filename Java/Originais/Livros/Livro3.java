public class Livro {
    String nome_Livro;
    int cod_Livro;
    String midia_livro;
    String idioma_livro;
    Autor autor;
    String editora_livro;
    int ano_edição;


    @Override
    public String toString() {
        return "Livro{" +
                "nome_Livro='" + nome_Livro + '\'' +
                ", cod_Livro=" + cod_Livro +
                ", midia_livro='" + midia_livro + '\'' +
                ", idioma_livro='" + idioma_livro + '\'' +
                ", autor=" + autor +
                ", editora_livro='" + editora_livro + '\'' +
                ", ano_edição=" + ano_edição +
                '}';
    }
}
