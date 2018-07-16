package ru.kpfu.itis.fm;

import java.net.URI;
import java.nio.file.Paths;
import java.util.HashMap;

public class Application {
    private static final String DEFAULT_URI = System.getProperty("user.home");
    private Reader commandReader;
    private HashMap<String, Command> commands;
    private CommandHandler commandHandler;
    private URI currentURI;

    public static void main(String[] args) {
        Application application = new Application();
        application.init();
        application.start();
    }

    private void init() {
        commandReader = new ConsoleReader();
        currentURI = Paths.get(DEFAULT_URI).toUri();
        commands = new HashMap<>();
        commands.put("ls", new Directory(currentURI));
        commands.put("cd ", new ChangeDirectory(currentURI));
        commandHandler = new CommandHandler(commands, currentURI);
    }

    private void start() {
        while (true) {
            System.out.println(Paths.get(currentURI));
            String command = commandReader.read();
            commandHandler.handle(command);
            currentURI = commandHandler.getHandledURI();
        }
    }
}
