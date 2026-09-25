void main() {

    IO.println("\n-----------------Pagamento-----------------\n");
    PagamentoPix pix = new PagamentoPix();
    pix.processarPagamento();
    IO.println("\n-----------------Pagamento-----------------\n");
    pix.processarPagamento();

    Boleto boleto = new Boleto();
    IO.println("\n-----------------Pagamento-----------------\n");
    boleto.processarPagamento();

}
