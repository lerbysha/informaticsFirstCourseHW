package ru.kpfu.itis.fm;


import java.io.File;
import java.io.FileNotFoundException;

public interface Command {
    void execute(File file) throws FileNotFoundException;
}