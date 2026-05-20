void main() {
    Transportadora transportadora = new Transportadora();
    Loja lojaPix = new LojaPix(transportadora);
    Loja lojaCripto  = new LojaCripto(transportadora);
    String endereco = "Bairro:sacmom Rua:amfkjfd sjk Numero:32";
    String string;

    Produto produto1 = new Produto(new BigDecimal("102.10"), "Azul", "abc");
    Produto produto2 = new Produto(new BigDecimal("252.32"), "Vermelho", "abc");
    Servico servico1 = new Servico(new BigDecimal("2321.00"), 12, "assfdadscacsfe");
    Servico servico2 = new Servico(new BigDecimal("154.00"), 4, "assfdadscacsfe");
    Livro livro = new Livro(new BigDecimal("37.99"), "Red", "fwfesd", 260, (float) 1.8 );
    Carro carro = new Carro(new BigDecimal("22430.00"), "Green", "wqdwqd");

    List<Vendavel> itens = List.of(
            produto1,
            produto2,
            servico1,
            servico2,
            livro,
            carro
    );

    for (Vendavel item : itens){
        if(item!=produto2 && item!=servico2){
            string = lojaCripto.cadastrar(item);
            System.out.println(string);
        }
        if(item!=produto1 && item!=servico1) {
            string = lojaPix.cadastrar(item);
            System.out.println(string+"\n");
        }
    }

    System.out.println("\n");

    for (Vendavel item : itens){
        string = lojaCripto.vender(item, endereco);
        System.out.println(string);
        string = lojaPix.vender(item, endereco);
        System.out.println(string+"\n");
    }

}
