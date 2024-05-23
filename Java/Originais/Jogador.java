public class Jogador {
    
    public int id;
    public String nome;
    public String apelido;
    public Date datanascimento;
    public int numero;
    public String posicao;
    public int qualidade;
    public int cartoes;
    public boolean suspenso;



    void aplicarCartao(int amcontador){
        cartoes+= amcontador;

        if(cartoes==3 ){
            suspenso = true;
        }
        else{
            suspenso = false;
        }
    }
    void aplicarCartao(boolean cartvermelho){
        if(cartvermelho== true ){
            suspenso = true;
            cartoes = 3;
        }
        else{
            suspenso = false;
        }
    }

    public boolean aptoajogo(){
        if (suspenso == true){
            return false;
        }
        else{
            return true;
        }
    }
    

    void cumprirSuspencao(){

        cartoes = 0;
        suspenso = false;
    }

    public boolean equals(Object x){
        if(x==this){
            return true;
        }
        if (!(x instanceof Jogador)||x==null){
            return false;
        }
        Jogador j = (Jogador) x;
        return this.id == j.id;
    }

    public String toString(){
        return("Olá, meu nome é "+nome+" meu id é "+id+" e estou na posição "+posicao+ " numero "+numero+" está apto a jogar "+!suspenso+" Nascido em "+datanascimento.dia+"/"+datanascimento.mes+"/"+datanascimento.ano+" com a qualidade "+qualidade);
    }


}
