// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Fila unicafila = Fila.getInstance();
        unicafila.ImprimeDocumento();
        unicafila.RemoveDocumento();
        unicafila.RemoveTodosDocumentos();

        Fila segundafila = Fila.getInstance();
        segundafila.ImprimeDocumento();
        segundafila.RemoveDocumento();
        segundafila.RemoveTodosDocumentos();
        }
    }
