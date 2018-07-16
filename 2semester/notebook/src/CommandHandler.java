import java.io.IOException;
import java.util.Scanner;

public class CommandHandler {
    private NotebookManager notebookManager;

    public CommandHandler(NotebookManager notebookManager) {
        this.notebookManager = notebookManager;
    }

    public void handle(String command) {
        Scanner scanner = new Scanner(System.in);
        try {
            switch (command) {
                case "write":
                    System.out.println("Enter records: ");
                    notebookManager.write(scanner.nextLine(), ",");
                    break;
                case "read":
                    System.out.println(notebookManager.read());
                    break;
                case "record":
                    int num = Integer.parseInt(scanner.nextLine());
                    System.out.println(notebookManager.getRecord(num));
                    break;
                default:
                    System.out.println("Command not found");
            }
        } catch (IOException ex) {
            System.err.println("");
        } catch (IllegalArgumentException ex) {
            System.err.println("Line with this number not found.");
        }
    }
}