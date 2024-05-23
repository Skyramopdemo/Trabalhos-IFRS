public class Date {
    private int mes;
    private int dia;
    private int ano;

    public Date(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String displayDate(){
        return(mes+"/"+dia+"/"+ano+" formato mes/dia/ano");
    }
    
    public boolean equals(Object x){
        if(x==this){
            return true;
        }
        if (!(x instanceof Date)||x==null){
            return false;
        }
        Date da = (Date) x;
        return this.dia == da.dia;
    }
}
