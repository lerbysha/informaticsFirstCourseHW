package ru.kpfu.itis.fm;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.Paths;

public class ChangeDirectory extends AbsCOmmand {
    public ChangeDirectory(URI uri) {
        super(uri);
    }


    @Override
    public void execute(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("No such file or directory");
        }
        uri = Paths.get(file.getPath()).toUri().normalize();
    }
}
