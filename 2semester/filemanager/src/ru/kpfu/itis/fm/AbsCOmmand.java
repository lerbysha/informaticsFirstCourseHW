package ru.kpfu.itis.fm;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;

public abstract class AbsCOmmand implements Command {
    protected URI uri;

    protected AbsCOmmand(URI uri) {
        this.uri = uri;
    }

    @Override
    public abstract void execute(File file) throws FileNotFoundException;

}