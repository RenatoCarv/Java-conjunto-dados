package Comparator;

import Model.Produto;

import java.util.Comparator;

public class PrecoProdutoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return (int) (p1.getPreco() - p2.getPreco());
    }
}
