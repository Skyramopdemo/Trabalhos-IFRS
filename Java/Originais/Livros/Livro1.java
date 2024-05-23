public class Livro{

    //Livros
    private String editora;
    private String autores;
    private String Nome_Do_Livro;
    private int Id_Do_Livro;
    private String Genero;
    private int Num_Pratileira;
    private String Idioma;
    private String Midia_Do_Livro;
    
    void Mudar_Pratileira(int Novo_Num_Pratileira){
        this.Num_Pratileira = Novo_Num_Pratileira;
    }

    public Livro(String autor, String Nome_Livro, int id_livro, int num_prat){
        this.autores = autor;
        this.Nome_Do_Livro = Nome_Livro;
        this.Id_Do_Livro = id_livro;
        this.Num_Pratileira = num_prat;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Nome=" + Nome_Do_Livro +
                ", Genero='" + Genero + '\'' +
                ", Númeoro da Pratilheira='" + Num_Pratileira + '\'' +
                ", Idioma='" + Idioma + '\'' +
                ", Midia do Livro='" + Midia_Do_Livro + '\'' +
                '}';
    }

    public String getEditora(){
        return editora;
    }

    public String getAutores(){
        return autores;
    }

    public String getNome_Livro(){
        return Nome_Do_Livro;
    }

    public int getId_Livro(){
        return Id_Do_Livro;
    }

    public String getGenero(){
        return Genero;
    }

    public int getNum_Pratileira(){
        return Num_Pratileira;
    }

    public String getIdioma(){
        return Idioma;
    }

    public String getMidia(){
        return Midia_Do_Livro;
    }



    public void setEditora(String edit){
        editora=edit;
    }

    public void setAutores(String aut){
        autores = aut;
    }

    public void setNome_Livro(String nlivro){
        Nome_Do_Livro=nlivro;
    }

    public void setId_Livro(int idl){
        Id_Do_Livro = idl;
    }

    public void setGenero(String gene){
        Genero = gene;
    }

    public void setNum_Pratileira(int gene){
        Num_Pratileira = gene;
    }

    public void setIdioma(String idm){
        Idioma = idm;
    }

    public void getMidia(String medi){
        Midia_Do_Livro = medi;
    }

    public boolean equals(Object x){
        if(x==this){
            return true;
        }
        if (!(x instanceof Livro)||x==null){
            return false;
        }
        Livro lr = (Livro) x;
        return this.Id_Do_Livro == lr.Id_Do_Livro;
    }
}