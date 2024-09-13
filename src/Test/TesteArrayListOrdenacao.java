package Test;

import Comparator.PrecoProdutoComparator;
import Model.Produto;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayListOrdenacao {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Marcelo");
        nomes.add("Vanessa");

        Collections.sort(nomes);
        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println("-----------------------------");

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Celular",1999.90);
        Produto p2 = new Produto("Geladeira",2499);
        Produto p3 = new Produto("Notebook",3000);
        Produto p4 = new Produto("Armário",15000);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        produtos.sort(new PrecoProdutoComparator());

        for(Produto produto : produtos ){
            System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco());
        }
    }
}

