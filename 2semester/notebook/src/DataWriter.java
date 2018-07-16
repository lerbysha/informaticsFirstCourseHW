import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class DataWriter {

    public void write(File file, String line, String delimiter) throws IOException {
        Writer writer = new FileWriter(file);

        String[] elements = line.split(delimiter);
        for (String element : elements) {
            writer.write(element + "\n");
        }
        writer.close();

    }
}