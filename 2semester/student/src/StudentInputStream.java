import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class StudentInputStream extends InputStream {
    private final DataInputStream inputStream;

    public StudentInputStream(InputStream inputStream) {
        this.inputStream = new DataInputStream(inputStream);
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }

    public Student readStudent() throws IOException {
        try {
            String name = inputStream.readUTF();
            boolean male = inputStream.readBoolean();
            byte age = inputStream.readByte();
            return new Student(name, male, age);

        } catch (EOFException e) {
            return null;
        }
    }
}