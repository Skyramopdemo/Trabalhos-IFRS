public class Horario {
    int hora;
    int minutos;
    int segundos;

    int contadorsec;

    void exibir(){
        System.out.println(hora+":"+minutos+":"+segundos);
    }
    public int CalcularSegundos(){
        contadorsec += hora*3600 + minutos*60 + segundos;

        return contadorsec;
    }
}
