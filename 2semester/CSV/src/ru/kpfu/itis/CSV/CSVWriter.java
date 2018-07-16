package ru.kpfu.itis.CSV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CSVWriter {

    public void write(File file, CSVData data) throws IOException {
        Writer writer = new FileWriter(file);
        writer.write(data.toString());
        writer.close();
    }
}