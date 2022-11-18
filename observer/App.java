import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        TextEditor TE = new TextEditor();
        File f1 = new File("texto.txt");
        List<String> linhas = Files.readAllLines(f1.toPath());
        linhas.forEach(linha -> System.out.println(linha));
        System.out.println("\n\n");
        TE.addFile(f1);
        TE.removeLine(2);
        linhas.forEach(linha -> System.out.println(linha));
    }

}
