import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class TextEditor implements Editor{
    List<File> fileList = new ArrayList<>();

    @Override
    public void addFile(File file) {
        this.fileList.add(file);
    }

    @Override
    public void insertLine(int lineNumber, String text) {
        for (File i : this.fileList){
            try {
                List<String> linhas = Files.readAllLines(i.toPath());
                linhas.add(lineNumber, text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void removeLine(int lineNumber) {
        for (File i : this.fileList){
            try {
                List<String> linhas = Files.readAllLines(i.toPath());
                linhas.remove(lineNumber);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
