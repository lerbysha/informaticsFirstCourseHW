package ru.kpfu.itis.fm;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.Paths;
import java.util.Map;

public class CommandHandler {
    private Map<String, Command> commands;
    private URI uri;

    public CommandHandler(Map<String, Command> commands, URI uri) {
        this.commands = commands;
        this.uri = uri;
    }

    public void handle(String command) {
        for (String c : commands.keySet()) {
            if (command.startsWith(c)) {
                int index = command.indexOf(" ");
                String postfix = "\\";
                if (index > 0) {
                    postfix += command.substring(index + 1);
                }
                Command cmd = commands.get(c);
                File file = new File(Paths.get(uri).toFile().getPath() + postfix);
                try {
                    cmd.execute(file);
                    uri = Paths.get(file.getPath()).toUri().normalize();
                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                }
                return;
            }
        }
    }

    public URI getHandledURI() {
        return uri;
    }
}
