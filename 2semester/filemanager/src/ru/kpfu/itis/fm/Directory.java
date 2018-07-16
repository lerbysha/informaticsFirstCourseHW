package ru.kpfu.itis.fm;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Arrays;


public class Directory extends AbsCOmmand {
    public Directory (URI uri) {
        super(uri);
    }

    @Override
    public void execute(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw  new FileNotFoundException("No such file or directory");
        }
        if (file.isDirectory()) {
            getSubdirList(file);
        }
        if (file.isFile()) {
            getFileInfo(file);
        }
    }

    private void getFileInfo(File file) {
        System.out.println("Name: " + file.getName());
        System.out.println("Executable: " + file.canExecute());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Usable space: " + file.getUsableSpace());
    }

    private void getSubdirList(File file) {
        Arrays.stream(file.listFiles()).forEach(f -> System.out.println(f.getName()));
    }
}