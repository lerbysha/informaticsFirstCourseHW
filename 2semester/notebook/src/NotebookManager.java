import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NotebookManager {
    private DataReader reader;
    private DataWriter writer;
    private File file;

    public NotebookManager(File file, DataReader reader, DataWriter writer) {
        this.file = file;
        this.reader = reader;
        this.writer = writer;
    }

    public String read() throws IOException {
        return reader.read(file);
    }

    public void write(String line, String delimiter) throws IOException {
        writer.write(file, line, delimiter);
    }

    public String getRecord(int num) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        for (int i = 1; scanner.hasNextLine(); i++) {
            String line = scanner.nextLine();
            if (i == num) {
                return line;
            }
        }
        throw new IllegalArgumentException(num + " record not found.");
    }

}