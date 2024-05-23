public class TestInvoice {
    public static void main(String[] args) {
        Invoice in = new Invoice("Treco", "Tareco", 15, 6000.00);

        in.setDescricao_peca("Uma coisa");
        in.setPreco_item(300.00);
        in.setQuant_comprada(3);
        in.setTipo_peca("Coisa");

        System.out.println(in.getTipo_peca());
        System.out.println(in.getDescricao_peca());
        System.out.println(in.getPreco_item());
        System.out.println(in.getQuant_comprada());

        System.out.println(in.getInvoiceAmount());
    }
}
