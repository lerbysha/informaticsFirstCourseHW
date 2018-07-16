import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StudentOutputStream extends OutputStream {
    private final DataOutputStream outputStream;

    public StudentOutputStream(OutputStream outputStream) {
        this.outputStream = new DataOutputStream(outputStream);
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    public void writeStudent(Student student) throws IOException {
        outputStream.writeUTF(student.getName());
        outputStream.writeBoolean(student.isMale());
        outputStream.writeByte(student.getAge());
        outputStream.flush();
    }
}