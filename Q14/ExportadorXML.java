package Q14;

public class ExportadorXML implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) {
        return "Relatório exportado em XML: " + titulo;
    }
}