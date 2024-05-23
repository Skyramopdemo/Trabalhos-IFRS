public class Invoice{
    private String tipo_peca;
    private String descricao_peca;
    private int quant_comprada;
    private double preco_item;

    public Invoice(String tipo_peca, String descricao_peca, int quant_comprada, double preco_item){
        this.tipo_peca = tipo_peca;
        this.descricao_peca = descricao_peca;
        setQuant_comprada(quant_comprada);
        setPreco_item(preco_item);
    }

    public String getTipo_peca(){
        return tipo_peca;
    }
    public void setTipo_peca(String tipo_peca){
        this.tipo_peca = tipo_peca;
    }

    public String getDescricao_peca(){
        return descricao_peca;
    }
    public void setDescricao_peca(String descricao_peca){
        this.descricao_peca = descricao_peca;
    }
    
    public int getQuant_comprada(){
        return quant_comprada;
    }
    public void setQuant_comprada(int quant_comprada){
        if (quant_comprada < 0){
            quant_comprada = 0;
        }
        else
            this.quant_comprada = quant_comprada;
    }
    
    public double getPreco_item(){
        return preco_item;
    }
    public void setPreco_item(double preco_item){
        if (preco_item < 0.0){
            this.preco_item = 0.0;
        }
        else
            this.preco_item = preco_item;
    }

    public double getInvoiceAmount(){
    
        double valor = preco_item * quant_comprada;
        return valor;
    }

    public boolean equals(Object x){
        if(x==this){
            return true;
        }
        if (!(x instanceof Invoice)||x==null){
            return false;
        }
        Invoice in = (Invoice) x;
        return this.descricao_peca == in.descricao_peca;
    }

    public String toString(){
        return("A peça do tipo"+tipo_peca+" "+descricao_peca+"foi comprada na quantidade: "+quant_comprada+"ao preço unitário de"+preco_item);
    }
}