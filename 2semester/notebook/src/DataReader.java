import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class DataReader {

    public String read(File file) throws IOException {
        List<String> list = Files.readAllLines(file.toPath());

        StringBuilder result = new StringBuilder();
        list.forEach(line -> result.append("\n" + line));
        return new String(result);
    }
}