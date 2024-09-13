package Test;

import Model.Produto;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[4];

        produtos[0] = new Produto("Iphone 16", 8900.99);
        produtos[1] = new Produto("Notebook I7", 4000.00);

        System.out.println(produtos[1].getNome());

        for(int i = 0; i < produtos.length; i++){
            System.out.println("Produto: " + produtos[i].getNome() + ", Preço: " + produtos[i].getPreco());
        }
    }
}
