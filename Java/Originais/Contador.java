public class Contador{

    float contador;

    void Zerar(){

        this.contador=0;

    }

    void Incrementar(float Aumento){

        this.contador += Aumento;
    }


    public float Retornar(){
        return contador;
        
    }

}