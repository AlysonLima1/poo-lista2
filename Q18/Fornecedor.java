package Q18;

import java.util.ArrayList;

public class Fornecedor implements Fornecimento {
    private String nome;
    private ArrayList<Produto> produtosFornecidos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtosFornecidos = new ArrayList<>();
    }

    @Override
    public boolean fornecerProduto(Produto produto) {
        produtosFornecidos.add(produto);
        return true;
    }

    public void adicionarProduto(Produto produto) {
        produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        if (produtosFornecidos.isEmpty()) {
            return nome + " não fornece nenhum produto.";
        }

        StringBuilder sb = new StringBuilder("Produtos fornecidos por " + nome + ":\n");
        for (Produto p : produtosFornecidos) {
            sb.append("- ").append(p.getDescricaoComDesconto()).append("\n");
        }
        return sb.toString();
    }
}