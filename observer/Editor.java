import java.io.File;

public interface Editor {
    public void insertLine(int lineNumber, String text);
    public void removeLine(int lineNumber);
    public void addFile(File file);
}
