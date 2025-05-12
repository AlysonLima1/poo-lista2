package Q14;

public class Main {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();

        ExportadorRelatorio pdf = new ExportadorPDF();
        ExportadorRelatorio csv = new ExportadorCSV();
        ExportadorRelatorio xml = new ExportadorXML();

        String titulo = "Vendas Mensais";
        String conteudo = "Dados de vendas do mês de abril...";

        System.out.println(sistema.exportarRelatorio(pdf, titulo, conteudo));
        System.out.println(sistema.exportarRelatorio(csv, titulo, conteudo));
        System.out.println(sistema.exportarRelatorio(xml, titulo, conteudo));
    }
}