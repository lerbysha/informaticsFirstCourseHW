import java.io.*;
import java.util.Scanner;

public class Application {
    private DataWriter writer;
    private DataReader reader;

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.start();
    }

    private void init() {
        writer = new DataWriter();
        reader = new DataReader();
    }

    private void start() {
        System.out.println("Enter file's name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        File source = new File(fileName);
        while (!source.exists() || source.isDirectory()) {
            System.out.println("File is directory or file not found. Enter again:");
            fileName = scanner.nextLine();
            source = new File(fileName);

        }

        NotebookManager manager = new NotebookManager(source, reader, writer);
        CommandHandler handler = new CommandHandler(manager);

        String command;
        while (!(command = scanner.nextLine()).equals("stop")) {
            handler.handle(command);
        }
    }
}