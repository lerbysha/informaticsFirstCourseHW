import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StudentIODemo {
    private static final File file = new File("resources/student.txt");
    private static List<Student> students = new ArrayList<>();
    private static Logger logger = Logger.getLogger(StudentIODemo.class.getName());

    static {
        try {
            InputStream is = new FileInputStream("logging.properties");
            LogManager.getLogManager().readConfiguration(is);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Configuration loading error", ex);
        }

    }

    public static void main(String[] args) {
        students.add(new Student("WIlliam", true, (byte) 10));
        students.add(new Student("Morrey", false, (byte) 122));
        students.add(new Student("Pingvin", true, (byte) 10));

        try {
            StudentOutputStream sos = new StudentOutputStream(new FileOutputStream(file));
            for (Student student : students) {
                sos.writeStudent(student);
            }
            sos.close();

            StudentInputStream sis = new StudentInputStream(new FileInputStream(file));
            Student student;
            while ((student = sis.readStudent()) != null) {
                System.out.println(student);
            }
            sis.close();


        } catch (IOException e) {
            logger.log(Level.WARNING, "IOException: ", e);
        }
        logger.finest("ok!");

    }
}