package Q18;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("TechFornece");

        Produto tv = new Eletronico("Smart TV", 3000);
        Produto arroz = new Alimento("Arroz 5kg", 25);
        Produto camisa = new Vestuario("Camisa Polo", 120);

        fornecedor.fornecerProduto(tv);
        fornecedor.fornecerProduto(arroz);
        fornecedor.fornecerProduto(camisa);

        System.out.println(fornecedor.listarProdutosFornecidos());
    }
}