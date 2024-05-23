public class Pessoa {
    
    Pessoa pai;
    Pessoa mae;
    Nome nome;



    public boolean TesteSemantico(Pessoa p2){
        
        if(this.nome.equals(p2.nome) && this.mae.nome.equals(p2.mae.nome)){
            return true;    
        }
        else{
            return false;
        }
    }

    public boolean EhIrmao(Pessoa p2){
        if(!this.nome.equals(p2.nome) && this.mae.nome.equals(p2.mae.nome)){
            return true;
        }    
        else{
            return false;
        }
    }


    public boolean EhAntecessor(Pessoa p2){
        if(this.nome.Sobrenome.equals(p2.pai.nome.Sobrenome)||this.nome.Sobrenome.equals(p2.mae.nome.Sobrenome)||this.nome.Sobrenome.equals(p2.pai.pai.nome.Sobrenome)||this.nome.Sobrenome.equals(p2.pai.mae.nome.Sobrenome)||this.nome.Sobrenome.equals(p2.mae.pai.nome.Sobrenome)||this.nome.Sobrenome.equals(p2.mae.mae.nome.Sobrenome)){
            return true;
        }
        else{
            return false;
        }
    }




}
