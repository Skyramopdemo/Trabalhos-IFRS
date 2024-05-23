public class Livro{

    //Livros
    Editora editora;
    Autores_Livro autores;
    String Nome_Do_Livro;
    int Id_Do_Livro;
    String Genero;
    int Num_Pratileira;
    String Idioma;
    String Midia_Do_Livro;
    
    void Mudar_Pratileira(int Novo_Num_Pratileira){
        this.Num_Pratileira = Novo_Num_Pratileira;
    }
}