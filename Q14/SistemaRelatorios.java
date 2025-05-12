package Q14;

public class SistemaRelatorios {
    public String exportarRelatorio(ExportadorRelatorio exportador, String titulo, String conteudo) {
        return exportador.exportar(titulo, conteudo);
    }
}